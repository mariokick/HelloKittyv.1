package test;
// Ẻ����� array
public class test0 {
	char area[][] = new char[10][10];

	void a() {

		int rows = 8; //�ǹ͹
int rows2 =4;
int col2=4;
		int col = 8;//�ǵ��
		for(int i = 0; i < rows; i++ ){
			for(int j = 0; j < col; j++){
				if (i == 0 || i == (rows - 1)) {  //row
					System.out.print("X");
				} 
				if (i == 0 || i == (rows2 - 1)) {  //row
					System.out.print("X");
				} 
				else {
					if (j == 0 || j == (col - 1)) { // col ��� 0==0 ��� 0 == 9
						System.out.print("X");
					} else {
						System.out.print(" "); //��ͧ��ҧ �ǹ͹
					}
				}
			}
			System.out.println(" ");
		}
		
	}

}
