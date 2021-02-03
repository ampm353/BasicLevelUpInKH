package com.jin.sort;

import java.util.Arrays;

public class ShellSort {
	
	public static void intervalSort(int a[], int begin, int end, int interval) {
		// 삽입 정렬 수행
		int j;
		for(int i=begin+interval; i<=end; i=i+interval) {
			// 0+5 = 5 			; 5<=9	; 5 = 5+5;
			// 0+2 = 2 			; 2<=9	; 2 = 2+2;
			// 0+1 = 1			; 1<=9	; 1 = 1+1;
			int item = a[i]; // 키는 두번째 자료부터 시작한다.
			
			for(j = i-interval; j>=begin && item<a[j]; j=j-interval) {
				// 2 = 3-1	;	>=0 && 4번째자료<세번째자료; 1 = 2-1
				// 1 = 2-1	;	>=0 && 3번째자료<두번째자료 ; 0 = 1-1
				a[j+interval] = a[j];
				//네번째자료		세번째자료
			}
			
			a[j+interval] = item;
		}
	}
	
	public static void shellSort(int a[], int size) {
		System.out.println("정렬한 원소 :"+Arrays.toString(a));
		System.out.println("-----------------셸 정렬 수행 ----------------");
		int interval = size/2;
		while(interval >= 1) { // 간격이 1일 때까지 삽입정렬 수행
			for(int i=0; i<interval; i++) {
				intervalSort(a, i, size-1, interval);
			}
			System.out.println("interval = "+interval);
			for(int t=0; t<size; t++) {
				System.out.print(a[t]+" ");
			}
			System.out.println();
			interval = interval/2;
		}
	}
	
	public static void main(String[] args) {
		int[] list = {16, 7, 30, 3, 69, 9, 31, 23};
		int size = list.length;
		shellSort(list,size);
	}
}
