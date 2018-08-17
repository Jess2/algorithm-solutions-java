// 삽정렬 
// 시간복잡도 : 최선 O(n), 평균 O(n^2), 최악 O(n^2)

package insertionSort;

import java.util.Arrays;

public class basic {
	
	static void insertionSort(int[] a) {
		for(int i=1; i<a.length; i++) {
			int value = a[i]; // 삽입할 값 보관 
			int j;
			for(j=i-1; j>=0; j--) { // 뒤로 이동 
				if(a[j] > value) {
					a[j+1] = a[j];
				} else {
					break;
				}
			}
			a[j+1] = value; // 값 삽입     
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {7, 9, 5, 3, 1};
		
		insertionSort(a);
		System.out.println(Arrays.toString(a));

	}
}