package gui;


	import java.util.Arrays;
	public class Insertion {
	    public static void main(String[] args) {
	        int A[] = new int[100]; // กำหนดขนาดarray  ในชื่อ A ขนาด 100 
	        populateArray(A); //เรียกใช้ เมทอธ populateArray กำหนดให้A คือค่าที่สุ่ม ซึ่งส่งมาจาก populateArray
	        System.out.println("Before Sorting: ");
	        printArray(A);  //เรียกใช้ เมทอธ printArray ก่อน จัด
	        // sort the array
	        insertionSort(A); //ส่งค่าไปให้ insertionSort
	        System.out.println("\nAfter Sorting: "); 
	        printArray(A); //หลังจัด
	    }
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
	 


	    public static void printArray(int[] B) { // ดึงมาจาก populateArray 
	        System.out.println(Arrays.toString(B)); //แสดงค่า array อ้างอิงจาก int[] B
	    }
	    public static void populateArray(int[] B) { //อ้างอิงขนาดจาก   int A[] = new int[100];
	        for (int i = 0; i < B.length; i++) {
	            B[i] = (int) (Math.random() * 100); //สุ่มค่า 0-99
	            
	        }
	    }
	}



