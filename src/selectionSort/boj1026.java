// 문제 출처 : https://www.acmicpc.net/problem/1026

package selectionSort;

import java.util.Scanner;

public class boj1026 {
	
	// 배열 a에서 i 위치와 j 위치의 값을 서로 바꾼다.
	static void swap(int[] a, int i, int min) {
		int temp = a[i];
		a[i] = a[min];
		a[min] = temp;
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
	
	// 배열 순서 거꾸로
	static int[] reverseArray(int[] a) {
		int[] temp = new int[a.length];
		for(int i=0; i<a.length; i++) {
			temp[i] = a[a.length-i-1];
		}
		return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] A = new int[length];
		int[] B = new int[length];
		int[] B_temp = new int[length];
		
		for(int i=0; i<length; i++) {
			A[i] = sc.nextInt();
		}
		
		for(int i=0; i<length; i++) {
			B[i] = sc.nextInt();
		}
		
		B_temp = B;
		
		selectionSort(A);
		A = reverseArray(A);
		selectionSort(B_temp);
		
		int result = 0;
		
		for(int i=0; i<length; i++) {
			result += A[i]*B[i];
		}
		
		System.out.println(result);

	}

}
