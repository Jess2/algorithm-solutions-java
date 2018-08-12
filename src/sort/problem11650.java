// 문제 출처 : https://www.acmicpc.net/problem/11650

package sort;

import java.util.Scanner;
import java.util.Arrays;

public class problem11650 {
	
	// 배열 a에서 i 위치와 j 위치의 값을 서로 바꾼다.
	static void swap(int[][] a, int i, int min) {
		int temp1 = a[i][0];
		int temp2 = a[i][1];
		a[i][0] = a[min][0];
		a[i][1] = a[min][1];
		a[min][0] = temp1;
		a[min][1] = temp2;
	}
	
	// 배열 a의 start 위치부터 끝까지에서 가장 작은 값의 위치를 리턴한다.
	static int findMin(int[][] a, int start) {
		int minIndex = start;
		for(int i=start; i<a.length; i++) {
			if(a[i][0] < a[minIndex][0]) {
				minIndex = i;
			} else if(a[i][0] == a[minIndex][0]) {
				if(a[i][1] < a[minIndex][1]) {
					swap(a, i, minIndex);
				}
			}
		}
		return minIndex;
	}
	
	// 선택 정렬
	static void selectionSort(int[][] a) {
		for(int i=0; i<a.length-1; i++) {
			int minIndex = findMin(a, i);
			swap(a, i, minIndex);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] arr = new int[num][2];
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		selectionSort(arr);

		for(int i=0; i<num; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
