package Testingbasicjava_sq1;

public class TextEx3_while_dowhile_factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int i = 2; // ���n 
	      while (i<=10) { // ���ӹǹ�� 2-10 
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
