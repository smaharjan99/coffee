package begin;

public class SwitchDemo {

	public static void main(String[] args) {
		int month = 6;
		String monthName;
		
		switch(month){
		case 1: monthName="JANUARY";
				break;
		case 2: monthName="FEBRUARY";
				break;
		case 3: monthName="MARCH";
				break;
		case 4: monthName="APRIL";
				break;
		case 5: monthName="MAY";
				break;
		case 6: monthName="JUNE";
				break;
		case 7: monthName="JULY";
				break;
		case 8: monthName="AUGUST";
				break;
		case 9: monthName="SEPTEMBER";
				break;
		case 10: monthName="OCTOBER";
				break;
		case 11: monthName="NOVEMBER";
				break;
		case 12: monthName="DECEMBER";
				break;
		default: monthName="not valid";
				break;
				
		}
		System.out.println(monthName);
	}

}
