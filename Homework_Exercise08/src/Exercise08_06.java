public class Exercise08_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day d = new Day();
		d.printday();

		d.printday();
		Day e = new Day();
		System.out.println("พิมพ์วันอาทิตย์จันทร์ ถึง อาทิตย์");

		Day y = new Day();


		// 12เดือน
		for (int i = 0; i < 12; i++) {
			System.out.print("Month = ");
			y.printmonth();
			if (i == 0) {
				for (int ii = 1; ii <= 31; ii++) {
					y.nextdaymonth31();
					y.printday();
					y.printmonth();
				}
				
			}
			if (i == 1) {
				for (int ii = 1; ii <= 28; ii++) {
					y.nextdaymonth28();
					y.printday();
					y.printmonth();
				}
				
			}
			if (i == 2) {
				for (int ii = 1; ii <= 31; ii++) {
					y.nextdaymonth31();
					y.printday();
					
					y.printmonth();
				}
			}
			if (i == 4) {
				for (int ii = 0; ii <= 29; ii++) {
					y.printday();
					y.nextdaymonth30();
					y.printmonth();
				}
				
			}
			if (i == 5) {
				for (int ii = 0; ii <= 30; ii++) {
					y.printday();
					y.nextdaymonth31();
					y.printmonth();
				}
				
			}
			if (i == 6) {
				for (int ii = 0; ii <= 29; ii++) {
					y.printday();
					y.nextdaymonth30();
					y.printmonth();
				}
				
			}
			if (i == 7) {
				for (int ii = 0; ii <= 30; ii++) {
					y.printday();
					y.nextdaymonth31();
					y.printmonth();
				}
				
			}
			if (i == 8) {
				for (int ii = 0; ii <= 29; ii++) {
					y.printday();
					y.nextdaymonth30();
					y.printmonth();
				}
				
			}
			if (i == 9) {
				for (int ii = 0; ii <= 30; ii++) {
					y.printday();
					y.nextdaymonth31();
					y.printmonth();
				}
				
			}
			if (i == 10) {
				for (int ii = 0; ii <= 29; ii++) {
					y.printday();
					y.nextdaymonth30();
					y.printmonth();
				}
				
			}
			if (i == 11) {
				for (int ii = 0; ii <= 30; ii++) {
					y.printday();
					y.nextdaymonth31();
					y.printmonth();
				}
				
			}
		
			y.nextmonth();
			// y.printmonth();
			// y.nextmonth();
		}
		// 31วัน 30 วัน 28 วั
		
	}

}
