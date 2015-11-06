package com.java.myapp;


	import java.util.Arrays;
	public class Insertion {
	  
	    public static void insertionSort(int[] arr) { //วิธีจัดเรียงแบบ Insertion
	        for (int i = 1; i < arr.length; i++) { 
	            int valueToSort = arr[i]; //เก็บค่าข้อมูลไว้ไล่เทียบหาตำแหน่ง  
	            int j = i;
	            while (j > 0 && arr[j - 1] > valueToSort) {
	            	 //ใน loop while นี้ จะเป็นการหาตำแหน่งที่จะทำการแทรกข้อมูลลงไป  
	                arr[j] = arr[j - 1]; //แทรกข้อมูลเข้าลงไปตามจุดที่กำหนดคือ ที่ค่า j-1  
	                j--;
	            }
	            arr[j] = valueToSort; //ทำการ Shift ข้อมูล  
	        }
	    }
	 
	 

	    public static void populateArray(int[] B) { //อ้างอิงขนาดจาก   int A[] = new int[100];
	        for (int i = 0; i < B.length; i++) {
	            B[i] = (int) (Math.random() * 100); //สุ่มค่า 0-99
	            
	        }
	    }
	}



