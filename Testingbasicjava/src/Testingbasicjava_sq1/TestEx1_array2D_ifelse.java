package Testingbasicjava_sq1;

public class TestEx1_array2D_ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char area[][] = new char[8][8];
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

	}

}
