package com.java.myapp;

import java.util.Arrays;
import java.util.Random;

public class Quickaa {


	   public static void populateArray(int[] B) { //��ҧ�ԧ��Ҵ�ҡ   int A[] = new int[100];
	        for (int i = 0; i < B.length; i++) {
	            B[i] = (int) (Math.random() * 100); //������� 0-99
	           

	            
	        }
	   }
		private static Object random() {
			return null;
		}

		public static void quickSort(int[] arr, int low, int high) {
			 
			if (arr == null || arr.length == 0)
				return;
	 
			if (low >= high)
				return;

			int middle = low + (high - low) / 2;
			int pivot = arr[middle];

			int i = low, j = high;
			while (i <= j) {
				while (arr[i] < pivot) {
					i++;
				}
	 
				while (arr[j] > pivot) {
					j--;
				}
	 
				if (i <= j) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					i++;
					j--;
				}
			}
			if (low < j)
				quickSort(arr, low, j);
	 
			if (high > i)
				quickSort(arr, i, high);
		}
	 
		public static void printArray(int[] x) {
			  System.out.println(Arrays.toString(x));
		}
	}




