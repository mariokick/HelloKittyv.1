package test5;

//ที่ไม่ใส่จะมีกรอบนอก แนวตั้ง 1,1 - 1,7 กับ 1,7 - 7,7 และแนวนอน  ,1,1 - 7,1 และ  7,1- 7,7
public class test2 {

	// TODO Auto-generated method stub
	char area[][] = new char[8][8];

	void a() {
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

	}

	void show() {
		for (int i = 0; i < area.length; i++) {
			for (int j = 0; j < area[i].length; j++) {
				System.out.print(area[i][j]);
			}
			System.out.println();
		}

	}
}
