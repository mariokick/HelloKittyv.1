public class Day {
	Day() {
	Day=0;
		month1 = 0;
	}

	void printWeelyday() {
		System.out.print(Weely[Day]);
	}

	void printday() {
		System.out.print(Day);
	}

	void printmonth() {
		System.out.println(month[month1]);
	}

	void nextdayWeely() {
		Day = Day + 1;
		System.out.println(Day);
		if (Day >= 7) {
			Day = 0;
		}

	}

	void nextdaymonth31() {
		Day = Day + 1;
		if (Day > 31) {
			Day = 0;
		}
	}

	void nextdaymonth28() {
		Day = Day + 1;
		if (Day > 29) {
			Day = 0;
		}
	}

	void nextdaymonth30() {
		Day = Day + 1;
		if (Day > 31) {
			Day = 0;
		}
	}

	void nextmonth() {
		month1 = month1 + 1;
		if (month1 >= 13) {
			month1 = 0;
		}

	}

	int Day = 0;
	int month1 = 0;
	String[] Weely = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
			"Friday", "Satday" };
	String[] month = { "January", "February", "March", "April", "May", "June",
			"July", "August", "September", "October", "November", "December" };
}
