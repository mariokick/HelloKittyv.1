package ���ͺ;
import java.util.Scanner;
public class ���� {
	public static void main(String[] args) {
	int [] a ={1,4,5,7,9}; //sort��͹����鹨��ѹ�����
	int b = a.length;
	Scanner kb =new Scanner(System.in);
	System.out.println("input value = ");
	int value =kb.nextInt();
System.out.print(binarySearch(a, b, value));
	}
	public static int  binarySearch (int key[],int size, int value){
		int low=0;
		int high=size-1;
		int mid;
		while(low<=high){
		             mid=(low+high)/2;
		            if(key[mid]>value)
		    high=mid-1;
		else if(key[mid]<value)
		           low=mid+1;
		else
		return mid;
		}
		return-1;
		}
}
	 

