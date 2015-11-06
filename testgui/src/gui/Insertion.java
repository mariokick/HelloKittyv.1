package gui;


	import java.util.Arrays;
	public class Insertion {
	    public static void main(String[] args) {
	        int A[] = new int[100]; // ��˹���Ҵarray  㹪��� A ��Ҵ 100 
	        populateArray(A); //���¡�� ���͸ populateArray ��˹����A ��ͤ�ҷ������ ������Ҩҡ populateArray
	        System.out.println("Before Sorting: ");
	        printArray(A);  //���¡�� ���͸ printArray ��͹ �Ѵ
	        // sort the array
	        insertionSort(A); //�觤������ insertionSort
	        System.out.println("\nAfter Sorting: "); 
	        printArray(A); //��ѧ�Ѵ
	    }
	    public static void insertionSort(int[] arr) { //�ԸըѴ���§Ẻ Insertion
	        for (int i = 1; i < arr.length; i++) { 
	            int valueToSort = arr[i]; //�纤�Ң�������������º�ҵ��˹�  
	            int j = i;
	            while (j > 0 && arr[j - 1] > valueToSort) {
	            	 //� loop while ��� ���繡���ҵ��˹觷��зӡ���á������ŧ�  
	                arr[j] = arr[j - 1]; //�á���������ŧ仵���ش����˹���� ����� j-1  
	                j--;
	            }
	            arr[j] = valueToSort; //�ӡ�� Shift ������  
	        }
	    }
	 


	    public static void printArray(int[] B) { // �֧�Ҩҡ populateArray 
	        System.out.println(Arrays.toString(B)); //�ʴ���� array ��ҧ�ԧ�ҡ int[] B
	    }
	    public static void populateArray(int[] B) { //��ҧ�ԧ��Ҵ�ҡ   int A[] = new int[100];
	        for (int i = 0; i < B.length; i++) {
	            B[i] = (int) (Math.random() * 100); //������� 0-99
	            
	        }
	    }
	}



