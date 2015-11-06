
public class Exercise08_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
Rectangle rectangle = new Rectangle(-10,30);
//4เหลี่ยมขนาด กว้าง -10 ยาว30 ถ้าค่าติดลบ กำหนดไว้ว่าจะerror
rectangle.setWidth(3);//กำหนดความกว้างใหม่-3
		
System.out.println(rectangle);
		}
		catch(IllegalArgumentException e){
			System.out.println("Illegal arguments");
			
		}
		}

}
