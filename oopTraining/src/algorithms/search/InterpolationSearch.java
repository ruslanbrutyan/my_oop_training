package algorithms.search;

public class InterpolationSearch implements Search{

	@Override
	public int searchIndex(int[] arr, int x) {
		int left = 0;
		int rigth =arr.length-1;
		while(left<rigth) {
			System.out.println("x");
			int pos = left+(rigth-left)*(x- arr[left])/(arr[rigth]-arr[left]);			
			if(arr[pos]==x) {
				return pos;	
			}else if(arr[pos]>x){
				rigth = pos;
			}else if(arr[pos]<x){
				left=pos;	
			}
		}
		return -1;
	}
}
