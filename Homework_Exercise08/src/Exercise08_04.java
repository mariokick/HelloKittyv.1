
public class Exercise08_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
Rectangle rectangle = new Rectangle(-10,30);
//4���������Ҵ ���ҧ -10 ���30 ��Ҥ�ҵԴź ��˹������Ҩ�error
rectangle.setWidth(3);//��˹��������ҧ����-3
		
System.out.println(rectangle);
		}
		catch(IllegalArgumentException e){
			System.out.println("Illegal arguments");
			
		}
		}

}
