package allclass;

public class TryCatchFinally {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number = 0 ; 
try{
	number=Integer.parseInt(args[0]);
}
catch(ArrayIndexOutOfBoundsException e ){
	System.out.println("Array Index out of Bounds");
	
}
catch(NumberFormatException e){
	System.out.println("Number Format Error");
}
finally{
	System.out.println("Finally"); //ไม่ว่าเกิดข้อผิดหรือไม่จะทำงานบรรทัดนี้
}
System.out.println("Your input is "+number);
	}

}


