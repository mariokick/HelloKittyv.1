package Menu;
import java.util.Scanner;
public class testdowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner kb=new Scanner(System.in);
		int i  =0;
int sum = 0;
int m =kb.nextInt(); 
		do{
			sum= m*i;
			System.out.println(m+" * "+i+" = "+sum);
	i++;
}
while(i<=12);
	

		
		
	}

}
