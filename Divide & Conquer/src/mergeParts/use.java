package mergeParts;

public class use {
	 private int[] array;
	    private int[] tempMergArr;
	    private int length;

	    public static void main(String a[]){
	    	System.out.println("ก่อน  Merge Sort");
	    	int inputArr[] = new int[40]; // สร้างarray ขนาด 40 แล้ว randomค่า 1-50
	    	for(int i=0; i<inputArr.length;i++){
	    		inputArr[i]=(int) (Math.random()*50);
	    		System.out.print(inputArr[i]);
	    		System.out.print(" ");
	    	}
	    	System.out.print("\n");
	      use mms = new  use();    
	        mms.sort(inputArr);
	    	System.out.println("หลัง Merge Sort");
	        for(int i:inputArr){
	            System.out.print(i);
	            System.out.print(" ");
	        }
	    }
	     
	    public void sort(int inputArr[]) {
	        this.array = inputArr;
	        this.length = inputArr.length;
	        this.tempMergArr = new int[length];
	        doMergeSort(0, length - 1);
	    }
	 
	    private void doMergeSort(int lowerIndex, int higherIndex) {
	         
	        if (lowerIndex < higherIndex) {
	            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
	       //แบ่งครึ่ง
	            doMergeSort(lowerIndex, middle);
	            doMergeSort(middle + 1, higherIndex);
	            mergeParts(lowerIndex, middle, higherIndex);
	        }
	    }
	 
	    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
	 
	        for (int i = lowerIndex; i <= higherIndex; i++) {
	            tempMergArr[i] = array[i];
	        }
	        int i = lowerIndex;
	        int j = middle + 1;
	        int k = lowerIndex;
	        while (i <= middle && j <= higherIndex) {//จากอัลกอริทึมในสไล
	            if (tempMergArr[i] <= tempMergArr[j]) {
	                array[k] = tempMergArr[i];
	                i++;
	            } else {
	                array[k] = tempMergArr[j];
	                j++;
	            }
	            k++;
	        }
	        while (i <= middle) {
	            array[k] = tempMergArr[i];
	            k++;
	            i++;
	        }
	 
	    }
	}

