package test1;
import java.util.Scanner;
public class savause {

	
		// TODO Auto-generated method stub
		void history (){
			Scanner in =new Scanner(System.in);
			System.out.print("name\t: ");
			String name		= in.nextLine();

			System.out.print("surname\t: "); 
			String surname	= in.nextLine();

			System.out.print("age\t: ");
			int    age		= in.nextInt();

			System.out.print("sex\t: ");
			String sex		= in.next();

			System.out.print("number\t: ");
			int    number	= in.nextInt();

			System.out.print("day\t: ");
			int    day		= in.nextInt();

			System.out.print("mount\t: ");
	        int    mount    = in.nextInt();

			System.out.print("year\t: ");
			int    year     = in.nextInt();
			String birthday = day+"/"+mount+"/"+year;  

			System.out.println("\n\nname\t: "+name);
			System.out.println("surname\t: "+surname);
		    System.out.println("age\t: "+age);
			System.out.println("sex\t: "+sex);
			System.out.println("birthday: "+birthday);
			System.out.println("number\t: "+number);




			int a1;
			char a;
			a	= name.charAt(0);
			a1	= a;
			a	= name.charAt(1);
			a1	+= a;
			a	= name.charAt(2);
			a1	+= a;
			a	= name.charAt(3);
			a1	+= a;
			a	= name.charAt(4);
			a1	+= a;
			a	= name.charAt(5);
			a1	+= a;
			a	= name.charAt(6);
			a1	+= a;

		    int b2;
			char b;
			b	= surname.charAt(0);
			b2	= b;
			b	= surname.charAt(1);
			b2	+= b;//b2=b2+b;
			b	= surname.charAt(2);
			b2	+= b;
			b	= surname.charAt(3);
			b2	+= b;
			b	= surname.charAt(4);
			b2	+= b;
			b	= surname.charAt(5);
			b2	+= b;
			b	= surname.charAt(6);
			b2	+= b;
		

			double total = a1+b2/(double)age*day/year-mount*number; 
	        System.out.println(total);
	       

		   sex = "FeMale";
		   sex = sex.toUpperCase();
			if (sex.equals("FEMALE"))
				{
					System.out.println(sex);
				}
		}
	}


	


