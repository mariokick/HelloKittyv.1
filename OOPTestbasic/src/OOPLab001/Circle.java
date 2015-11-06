package OOPLab001;
import java.util.Scanner;
public class Circle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		Area area = new Area();
		Girth girth = new Girth();
		System.out.print("Input Radius = ");
		double radius = kb.nextDouble();
		area.findArea(radius);	
		girth.findGirth(radius);
		System.out.println("Area = " + area.getArea());
		System.out.print("Girth = " + girth.getGirth());
		}
	
	}


