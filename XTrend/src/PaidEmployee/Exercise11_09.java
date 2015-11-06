package PaidEmployee;

import theEmployee.Employee;

public class Exercise11_09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee m1= new MonthlyPaidEmployee();
Employee m2= new HourlyPaidEmployee(15);

m1.setName("Somchai");
m2.setName("Somying");

System.out.println(m1);
System.out.println(m2);
	}

}
