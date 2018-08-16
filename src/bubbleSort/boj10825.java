// 문제 출처 : https://www.acmicpc.net/problem/10825

package bubbleSort;

import java.util.Scanner;

public class boj10825 {

	// 배열 a에서 i 위치와 j 위치의 값을 서로 바꾼다
	static void swap(String[][] a, int i, int j) {
		String[] tempArr = new String[4];
		tempArr = a[i];
		a[i] = a[j];
		a[j] = tempArr;
	}
	
	// bubble sort
	static void bubbleSort(String[][] a) {
		for(int i=a.length-1; i>=1; i--) {
			for(int j=0; j<i; j++) {
				if(Integer.parseInt(a[j][1]) < Integer.parseInt(a[j+1][1])) {
					swap(a, j, j+1);
				} else if(Integer.parseInt(a[j][1]) == Integer.parseInt(a[j+1][1])) {
					if(Integer.parseInt(a[j][2]) > Integer.parseInt(a[j+1][2])) {
						swap(a, j, j+1);
					} else if(Integer.parseInt(a[j][2]) == Integer.parseInt(a[j+1][2])) {
						if(Integer.parseInt(a[j][3]) < Integer.parseInt(a[j+1][3])) {
							swap(a, j, j+1);
						} else if(Integer.parseInt(a[j][3]) == Integer.parseInt(a[j+1][3])) {
							if(a[j][0].compareTo(a[j+1][0]) > 0) {
								swap(a, j, j+1);
							}
						}
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		
		String[][] arr = new String[length][4];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.next();
			}
		}
		
		bubbleSort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i][0]);
		}

	}

}
