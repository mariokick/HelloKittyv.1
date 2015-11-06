package lidrany1;


	public class Employee {
		public double getSalary() {

			return Salary;

		}

		public void setName(String c) {

			NameEmployee = c;

		}

		public String toString() { 
			String str;
			str = setName();
			str += getSalary();
			return str;
		}

		 String setName() {
			// TODO Auto-generated method stub
			return NameEmployee;
		}

		protected double Salary;
		protected  String NameEmployee;

	}


