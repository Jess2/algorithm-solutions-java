// 문제 출처 : https://www.acmicpc.net/problem/1377

package bubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class boj1377 {
	
	// 배열 a에서 i 위치와 j 위치의 값을 서로 바꾼다
	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	// bubble sort
	static int bubbleSort(int[] a) {
		boolean change = false;
		int i;
		for(i=a.length-1; i>=1; i--) {
			change = false;
			
			for(int j=0; j<i; j++) {
				if(a[j] > a[j+1]) {
					change = true;
					swap(a, j, j+1);
				}
			}
			if(!change) break;
		}
		
		return i+1;
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
