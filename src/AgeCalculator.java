import java.util.Calendar;
import java.util.Scanner;


public class AgeCalculator {

	public static void main(String[] args) {


		Scanner sc= new Scanner (System.in);

		System.out.println("Enter the year of Birth: ");

		while (!sc.hasNextInt()){
			System.out.println("Enter the year of Birth: ");
			sc.nextLine();
		}

		int year=sc.nextInt();
		System.out.println(year);
		sc.nextLine();
		int x;	
		int born_day;
		do {
			System.out.println("Enter the month of Birth(0-11): ");
			x=sc.nextInt();

		}while((x>=11) || x<=0 );



		do {
			System.out.println("Enter the day of Birth: ");
			born_day=sc.nextInt();

		}while((born_day>31) ||born_day<1  );




		int month=x;


		//------------------------------------

		Calendar rightNow = Calendar.getInstance();
		int currentYear=rightNow.get(Calendar.YEAR);
		int currentMonth=rightNow.get(Calendar.MONTH);
		int currentDay=rightNow.get(Calendar.DAY_OF_MONTH);


		int age_diff= currentYear-year;
		int month_diff= currentMonth-month;
		int day_diff=0;


		if (currentMonth>month){

			month_diff=currentMonth-month;

		}

		else if (month>currentMonth){

			age_diff=age_diff-1;

			month_diff=12-(month-currentMonth);

		}


		if (currentDay>born_day){

			day_diff= currentDay-born_day;

		}

		else if (born_day>currentDay){

			int a=dayMonth(month)-dayMonth(currentMonth);
		}

		System.out.println("You are " + age_diff+" years");

		System.out.println(month_diff+" month");

		System.out.println(day_diff+" days old");
	}


	public static int dayMonth(int monthh){

		int month=monthh;
		int monthDays=0;


		switch(month){

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			monthDays=31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			monthDays=30;
			break;
		case 2:
			monthDays=28;
			break;

		}

		return monthDays;


	}



}











