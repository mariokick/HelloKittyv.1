package Testingbasicjava_sq1;
import java.util.Scanner;
public class TestEx4_switch_menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner kb= new Scanner(System.in);
	System.out.println("โปรดเลือกเมนูที่ท่านต้องการใช้งาน");
	String menu = kb.next();

switch(menu){
case "1": char area[][] = new char[8][8];
for (int i = 0; i < area.length; i++) {
	for (int j = 0; j < area[i].length; j++) {
		if (i == 0) {// กรอบนอก ตั้ง ซ้าย
			area[i][j] = 'x';
		}

		if (j == 0) {// กรอบนอก นอน บน
			area[i][j] = 'x';
			
		}

		if (i == 7) {// กรอบนอก ตั้ง ขวา
			area[i][j] = 'x';
		}

		if (j == 7) {// กรอบนอก นอน ล่าง
			
			area[i][j] = 'x';
		}

		if (j + 1 > i & i == 2) { // กรอบวงในแนวนอน บน 
			area[i][j] = 'x';
			if (j == 6) {
				area[i][j] = ' ';
			}
		}
		
		if (j + 1 > i - 3 & i == 5) {// กรอบวงในแนวนอนล่าง
			area[i][j] = 'x';
			if (j == 6) {
				area[i][j] = ' ';
			}
		}

		if (i + 1 > j & j == 2) { // กรอบวงในแนวตั้งซ้าย 
			area[i][j] = 'x';
			if (i == 6) {
				area[i][j] = ' ';
			}
		}

		if (i + 1 > j - 3 & j == 5) {// กรอบวงในแนวตั้งขวา
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
	System.out.print("โปรดใส่ค่า Factorial ที่ต้องการทราบ = ");
	int n = kb.nextInt();
	long sum = 1  ;
	for(long i=n;i>=1;i--){
		sum *=i	;
	}
	System.out.println("Factorial = "+sum);
;
break;
case "3":
	  int i = 2; // ค่าn 
      while (i<=10) { // ให้คำนวนหา 2-10 
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
