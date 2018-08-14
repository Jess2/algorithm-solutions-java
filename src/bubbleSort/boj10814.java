// 문제 출처 : https://www.acmicpc.net/problem/10814

package bubbleSort;

import java.util.Scanner;

public class boj10814 {
	
	static void swap(String[][] a, int i, int j) {
		String temp = a[i][0];
		String temp2 = a[i][1];
		a[i][0] = a[j][0];
		a[i][1] = a[j][1];
		a[j][0] = temp;
		a[j][1] = temp2;
	}
	
	static void bubbleSort(String[][] a) {
		for(int i=a.length-1; i>=1; i--) {
			for(int j=0; j<i; j++) {
				if(Integer.parseInt(a[j][0]) > Integer.parseInt(a[j+1][0])) {
					System.out.println("swap");
					swap(a, j, j+1);
				}
			}
		}
 	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		String[][] arr = new String[length][2];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.next();
			}
		}
		
		bubbleSort(arr);

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
