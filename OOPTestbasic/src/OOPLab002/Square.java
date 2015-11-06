package OOPLab002;
import java.util.Scanner;
public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner kb = new Scanner(System.in);
Area SquareArea = new Area();
Perimeter SquarePerimeter = new Perimeter();
System.out.print("Input width = ");
double W = kb.nextDouble();
System.out.print("Input long = ");
double L = kb.nextDouble();
SquareArea.findArea(W,L);
SquarePerimeter.findPerimeter(W,L);
System.out.println("กว้าง = "+W);
System.out.println("ยาว  = "+L);
System.out.println("พื้นที่ = "+SquareArea.getArea());
System.out.println("เส้นรอบวง = "+SquarePerimeter.getPerimeter());

	}

}
