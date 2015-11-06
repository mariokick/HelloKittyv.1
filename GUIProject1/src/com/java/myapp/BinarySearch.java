package com.java.myapp;

public class BinarySearch {
	public static int BinarySearch (int[] a , int key){
	    //Set the target item to an arbitrary String that should return true.
	  
		 int lo = 0; //set first = 1; ตำแหน่งแรก
	        int hi = a.length - 1; //set last =n ; (ค่าสุดท้าย(ตำแหน่ง))
	        while (lo <= hi) { //Repeat step 3-4 while last => first
	            // Key is in a[lo..hi] or not present.
	            int mid = lo + (hi - lo) / 2; //Mid = (first+last) / 2
	            if      (key < a[mid]) hi = mid - 1;//If X < A[mid] then last = mid -1
	            else if (key > a[mid]) lo = mid + 1;//If X > A[mid] then first = mid +1
	            else return mid;
	        }
	        return -1; //ไม่พบ  //If X = A[last] then set k= last
	        					//   else k=0
	    }
}


