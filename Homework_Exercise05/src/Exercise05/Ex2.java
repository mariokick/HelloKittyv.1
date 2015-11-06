package Exercise05;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long result = 1;
	     long  n=3;// รับค่าจากคีบอร์ดมาเก็บในตัวแปร n

	      for (long i = n; i >= 1; i--) { // n! = n * (n - 1) * (n - 2) * ... * 1
	         result *= i; // วนลูปนำผลคูณที่ได้มาเก็บใน result
	      }

	      System.out.println("Result = " + result); // แสดงผลลัพธ์ Factorial
	   }
}
