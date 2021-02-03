package com.jin.sort;

import java.util.Arrays;

public class ShellSort {
	
	public static void intervalSort(int a[], int begin, int end, int interval) {
		// ���� ���� ����
		int j;
		for(int i=begin+interval; i<=end; i=i+interval) {
			// 0+5 = 5 			; 5<=9	; 5 = 5+5;
			// 0+2 = 2 			; 2<=9	; 2 = 2+2;
			// 0+1 = 1			; 1<=9	; 1 = 1+1;
			int item = a[i]; // Ű�� �ι�° �ڷ���� �����Ѵ�.
			
			for(j = i-interval; j>=begin && item<a[j]; j=j-interval) {
				// 2 = 3-1	;	>=0 && 4��°�ڷ�<����°�ڷ�; 1 = 2-1
				// 1 = 2-1	;	>=0 && 3��°�ڷ�<�ι�°�ڷ� ; 0 = 1-1
				a[j+interval] = a[j];
				//�׹�°�ڷ�		����°�ڷ�
			}
			
			a[j+interval] = item;
		}
	}
	
	public static void shellSort(int a[], int size) {
		System.out.println("������ ���� :"+Arrays.toString(a));
		System.out.println("-----------------�� ���� ���� ----------------");
		int interval = size/2;
		while(interval >= 1) { // ������ 1�� ������ �������� ����
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
