import java.util.Scanner;

public class asngmt_2_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the name of the month in BLOCKED letters without any spaces or special chars");
		day=obj.nextLine();
		switch(day)
		{
		case "JANUARY":
			System.out.println("January has 31 days");
			break;
		case "FEBRUARY":
			System.out.println("February has 28 days in a non-leap year.If not,it has 29 days in the case of a leap year");
			break;
		case "MARCH":
			System.out.println("March has 31 days"); 
				break;
			case "APRIL":
				System.out.println("April has 30 days");
				break;
			case "MAY":
				System.out.println("May has 31 days");
				break;
			case "JUNE":
				System.out.println("June has 30 days");
				break;
			case "JULY":
				System.out.println("July has 31 days");
				break;
			case "AUGUST":
				System.out.println("August has 31 days");
				break;
			case "SEPTEMBER":
				System.out.println("September has 30 days");
				break;
			case "OCTOBER" :
				System.out.println("October has 31 days");
				break;
			case "NOVEMBER":
				System.out.println("November has 30 days");
				break;
			case "DECEMBER":
				System.out.println("December has 31 days");
				break;
				default :
					System.out.println("Please check for spelling errors!");
					
		}

		
		

	}

}
