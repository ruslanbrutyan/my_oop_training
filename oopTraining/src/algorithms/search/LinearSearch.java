package algorithms.search;

public class LinearSearch implements Search {

	public int searchIndex(int arr[],int x) {
//		for(int i = 0 ; i < arr.length ; i++) {
//			if(arr[i]==x) {
//				return i;
//			}
//		}
//		return -1;
		int left =0;
		int right =arr.length-1;
		for( ;left<=right ;){
			if(arr[left]==x) {
				return left;
			}else if(arr[right]==x) {
				return right;
			}
			left++;
			right--;
		}
		return -1;
	}
}