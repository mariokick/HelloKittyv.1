package allclass;

public class TryCatchThrow {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = -10;
		try {
			number = Integer.parseInt(args[0]);
			if (number < 0)
				throw new Exception("Negative Number Error"); // ���ҧexception
																// ����ͧ�������駡�˹���������´

		} catch (Exception e) {
			System.out.println(e.getMessage());// �ѡ�Ѻexception������ҧ
		}
		System.out.println("Your input is " + number);
	}
}
