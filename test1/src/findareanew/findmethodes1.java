package findareanew;
import java.util.Scanner;
public class findmethodes1 {
	
	double[] area =new double [3];
	void Circle(){	
		double radius  ;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nCalculate Circle Area  by --> 3.14*r*r");
		System.out.print("Radius = "); 
		radius = sc.nextDouble();
		area[0] = 3.14*radius*radius;
		System.out.println("\nArea => "+area[0]);
	}
	void Quadrature(){
		Scanner sc = new Scanner(System.in);
		double side  ;
		System.out.println("\nCalculate Quadrature Area  by --> side * side");
		System.out.print("\nSide = ");
		side = sc.nextDouble();
		area[1] = side*side;
		System.out.println("\nArea => "+area[1]);

	}
		
	void Trapezoid(){
		Scanner sc = new Scanner(System.in);
		double side ,base;
		System.out.println("\nCalculate Trapezoid Area  by --> (base/4)*4*Math.sqrt((side*side)-(base*base))");
	System.out.print("\nSide = ");
	side = sc.nextDouble();
	System.out.print("\nBase = ");
	base = sc.nextDouble();
	area[2] = (base / 4) * 4 * Math.sqrt((side * side) - (base * base));
	System.out.println("\nArea => " + area[2]);

	}

	
	void sum(){
	System.out.println("-------------Finish--------------");
	System.out.print("\nCircle area = "+area[0]);

	System.out.print("\nQuadrature = "+area[1]);
	System.out.print("\nTrapezoid = "+area[2]);


	System.out.print("\nsum all = "+(area[0]+area[1]+area[2]));

	}
}
	

class use1{

		findmethodes1 usemethodes = new findmethodes1();
		void menu(){
		Scanner sc = new Scanner(System.in);
		int  menu;
		menu=1;
		
		while( menu != 4){
			System.out.println("--------Please Choose Area Type---------\n\t1.Circle\n\t2.Quadrature\n\t3.Triangle\n\t4.end");
		System.out.print("\nYou Choose ---> ");

		menu = sc.nextInt();
		switch(menu){

		case 1: 
			
			usemethodes.Circle();
		break;

		case 2:
			usemethodes.Quadrature();
			break;
		case 3:
			usemethodes.Trapezoid();
			break;
			
		
		}
		}
		usemethodes.sum();
		}
		
	}

class use2{
	public static void main(String[] args) {
	use1 usemethodes = new use1();
	usemethodes.menu();
}
}