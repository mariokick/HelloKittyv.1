package Exercise05;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		
for(int i = 1 ;i<=12 ;i++){

	System.out.printf(i+" * ");
	System.out.printf("%.2f",Math.PI);
	System.out.printf("=");
	sum = i*Math.PI;
	System.out.printf("%.2f",sum);
	System.out.printf("%n");
	
}
	}

}
