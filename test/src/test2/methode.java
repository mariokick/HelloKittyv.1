package test2;
import java.util.Scanner;
public class methode {


		// TODO Auto-generated method stub
void u1 (){

	int rose,sunflower,jasmin,tulip;
	double money,sale,total,profit,cost;
	Scanner sc = new Scanner(System.in);
	System.out.println("--------Flower List----------\n");
	System.out.println("1.Rose\t\t15 Baht\n2.Sun flower\t23 Baht\n3.Jasmin\t8  Baht\n4.Tulip\t\t20 Baht\n");
	System.out.println("-----------------------------\n");

	System.out.println("Put number flower\n");
	System.out.print("Rose       --> ");rose = sc.nextInt();
	System.out.print("Sun flower --> ");sunflower = sc.nextInt();
	System.out.print("Jasmin     --> ");jasmin = sc.nextInt();
	System.out.print("Tulip      --> ");tulip = sc.nextInt();
	System.out.println("\n-----------------------------\n");
	money = (15*rose)+(23*sunflower)+(8*jasmin)+(20*tulip);
	System.out.println("Money            --> "+money+"\tBaht\n");

	if (money>200)
	{
		sale = money*3/100;
		System.out.println("Discount         --> "+sale+"\tBaht");
		total = money-sale;
		System.out.println("Total Money      --> "+total+"\tBaht");
		
		cost = (9*rose)+(13*sunflower)+(4*jasmin)+(8*tulip);
		profit =(money-cost)-sale;
		System.out.println("Owner get profit --> "+profit+"\tBaht");

	}
		else if (money>500)
		{
		sale = money*5/100;
		System.out.println("Discount         --> "+sale+"\tBaht");
		total = money-sale;
		System.out.println("Total Money      --> "+total+"\tBaht");

		cost = (9*rose)+(13*sunflower)+(4*jasmin)+(8*tulip);
		profit =(money-cost)-sale;
		System.out.println("Owner get profit --> "+profit+"\tBaht");
		}

		else if (money>700)
		{
		sale = money*10/100;
		System.out.println("Discount         --> "+sale+"\tBaht");
		total = money-sale;
		System.out.println("Total Money      --> "+total+"\tBaht");

		cost = (9*rose)+(13*sunflower)+(4*jasmin)+(8*tulip);
		profit =(money-cost)-sale;
		System.out.println("Owner get profit --> "+profit+"\tBaht");
		}
	
	 System.out.println("\n---------Thank You-----------");

	
}

}
	class use1 {
		public static void main(String[] args) {
		methode use = new methode();
		use.u1();
	}


}