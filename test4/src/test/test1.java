package test;

public class test1 {
	public static void main(String[] args) {
        for (int i = 0; i < 8; i++) { // ควบคุมจำนวนบรรทัด
            for (int j = 0; j <= i; j++) { // ควบคุมจำนวน x_
                System.out.print("x_"); // วาดรูป x_
            }
            System.out.println(); // เมื่อจบแต่ละบรรทัดขึ้นบรรทัดใหม่
        }
        // เมื่อวาดเสร็จทำการขึ้นบรรทัดใหม่
    }

	}

