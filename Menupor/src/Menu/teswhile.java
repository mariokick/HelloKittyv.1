package Menu;

public class teswhile {
	public static void main(String args[]) {
		
		  int i = 2;
	      while (i<=10) { // /2-5
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