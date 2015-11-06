package testของแวน;

public class test4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int i = 2; // ค่าn 
	      while (i<=10) { // ให้คำนวนหา 2-10 
	            int j = i;
	            int fac = 1;
	            do {
	                  fac = fac * j;
	                  j--;
	            } while (j != 0);
	            System.out.println("Factorial " + i + " = " + fac);
	            i++;
	      }
	}

}
