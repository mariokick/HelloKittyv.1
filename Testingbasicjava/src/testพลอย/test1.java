package test����;
import java.util.Scanner;
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner kb= new Scanner(System.in);
System.out.print("�ô��͹��ṹ�ͧ�س = ");
int s =kb.nextInt();
if(s>100){
	System.out.println("��͹��ṹ�Դ");
}
else if(s>=80){
	System.out.println("A");
	
}
else if (s>=75){
	System.out.println("B+");
}
else if (s>=70){
	System.out.println("B");
}
else if (s>=65){
	System.out.println("C+");
}
else if (s>=60){
	System.out.println("C");
}
else if (s>=55){
	System.out.println("D+");
}
else if (s>=50){
	System.out.println("D");
}
else {
	System.out.println("F");
}
	}

}
