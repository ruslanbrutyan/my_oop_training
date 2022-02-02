package algorithms.search;

public class BinarySearch implements Search{

	@Override
	public int searchIndex(int[] arr, int x) {
		int left = 0;
		int rigth =arr.length;
		while(left<rigth) {
			int middle = left+(rigth-left)/2;			
			if(arr[middle]==x) {
				return middle;	
			}else if(arr[middle]>x){
				rigth = middle;
			}else if(arr[middle]<x){
				left=middle;	
			}
		}
		return -1;
	}

}
