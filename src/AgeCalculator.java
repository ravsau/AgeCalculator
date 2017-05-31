// This program asks you for your birthday and prints your age in years and month
import java.util.Calendar;
import java.util.Scanner;


public class AgeCalculator {

	public static void main(String[] args) {


		Scanner sc= new Scanner (System.in);

		String[] agesList = new String[50];
		int n=0; //array counter

		String choice;

		//loop to let user enter upto 50 birthdays
		do {
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

			}while((x>11) || x<0 );



			do {
				System.out.println("Enter the day of Birth: ");
				born_day=sc.nextInt();

			}while((born_day>31) ||born_day<1  );
			sc.nextLine();




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

			agesList[n]=n +" "+age_diff+" years "+ month_diff+" months old";




			System.out.println("Do you want to enter more birthdays? (y/n)");
			choice= sc.nextLine();


			n=n+1;

		}while(n<50 && choice.equals("y"));

		for(int i=0 ; i<50 ; i++){

			if (agesList[i]!=null){

				System.out.println(agesList[i]);}
		}



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











