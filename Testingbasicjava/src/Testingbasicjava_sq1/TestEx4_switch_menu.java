package Testingbasicjava_sq1;
import java.util.Scanner;
public class TestEx4_switch_menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner kb= new Scanner(System.in);
	System.out.println("�ô���͡���ٷ���ҹ��ͧ�����ҹ");
	String menu = kb.next();

switch(menu){
case "1": char area[][] = new char[8][8];
for (int i = 0; i < area.length; i++) {
	for (int j = 0; j < area[i].length; j++) {
		if (i == 0) {// ��ͺ�͡ ��� ����
			area[i][j] = 'x';
		}

		if (j == 0) {// ��ͺ�͡ �͹ ��
			area[i][j] = 'x';
			
		}

		if (i == 7) {// ��ͺ�͡ ��� ���
			area[i][j] = 'x';
		}

		if (j == 7) {// ��ͺ�͡ �͹ ��ҧ
			
			area[i][j] = 'x';
		}

		if (j + 1 > i & i == 2) { // ��ͺǧ��ǹ͹ �� 
			area[i][j] = 'x';
			if (j == 6) {
				area[i][j] = ' ';
			}
		}
		
		if (j + 1 > i - 3 & i == 5) {// ��ͺǧ��ǹ͹��ҧ
			area[i][j] = 'x';
			if (j == 6) {
				area[i][j] = ' ';
			}
		}

		if (i + 1 > j & j == 2) { // ��ͺǧ��ǵ�駫��� 
			area[i][j] = 'x';
			if (i == 6) {
				area[i][j] = ' ';
			}
		}

		if (i + 1 > j - 3 & j == 5) {// ��ͺǧ��ǵ�駢��
			area[i][j] = 'x';
			if (i == 6) {
				area[i][j] = ' ';
			}
		}
	}
}

for (int i = 0; i < area.length; i++) {
	for (int j = 0; j < area[i].length; j++) {
		System.out.print(area[i][j]);
	}
	System.out.println();
}
;
break;
case "2":    
	System.out.print("�ô����� Factorial ����ͧ��÷�Һ = ");
	int n = kb.nextInt();
	long sum = 1  ;
	for(long i=n;i>=1;i--){
		sum *=i	;
	}
	System.out.println("Factorial = "+sum);
;
break;
case "3":
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
	;
break;
}
	}

}
