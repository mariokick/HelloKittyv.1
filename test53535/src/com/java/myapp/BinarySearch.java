package com.java.myapp;

public class BinarySearch {
	public static int BinarySearch (int[] a , int key){
	    //Set the target item to an arbitrary String that should return true.
	  
		 int lo = 0;
	        int hi = a.length - 1;
	        while (lo <= hi) {
	            // Key is in a[lo..hi] or not present.
	            int mid = lo + (hi - lo) / 2;
	            if      (key < a[mid]) hi = mid - 1;
	            else if (key > a[mid]) lo = mid + 1;
	            else return mid;
	        }
	        return -1;
	    }
}


