// 문제 출처 : https://www.acmicpc.net/problem/11651

package bubbleSort;

import java.util.Scanner;

public class boj11651 {

	// 배열 a에서 i 위치와 j 위치의 값을 서로 바꾼다
	static void swap(int[][] a, int i, int j) {
		int temp = a[i][0];
		int temp2 = a[i][1];
		a[i][0] = a[j][0];
		a[i][1] = a[j][1];
		a[j][0] = temp;
		a[j][1] = temp2;
	}
	
	// bubble sort
	static void bubbleSort(int[][] a) {
		for(int i=a.length-1; i>=1; i--) {
			boolean finished = true;
			for(int j=0; j<i; j++) {
				if(a[j][0] > a[j+1][0]) {
					swap(a, j, j+1);
					finished = false;
				} else if(a[j][0] == a[j+1][0]) {
					if(a[j][1] > a[j+1][1]) {
						swap(a, j, j+1);
						finished = false;
					}
				}
			}
			if(finished) break;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[][] arr = new int[length][2];
		
		for(int i=0; i<length; i++) {
			for(int j=0; j<2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		bubbleSort(arr);
		
		for(int i=0; i<length; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
