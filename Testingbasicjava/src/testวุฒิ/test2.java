package test�ز�;
import java.util.Scanner;
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb =new Scanner(System.in);
		int password = 0 ;
		
		String CHID1="admin";
		System.out.print("�ô��� ID = ");
		String id = kb.nextLine();
		System.out.print("�ô���password = ");
		password =kb.nextInt();
	if(id.equals(CHID1)){
		if(password ==1234){
			System.out.print("�Թ�յ�͹�Ѻ "+id);
		}
		else{
			System.out.print("ID �١��Password�Դ");
		}
	}
	else {
		System.out.println(id);
		System.out.print("ID���Password ���١��ͧ");
	}
			
		
	
	}

}
