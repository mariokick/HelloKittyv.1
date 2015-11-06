package Menu;

public class testfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i <5; i++) { // ควบคุมจำนวนบรรทัด
            for (int j = 0; j <= i; j++) { // ควบคุมจำนวน *
                System.out.print("*"); // วาดรูป *
            }
            System.out.println(); // เมื่อจบแต่ละบรรทัดขึ้นบรรทัดใหม่
        }
        // เมื่อวาดเสร็จทำการขึ้นบรรทัดใหม่
    } 
}

	
