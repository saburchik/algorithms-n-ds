package Search;

public class BinarySearch {

	public static void main(String[] args) {
		System.out.println(binarySearch(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, 11));
	}
	public static int binarySearch(int[] a, int key) {
		int low = 0;
		int high = a.length - 1;
		
		while(low <= high) {
			int middle = low + (high - low) / 2;
			
			if(key < a[middle]) {
				high = middle - 1;
			} else if (key > a[middle]) {
				low = middle + 1;
			} else {
				return middle;			}
		}
		return -1;
	}
}
