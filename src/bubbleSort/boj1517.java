// 문제 출처 : https://www.acmicpc.net/problem/1517

package bubbleSort;

import java.util.Scanner;

public class boj1517 {
	
	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	static int bubbleSort(int[] a) {
		int count = 0;
		for(int i=a.length-1; i>=1; i--) {
			for(int j=0; j<i; j++) {
				if(a[j] > a[j+1]) {
					count++;
					swap(a, j, j+1);
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] arr = new int[length];
		
		for(int i=0; i<length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(bubbleSort(arr));
	}

}
