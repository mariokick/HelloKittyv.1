package test«ÿ≤‘;
import java.util.Scanner;
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb =new Scanner(System.in);
		int password = 0 ;
		
		String CHID1="admin";
		System.out.print("‚ª√¥„ Ë ID = ");
		String id = kb.nextLine();
		System.out.print("‚ª√¥„ Ëpassword = ");
		password =kb.nextInt();
	if(id.equals(CHID1)){
		if(password ==1234){
			System.out.print("¬‘π¥’µÈÕπ√—∫ "+id);
		}
		else{
			System.out.print("ID ∂Ÿ°·µËPasswordº‘¥");
		}
	}
	else {
		System.out.println(id);
		System.out.print("ID·≈–Password ‰¡Ë∂Ÿ°µÈÕß");
	}
			
		
	
	}

}
