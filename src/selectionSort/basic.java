// 선택정렬
// 시간복잡도 : 최선 O(n^2), 평균 O(n^2), 최악 O(n^2)

package selectionSort;

import java.util.Arrays;

public class basic {
	
	// 배열 a에서 i 위치와 j 위치의 값을 서로 바꾼다.
	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	// 배열 a의 start 위치부터 끝까지에서 가장 작은 값의 위치를 리턴한다.
	static int findMin(int[] a, int start) {
		int minIndex = start;
		for(int i=start; i<a.length; i++) {
			if(a[i] < a[minIndex]) {
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	// 선택 정렬
	static void selectionSort(int[] a) {
		for(int i=0; i<a.length-1; i++) {
			int minIndex = findMin(a, i);
			swap(a, i, minIndex);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = { 31, 2, 4, 32, 5 };
		
		selectionSort(a);
		System.out.println(Arrays.toString(a));

	}

}