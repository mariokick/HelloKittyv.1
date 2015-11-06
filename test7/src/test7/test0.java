package test7;

public class test0 {
void test1 (){
	char area[][] = new char [9][9];
	for(int i=0 ; i<area.length;i++ ){
		for(int j=0;j<area[i].length;j++){
			if(i<j-1){
				System.out.print('X');
			}
	
		}
		System.out.print("\n");
	}

}
void test2(){
	char area1[][] = new char [9][9];
	for(int i=0 ; i<area1.length;i++ ){
		for(int j=0;j<area1[i].length;j++){
			if(i>j+1){
				System.out.print('X');
			}
			if(i>j+2){
				System.out.print('_'); //วิธีทำให้ _ บรรทัดแรกไม่มี
			}
		}
		System.out.print("\n");	
	}

}
}
