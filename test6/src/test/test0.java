package test;
// แบบไม่ใช้ array
public class test0 {
	char area[][] = new char[10][10];

	void a() {

		int rows = 8; //แนวนอน
int rows2 =4;
int col2=4;
		int col = 8;//แนวตั้ง
		for(int i = 0; i < rows; i++ ){
			for(int j = 0; j < col; j++){
				if (i == 0 || i == (rows - 1)) {  //row
					System.out.print("X");
				} 
				if (i == 0 || i == (rows2 - 1)) {  //row
					System.out.print("X");
				} 
				else {
					if (j == 0 || j == (col - 1)) { // col ถ้า 0==0 และ 0 == 9
						System.out.print("X");
					} else {
						System.out.print(" "); //ช่องว่าง แนวนอน
					}
				}
			}
			System.out.println(" ");
		}
		
	}

}
