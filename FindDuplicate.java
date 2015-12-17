public class FindDuplicate {
	public static void main(String[] args) {
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("\nEnter the maximum value n for the range of numbers: ");
		int n = kb.nextInt();
		System.out.println("\n");
		int[] nums = new int[n + 1];
		int rand = (int)(Math.random() * nums.length / 2) + nums.length / 2;
		for (int i = 0; i < nums.length; i++) {
			if (i == rand) {
				nums[i] = nums[nums.length - i];
				System.out.print(nums[i] + " ");
				continue;
			}
			do {
				nums[i] = (int)(Math.random() * n) + 1;
			} while (found(nums[i], nums, i));
			System.out.print(nums[i] + " ");
			if (i % 20 == 19) System.out.println("\n");
		}
		System.out.println("\n\nThe duplicated number is " + findDup(nums));
	}

	public static int findDup(int[] vals) {
		int sum = 0;
		for (int i : vals) {
			sum += i;
		}
		int n = vals.length - 1;
		return (sum - n * (n + 1) / 2);
	}

	public static boolean found(int val, int[] arr, int ind) {
		for (int k = 0; k < ind; k++) {
			if (arr[k] == val) return true;
		}
		return false;
	}
}