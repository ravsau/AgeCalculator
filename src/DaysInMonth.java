import java.util.Calendar;



public class DaysInMonth{
	public int day;
	public int year;
	public int month;
	int monthDays;


     
	public DaysInMonth(int birthYear, int birthMonth, int birthDay) {
       day=birthDay;
       month=birthMonth;
       year=birthYear;
       
       System.out.println(month+" has "+dayMonth(month)+" days");
       
      
       
       
       
       
       
    }
	
	
	
	public void currentDate(){
		
		Calendar rightNow = Calendar.getInstance();
		int currentYear=rightNow.get(Calendar.YEAR);
		int currentMonth=rightNow.get(Calendar.MONTH);
		int currentDay=rightNow.get(Calendar.DAY_OF_MONTH);
		
		
		
		
	}
}


                                                       



