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
System.out.println("���ҧ = "+W);
System.out.println("���  = "+L);
System.out.println("��鹷�� = "+SquareArea.getArea());
System.out.println("����ͺǧ = "+SquarePerimeter.getPerimeter());

	}

}
