package PaidEmployee;
import theEmployee.Employee;
public class HourlyPaidEmployee extends Employee {
public HourlyPaidEmployee(double h){
	hourly = h;
}
	public double getSalary() {
		
		return hourly= hourly*HourlySalary;

	}
double hourly;
double HourlySalary = 100;
}
