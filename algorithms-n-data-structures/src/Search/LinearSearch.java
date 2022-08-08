package Search;

public class LinearSearch {

	public static void main(String[] args) {
		System.out.println(linearSearch(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, 5));
	}
	public static int linearSearch(int[] A, int k) {
		for(int i = 0; i < A.length; i++) {
			if(A[i] == k) {
				return i;
			}
		}
		return -1;
	}
}
