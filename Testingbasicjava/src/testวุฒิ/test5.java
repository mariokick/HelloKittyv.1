package test�ز�;
import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner kb= new Scanner(System.in);
int i =1;
System.out.print("����ٵäٳ����ͧ��÷�Һ");
int number = kb.nextInt();
 	int sum= 0; 
do{

	sum = number * i ;

	System.out.println(number+" * "+i+" = "+sum);
	i++;
}while(i<=12);
	}

}
