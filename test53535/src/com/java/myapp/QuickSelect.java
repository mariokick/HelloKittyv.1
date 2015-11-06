package com.java.myapp;

public class QuickSelect {


		public static boolean QuickSelect1(int[] arr, int key) {

		 
		 int from = 0, to = arr.length - 1;
		 
		 
		 while (from < to) {
		  int r = from, w = to;
		  int mid = arr[(r + w) / 2];
		 
		 
		  while (r < w) {
		 
		   if (arr[r] >= mid) { // put the large values at the end
		    int tmp = arr[w];
		    arr[w] = arr[r];
		    arr[r] = tmp;
		    w--;
		   } else {  
		    r++;
		   }
		   
		   if (arr[r]==key || arr[w]==key)
		   {
			   return true ; 
		   }
		  }
		 
		 
		  if (arr[r] > mid)
		   r--;
		 
		 
		  if (arr.length - 1 <= r) {
		   to = r;
		  } else {
		   from = r + 1;
		  }
		 }
		 if (arr[0]==key )
		   {
			   return true ; 
		   }
	
		 return false ;
		 
		 
		}
		
}
