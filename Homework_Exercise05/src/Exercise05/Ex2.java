package Exercise05;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long result = 1;
	     long  n=3;// �Ѻ��Ҩҡ�պ�������㹵���� n

	      for (long i = n; i >= 1; i--) { // n! = n * (n - 1) * (n - 2) * ... * 1
	         result *= i; // ǹ�ٻ�ӼŤٳ���������� result
	      }

	      System.out.println("Result = " + result); // �ʴ����Ѿ�� Factorial
	   }
}
