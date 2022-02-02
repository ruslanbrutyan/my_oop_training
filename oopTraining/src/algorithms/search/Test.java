package algorithms.search;

public class Test {
	public static void main(String[] args) {
		
		
		int arr[]= new int[10000];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i;
		}
		int searchElement = 48;
		Search search = new InterpolationSearch();
		System.out.println("index of "+searchElement+" is "+search.searchIndex(arr, searchElement));
		
	}

}
