package Menu;
import java.util.Scanner;
public class Project {
/*���ٷ�� 1= ����Ѻ�ʴ����Ѿ�ҡ��úǡź�ٳ��� �ҡ��ҷ��������� a b sum
	���ٷ�� 2= �ʴ�����ٵäٳ�ҡ��ҷ���������
			���ٷ�� 3=�ӹǳ�ô�����ҡ ��ṹ����������
			���ٷ�� 4=�ʴ��ѵ���š����¹ʡ���Թ��ҡ��ҷ�����
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner kb = new  Scanner(System.in);


double sum = 0 ;
//int m =kb.nextInt();
//double g =kb.nextDouble();

short menu = 0;
	
while(menu < 5){
System.out.print("���͡���ٷ���ͧ��� \n"
		+ "���� 1 ����Ѻ����ʴ����Ѿ�ҡ��úǡź�ٳ���\n"
		+ "���� 2 ��4�������ٵäٳ�ҡ��ҷ���������\n"
		+ "���� 3 �ӹǳ�ô�����ҡ ��ṹ����������\n"
		+ "���� 4 �ʴ��ѵ���š����¹ʡ���Թ�ҡ��ҷ�����\n"
		+ "���� 5 ¡��ԡ����� "
		+ "�ô������ٷ���ͧ��� = ");

 menu = kb.nextShort();


switch(menu){
case 1 :  
	System.out.print("�ô����ҷ�� 1 = "); 
		double a  =kb.nextDouble();
		System.out.print("�ô����ҷ�� 2 = "); 
		double b  =kb.nextDouble();
		System.out.print("�ô���͡ 1 �ǡ 2 ź 3 �ٳ 4 ��� =");
		short menu1 = kb.nextShort();
		switch(menu1){
		case 1 : sum = a+b ;
		System.out.println("���Ѿ��ͧ "+a+"+"+b+"= : "+sum);
		break;
		case 2 : sum = a-b ;
		System.out.println("���Ѿ��ͧ "+a+"-"+b+"= : "+sum);
		break;
		case 3 : sum = a*b ;
		System.out.println("���Ѿ��ͧ "+a+"*"+b+"= : "+sum);
		break;
		case 4 : sum = a/b ;
		System.out.println("���Ѿ��ͧ "+a+"/"+b+"= : "+sum);
		break;
		}			
break;

case 2 : System.out.print("�ô�������ٵäٳ����ͧ��� = ");
int m =kb.nextInt();
int sum1 = 0 ;
for(int i=1;i<=12;i++){
sum1 = m * i ;
System.out.println(m+" * "+i+" = "+sum1);
}
break;
case 3 : System.out.print("�ô����ô�ͧ�س");
double g =kb.nextDouble();
if(g >= 80){
	System.out.println(" �ô A ");
}
else if (g>=70){
	System.out.println(" �ô B");
}
else if (g>=60){
	System.out.println(" �ô C");
}
else if (g>=50){
	System.out.println(" �ô D");
}
else{
	System.out.println(" �ô F");
}
break;

case 4 :
	
	System.out.print("ʡ���Թ����ͧ��÷�Һ�ѵ���š����¹ : \n"
			+ "���� 1 = ʡ���Թ�����\n"
			+ "���� 2 = ʡ���Թ����\n"
			+ "���� 3 = ʡ���Թ��\n "
			+ "�ô���ٷ���ͧ��� = ");
	int menu2=kb.nextInt();
	switch(menu2){
	case 1: System.out.println("ʡ���Թ����� = �¹");
	break;
	case 2: System.out.println("ʡ���Թ����  = ���� ");
	break;
	case 3: System.out.println("ʡ���Թ��   = �ҷ ");
	break;
	}
	
break;
}

}
System.out.println("�ͺ�س������ԡ��");
	}
}
