package algorithms.search;

public class JumpSearch implements Search {

	@Override
	public int searchIndex(int[] arr, int x) {
		int step = (int) Math.floor(Math.sqrt(arr.length));
		int left = 0;
//		{1,2,3,4,5,6,7,8,9}
		for (int i = 0; i < arr.length; i += step) {
			if (arr[i] == x) {
				return i;
			} else if (arr[i] < x) {
				left += step;
			} else {
				left -= step;
				break;
			}
		}
		if (arr.length - 1 < left) {
			left -= step;
		}
		for (int i = 1; 1 + left < arr.length; i++) {
			if (arr[left + i] == x) {

				return left + i;
			}
		}
		return -1;

	}
}