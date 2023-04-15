
import java.util.Scanner;

public class NumberOfDaysInMonth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = 0, year = 0;
		boolean check = false;
		String strMonth = "";

		while (!check) {
			System.out.print("Enter month: ");
			strMonth = sc.nextLine();
			System.out.print("Enter the year: ");
			year = sc.nextInt();
			sc.nextLine();

			month = getMonth(strMonth);
			if (month >= 1 && month <= 12 && year >= 0) {
				check = true;
			} else {
				System.out.println("Invalid Input! Re-enter please: ");
			}
		}

		int days = getDays(month, year);
		System.out.println(strMonth + " of " + year + " has " + days + " days");

		sc.close();
	}

	public static int getMonth(String strMonth) {
		switch (strMonth) {
			case "January":
			case "Jan.":
			case "Jan":
			case "1":
				return 1;
			case "February":
			case "Feb.":
			case "Feb":
			case "2":
				return 2;
			case "March":
			case "Mar.":
			case "Mar":
			case "3":
				return 3;
			case "April":
			case "Apr.":
			case "Apr":
			case "4":
				return 4;
			case "May":
			case "5":
				return 5;
			case "June":
			case "Jun":
			case "6":
				return 6;
			case "July":
			case "Jul":
			case "7":
				return 7;
			case "August":
			case "Aug.":
			case "Aug":
			case "8":
				return 8;
			case "September":
			case "Sept.":
			case "Sep":
			case "9":
				return 9;
			case "October":
			case "Oct.":
			case "Oct":
			case "10":
				return 10;
			case "November":
			case "Nov.":
			case "Nov":
			case "11":
				return 11;
			case "December":
			case "Dec.":
			case "Dec":
			case "12":
				return 12;
			default:
				return -1;
		}
	}

	public static int getDays(int month, int year) {
		int days;
		switch (month) {
			case 2:
				if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
					days = 29;
				} else {
					days = 28;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
			default:
				days = 31;
		}
		return days;
 	}
}