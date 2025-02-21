import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) throws ParseException, CloneNotSupportedException {

		//  Cases for Bikram Calendar.


		
		// Get current date and time 
		BikramCalendar currentTime = BikramCalendar.now("Asia/Kathmandu");
		BikramCalendar bc2 = new BikramCalendar(28, 10,2081,14,54,0);
		bc2.cal();
		
		
		/*
		         माघ २०८१
		---------------------------
		Sun Mon Tue Wed Thu Fri Sat
		---------------------------
		        1   2   3   4   5   
		6   7   8   9   10  11  12  
		13  14  15  16  17  18  19  
		20  21  22  23  24  25  26  
		27  28  29  30  
		---------------------------
		
		*/
		
		
/*		
		//1. To get Date in different formats
		System.out.println(currentTime.getDate());         // Output: 9/11/2081
		System.out.println(currentTime.getTime());         // Output: 18:5:47
		System.out.println(currentTime.toNepaliFormat(0)); // Output: 9-11-2081
		System.out.println(currentTime.toNepaliFormat(1)); // Output: ९/११/२०८१
		System.out.println(currentTime.toNepaliFormat(2)); // Output: 2081/11/9
		System.out.println(currentTime.toNepaliFormat(3)); // Output: फागुन 9
		System.out.println(currentTime.toNepaliFormat(4)); // Output: 2081, फागुन 9
		System.out.println(currentTime.toNepaliFormat(5)); // Output: 9 फागुन, 2081
		System.out.println(currentTime.toNepaliFormat(6)); // Output: 9/11/2081, 18:5:47

	*/	

		
		
		//2. Find total days of a month
		//int totalDays = bc2.getTotalDaysOfMonth();

		
		// 3. Create New BikramSamvat date object
		
		//BikramCalendar bc1 = BikramCalendar.now("Asia/Kathmandu");
		//BikramCalendar bc2 = new BikramCalendar(28, 2, 2049,14,54,0);
		//BikramCalendar bc3 = new BikramCalendar(28, 2, 2049);
		
	
	
		
		// 4. Adding and subtracting years
		/*
		 *BikramCalendar bc3 = bc2.minusYear(5); BikramCalendar bc4 = bc2.plusYear(5);
		 * System.out.println(bc2.getDate()+" - 12 months = "+bc3.getDate());
		 * System.out.println(bc2.getDate()+" + 12 months = "+bc4.getDate());
		 */
		

		// 5. Adding and subtracting months
		/*
		 * BikramCalendar bc5= bc2.minusMonth(12); BikramCalendar bc6=bc2.plusMonth(12);
		 * System.out.println(bc2.getDate()+" - 12 months = "+bc5.getDate());
		 * System.out.println(bc2.getDate()+" + 12 months = "+bc6.getDate());
		 */
		
		// 6. Adding and subtracting days But 2110<date<1967 ( VERIFY ONCE)
		/*
		 * BikramCalendar bc7= bc2.minusDays(9); BikramCalendar bc8=bc2.plusDays(9);
		 * 
		 * System.out.println(bc2.getDate()+" - 9 days = "+bc7.getDate());
		 * System.out.println(bc2.getDate()+" + 9 days = "+bc8.getDate());
		 */
		  
		 // 7. Adding and subtracting Minutes
			/*
			 * BikramCalendar bc9= bc2.minusMins(120); BikramCalendar
			 * bc10=bc2.plusMins(120); System.out.println(bc2+" - 2 hours= "+bc9);
			 * System.out.println(bc2+" + 2 hours= "+bc10);
			 */
		
		// Useful Functionalities
		
		// 1. To know day of any date  1: sunday , 7:saturday
		/*
		 * int dayOfWeek=BikramCalendar.getDayOfWeek(2081,11,9);
		 * System.out.println(dayOfWeek);
		 */
		
		// 2. To know the starting day of Bikram Samvat month (sunday=1) 
		/*
		 * int firstDayOfMonth=BikramCalendar.getMeFirstDayOfMonth(2081,11);
		 * System.out.println(firstDayOfMonth);
		 */
		// 3. To find the number of days between two Bikram samvat years
		/*
		 * BikramCalendar myDOB = new BikramCalendar(28,3,2049,19,20,0);
		 * 
		 * int totaldays = BikramCalendar.getDaysBetweenDates(myDOB, currentTime);
		 * System.out.println("I am "+totaldays+ " days old.");
		 */
		
	
		// 4. To find the number of YEARS between two Bikram samvat years
		/*
		 * BikramCalendar myDOB = new BikramCalendar(28,3,2049,14,54,0); int totalYears
		 * = BikramCalendar.getDurationYear(myDOB, myDOB);
		 * System.out.println("I am "+totalYears+ " years old.");
		 */

		//5: No of days completed for particular BS date.
		//int elapsedDays=currentTime.getElapsedDaysOfCurrentYear();
		//System.out.println("Given date has completed "+elapsedDays+ " days / "+ currentTime.totalDaysInYear());

		//6. COnvert your BS date in AD
		//LocalDateTime currentTimeAD = currentTime.dateInAD();
		//System.out.println(currentTime.getDate() +" BS  =->  "+ currentTimeAD.toLocalDate()+" AD");
		
		

		//7. COnvert your AD date in BS
		//LocalDate dateInAD = LocalDate.of(2025, 02, 21);
		//DateTimeModel myBSDate = new DateConverter().convertAdToBs(dateInAD);
		//System.out.println(dateInAD +" AD  =->  "+ myBSDate+" BS");
		
		
		//8. To know if date1 comes after or before date2
		//BikramCalendar myTime = currentTime.plusMins(10);
		//System.out.println(myTime.isBefore(currentTime));
		//System.out.println(myTime.isAfter(currentTime));


		
		
	}

}
