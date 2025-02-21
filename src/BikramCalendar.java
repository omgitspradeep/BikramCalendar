import java.time.ZonedDateTime;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class BikramCalendar implements Cloneable {


	    // Constants
	    final int MINUTES_IN_A_DAY = 1440;
	    final int MINUTES_IN_AN_HOUR = 60;
	    final int HOURS_IN_A_DAY = 24;

	    int day,month,year;
	    // Month starts with 1
	    int hour=0,minute=0,second=0;
	    int monthLastDay;

	    static int []yearsWithBaishakh1stAsSunday= {1970,1976,1981,1987,1998,2009,2015,2020,2026,2031,2037,2048,2054,2059,2065,2070,2076,2087,2092,2098};




	    //CONSTRUCTORS
	    
	    public BikramCalendar(int day, int month, int year, int hour, int minute, int second) {
	    	// Month : 1-> Baisakh.... 12 -> Chaitra
	    	// hour : 24 _hour_format
	        this.day = day;
	        this.month = month;
	        this.year = year;
	        this.hour = hour;
	        this.minute = minute;
	        this.second = second;
	        this.monthLastDay = (year <= Constants.BIKRAM_SAMBAT_MAX_LIMIT && year >= Constants.BIKRAM_SAMBAT_MIN_LIMIT) 
                    ? getTotalDaysOfMonth(year, month) : -1;

	        
	     
	    }


	    // Date conversion purpose
	    
	    public BikramCalendar(int day, int month, int year) {
	        this.day = day;
	        this.month = month;
	        this.year = year;
	        this.monthLastDay = (year <= Constants.BIKRAM_SAMBAT_MAX_LIMIT && year >= Constants.BIKRAM_SAMBAT_MIN_LIMIT) 
                    ? getTotalDaysOfMonth(year, month) : -1;
	    }



	    // Get Current Date and Time
	    
	    public static BikramCalendar now(String timezone) throws ParseException{
	        // Calling method: BikramCalendar x= BikramCalendar.now("s");
	        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of(timezone));
	        DateTimeModel d = new DateConverter().convertAdToBs(zdt.toLocalDate());
	        return new BikramCalendar(d.getDay(), d.getMonth(), d.getYear(), zdt.getHour(), zdt.getMinute(), zdt.getSecond());
	       // DateTimeModel x = Utils.getCurrentDateTimeBS();

	    }

	    // Method to return the current object
	    public BikramCalendar getInstance() throws CloneNotSupportedException{
	        return (BikramCalendar) this.clone();
	    }




	    // Clone method
	    @Override
	    protected Object clone() throws CloneNotSupportedException {
	        return super.clone();
	    }




	    // GETTER AND SETTER
	    public int getHour() {return hour;}


	    public int getMinute() {return minute;}


	    public int getSecond() { return second; }




	    public int getDay() { return day;    }


	    public int getMonth() { return month;    }


	    public int getYear() { return year;    }

	    public int getTotalDaysOfMonth() { return monthLastDay; }


	    
	    private int getTotalDaysOfMonth(int y, int m) {
	       // Log.e("XOCO","Year = "+y+" \n"+"Month = "+m);
	        return Constants.numberOfDaysInNepaliMonth.get(y)[m-1];
	    }








	    // PLUS, MINUS METHDOS
	    // range of date "1957 BS" to "2100 BS" for now
	    // Tested OK
	    public BikramCalendar plusYear(int years){
	        try {
	        	BikramCalendar newObj = (BikramCalendar) this.clone(); // Clone current instance
	            newObj.year += years; // Modify the cloned instance
	            return newObj; // Return the new instance
	        } catch (CloneNotSupportedException e) {
	            throw new RuntimeException("Cloning not supported", e);
	        }
	    }


	    public BikramCalendar minusYear(int years){
	    	 try {
		        	BikramCalendar newObj = (BikramCalendar) this.clone(); // Clone current instance
		            newObj.year -= years; // Modify the cloned instance
		            return newObj; // Return the new instance
		        } catch (CloneNotSupportedException e) {
		            throw new RuntimeException("Cloning not supported", e);
		        }
	    }



	    public BikramCalendar plusMonth(int months){
	        try {
	        	BikramCalendar newObj = (BikramCalendar) this.clone();
	            int totalMonth = (this.month+months);
	            // Calculate new month and adjust for 1-12 range
	            newObj.month = (totalMonth - 1) % 12 + 1; // Adjusting to ensure month is between 1 and 12
	            newObj.year =this.year+ (totalMonth-1)/12;
	            
	            
	            return newObj;
	        } catch (CloneNotSupportedException e) {
	            throw new RuntimeException("Cloning not supported", e);
	        }
	    }


	    public BikramCalendar minusMonth(int months) throws CloneNotSupportedException{
	    	BikramCalendar newObj = (BikramCalendar) this.clone();
	    	
	    	// Calculate total months (can be negative)
	        int totalMonth = this.month - months;

	        // Adjust for negative or zero totalMonth values
	        newObj.year = this.year + (totalMonth - 1) / 12; // Adjusting year based on total months
	        newObj.month = (totalMonth - 1) % 12 + 1;

	        if (newObj.month <= 0) {
	        	newObj.month += 12;
	        	newObj.year -= 1;
	        }
	        
	        return newObj;// 2110<=date<=1967 
	    }


	    // Disclaimer : Use it for days less than a year or 365 days. For faster excecution
	    
	    public BikramCalendar plusDays(int daysToAdd) throws CloneNotSupportedException{
	      //  Log.e("XOCO",daysToAdd+"");
	    	if(this.monthLastDay!=-1) {
	    		BikramCalendar newObj = (BikramCalendar) this.clone();

		        if (daysToAdd < 0) {
		            throw new IllegalArgumentException("Number of days to add cannot be negative.");
		        }

		        int totalDays = newObj.day + daysToAdd;
		        while (totalDays > newObj.monthLastDay) {
		            totalDays -= newObj.monthLastDay; // Adjust for current day
		            newObj.day = 0;

		            if (newObj.month == 12) { // Chaitra case
		                newObj.year++;
		                newObj.month = 1; // Reset to Baisakh
		            } else {
		                newObj.month++;
		            }
		            newObj.monthLastDay =  getTotalDaysOfMonth(newObj.year, newObj.month); // Update last day of new month
		        }

		        newObj.day=totalDays;  // Set final day after all adjustments
		        return newObj; // Return updated calendar object
	    	}else {
	    		return null;// 2110<=date<=1967 
	    	}
	    	
	    }


	    // Disclaimer : Use it for days less than a year or 365 days. For faster excecution
	    
	    public BikramCalendar minusDays(int daysToSubtract) throws CloneNotSupportedException {
	    	

	    	if(monthLastDay!=-1) {

	        // Clone the current object to avoid modifying it directly
	    	BikramCalendar newObj = (BikramCalendar) this.clone();

	        // Validate input
	        if (daysToSubtract < 0) {
	            throw new IllegalArgumentException("Number of days to subtract cannot be negative.");
	        }

	        // Calculate total days to subtract
	        int totalDays = newObj.day - daysToSubtract;

	        // Loop to adjust day, month, and year as necessary
	        while (totalDays < 1) { // Check if we need to go back to the previous month
	            if (newObj.month == 1) { // Baisakh case
	                newObj.year--;
	                newObj.month = 12; // Move to Chaitra
	            } else {
	                newObj.month--; // Move to the previous month
	            }

	            // Update last day of the new month
	            newObj.monthLastDay = getTotalDaysOfMonth(newObj.year, newObj.month);

	            totalDays += newObj.monthLastDay; // Add last month's days to totalDays
	        }

	        // Set the final day after adjustments
	        newObj.day = totalDays;
	        return newObj; // Return updated calendar object
	        
	    	}else {
	    		return null;// 2110<=date<=1967 
	    	}
	    }

	    
	    
	    public BikramCalendar plusMins(int minsToAdd) throws CloneNotSupportedException {
	    	
	    	if(this.monthLastDay!=-1) {

	        // Clone current calendar object
	        BikramCalendar newObj = (BikramCalendar) this.clone();


	        // Calculate total days, hours, and minutes to add
	        double totalDaysToAdd = (double) minsToAdd / MINUTES_IN_A_DAY;
	        double fractionalDays = totalDaysToAdd - (int) totalDaysToAdd;
	        int additionalHours = newObj.hour + (int) (fractionalDays * HOURS_IN_A_DAY);
	        int additionalMinutes = newObj.minute + (int) Math.ceil((fractionalDays * HOURS_IN_A_DAY - (int) (fractionalDays * HOURS_IN_A_DAY)) * MINUTES_IN_AN_HOUR);

	        // Adjust minutes to fit within an hour
	        if (additionalMinutes >= MINUTES_IN_AN_HOUR) {
	            additionalHours += additionalMinutes / MINUTES_IN_AN_HOUR;
	            additionalMinutes %= MINUTES_IN_AN_HOUR;
	        }

	        // Adjust hours to fit within a day
	        if (additionalHours >= HOURS_IN_A_DAY) {
	            totalDaysToAdd += additionalHours / HOURS_IN_A_DAY;
	            additionalHours %= HOURS_IN_A_DAY;
	        }

	        newObj.hour = additionalHours;
	        newObj.minute = additionalMinutes;

	        // Calculate total days including current day
	        totalDaysToAdd += newObj.day;
	    //  System.out.print("XOCO "+(int)totalDaysToAdd+" ----------"+  newObj.day);

	        // Update day and month based on total days
	        while ((int)totalDaysToAdd > newObj.monthLastDay) {

	            totalDaysToAdd -= newObj.monthLastDay; // Move to next month
	           // newObj.day = 0;

	            if (newObj.month == 12) { // Chaitra case
	                newObj.year++;
	                newObj.month = 1; // Reset to Baisakh
	            } else {
	                newObj.month++;
	            }

	            // Update last day of the new month
	            //System.out.println("XOCO ------------"+(int)totalDaysToAdd);
	           // Log.e("XOCO","YEAR="+newObj.getYear());
	            newObj.monthLastDay = Constants.numberOfDaysInNepaliMonth.get(newObj.year)[newObj.month];
	        }



	        newObj.day = (int) totalDaysToAdd; // Set final day after all adjustments
	        return newObj; // Return updated calendar object
	        
	    	}else {
	    		return null;// 2110<=date<=1967 
	    	}
	    }


	    
	    public BikramCalendar minusMins(int minsToSubtract) throws CloneNotSupportedException {
	    	
	    	if(this.monthLastDay!=-1) {

	        // Clone current calendar object
	        BikramCalendar newObj = (BikramCalendar) this.clone();


	        // Calculate total days, hours, and minutes to subtract
	        double totalDaysToSubtract = (double) minsToSubtract / MINUTES_IN_A_DAY;
	        double fractionalDays = totalDaysToSubtract - (int) totalDaysToSubtract;

	        int subtractedHours = newObj.hour - (int) (fractionalDays * HOURS_IN_A_DAY);
	        int subtractedMinutes = newObj.minute - (int) Math.ceil((fractionalDays * HOURS_IN_A_DAY - (int) (fractionalDays * HOURS_IN_A_DAY)) * MINUTES_IN_AN_HOUR);

	        // Adjust minutes to fit within an hour
	        if (subtractedMinutes < 0) {
	            subtractedHours -= 1; // Borrow an hour
	            subtractedMinutes += MINUTES_IN_AN_HOUR; // Add 60 minutes
	        }

	        // Adjust hours to fit within a day
	        if (subtractedHours < 0) {
	            totalDaysToSubtract += 1; // Borrow a day
	            subtractedHours += HOURS_IN_A_DAY; // Add 24 hours
	        }

	        newObj.hour = subtractedHours;
	        newObj.minute = subtractedMinutes;

	        // Calculate total days including current day
	        // totalDaysToSubtract += newObj.day;

//	        System.out.println(totalDaysToSubtract+"days,   "+newObj.hour+":"+ newObj.minute);


	        // Calculate total days to subtract
	        int totalDays = newObj.day - (int)totalDaysToSubtract;

	        // Loop to adjust day, month, and year as necessary
	        while (totalDays < 1) { // Check if we need to go back to the previous month
	            if (newObj.month == 1) { // Baisakh case
	                newObj.year--;
	                newObj.month = 12; // Move to Chaitra
	            } else {
	                newObj.month--; // Move to the previous month
	            }

	            // Update last day of the new month
	            newObj.monthLastDay = getTotalDaysOfMonth(newObj.year, newObj.month);

	            totalDays += newObj.monthLastDay; // Add last month's days to totalDays
	        }

	        // Set the final day after adjustments
	        newObj.day = (int)totalDays;
	        return newObj;
	    	}else {
	    		return null;// 2110<=date<=1967 
	    	}



	    }








	    // MISC METHODS


	    
	    public static int getMeFirstDayOfMonth(int yyyy, int mm) { // baisakh=1
	    	
	    	if(yyyy <= Constants.BIKRAM_SAMBAT_MAX_LIMIT && yyyy >= Constants.BIKRAM_SAMBAT_MIN_LIMIT) {
	        Integer []monthsOfSelectedYear =Constants.numberOfDaysInNepaliMonth.get(yyyy);

	        int totalDays =0;
	        // 0. Check if it has year with Baisakh 1st as Sunday. & get nearest Reference year with sunday as 1st of Baishak
	        boolean givenYearHasBaishak1asSunday=false;
	        int referenceYear=1970;
	        for(int i=0;i<yearsWithBaishakh1stAsSunday.length;i++){

	            int yyyy1 = yearsWithBaishakh1stAsSunday[i];
	            if(yyyy>=yyyy1){                         // If year is less than year on array then there's no point in moving forward
	                referenceYear = yyyy1;
	                if(yyyy == yyyy1){
	                    givenYearHasBaishak1asSunday=true;
	                    break;
	                }
	            }else{
	                break;
	            }
	        }

	        // 1. calculate sum of all month days before selected year : d1
	        if(!givenYearHasBaishak1asSunday){
	            totalDays= totalDays+ getDaysBetweenYears(referenceYear,yyyy);
	        }

	        // 2. Calculate sum of all month days before selected month in selected year : d2
	        totalDays= totalDays+ getDaysBeforeSelectedMonth(mm, monthsOfSelectedYear);


	        // 3. Divide TD by 7 and take remainder (R).
	        int completedDaysNumber = totalDays%7;

	        // 4. Add 1 to remainder. firstDayOfMonth = R+7.
	        return completedDaysNumber+1;                              // Output: Here, sunday=1
	    	}else {
	    		return -1;// 2110<=date<=1967 
	    	}
	    }


	    
	    private static int getDaysBetweenYears(int startYear, int endYear) {
	        int totalDays=0;
	        for(int key = startYear;key<endYear;key++){
	            Integer []tempMonth = Constants.numberOfDaysInNepaliMonth.get(key);
	            for(int m=0;m<12;m++){
	                totalDays = totalDays+ tempMonth[m];
	            }
	        }
	        return totalDays;
	    }

	    
	    public static int getDaysBetweenDates(BikramCalendar startYear, BikramCalendar endYear) {
	    	if(startYear.getTotalDaysOfMonth() !=-1 && endYear.getTotalDaysOfMonth() !=-1) {
	    		
	    		int totalDays=0;

	 	        if(startYear.getYear()==endYear.getYear()){
	 	            Integer[] monthsOfYear = Constants.numberOfDaysInNepaliMonth.get(startYear.getYear());
	 	            assert monthsOfYear != null;
	 	            totalDays = (monthsOfYear[startYear.getMonth()]-startYear.getDay());

	 	            for(int i=startYear.getMonth()+1;i<endYear.getMonth()-1;i++){
	 	                totalDays += monthsOfYear[i];
	 	            }

	 	            totalDays = endYear.getDay()-1;

	 	        }else{

	 	            // 1. Get all days of startYear (all month days + day)
	 	            Integer[] monthsOfYear = Constants.numberOfDaysInNepaliMonth.get(startYear.getYear());

	 	            // Calculate remaining days of startYear
	 	            assert monthsOfYear != null;
	 	            totalDays = (monthsOfYear[startYear.getMonth()]-startYear.getDay()) + getDaysAfterSelectedMonth(startYear.getMonth(),monthsOfYear);

	 	            // 2. Get all days between (startYear+1 & endYear)
	 	            totalDays += getDaysBetweenYears(startYear.getYear()+1,endYear.getYear());

	 	            // 3. Get all days of endYear (all month days + day)
	 	            monthsOfYear = Constants.numberOfDaysInNepaliMonth.get(endYear.getYear());
	 	            totalDays += endYear.getDay()-1 + getDaysBeforeSelectedMonth(endYear.getMonth(),monthsOfYear);
	 	        }

	 	        return totalDays;

	    	}else {
	    		return -1;
	    	}
	    	
	       	        
	        

	    }


	    private static int getDaysBeforeSelectedMonth(int mm, Integer[] monthsOfSelectedYear) {
	        int days=0;
	        for(int n=0;n<mm-1;n++){
	            days = days+ monthsOfSelectedYear[n];
	        }
	        return days;
	    }

	    private static int getDaysAfterSelectedMonth(int mm, Integer[] monthsOfSelectedYear) {
	        int days=0;
	        for(int n=mm+1;n<12;n++){
	            days = days+ monthsOfSelectedYear[n];
	        }
	        return days;

	    }


	    
	    public static int getDayOfWeek(int yyyy,  int mm, int dd) {
	        LocalDate cal = DateConverter.convertBsToAd(dd,mm+1,yyyy);
	        return cal.getDayOfWeek().getValue();
	    }


	    
	    public int getDayOfWeek(){
	        LocalDate cal = DateConverter.convertBsToAd(day,month+1,year);
	        return cal.getDayOfWeek().getValue();
	    }



	    // NO OF DAYS COMPLETED IN A YEAR. It includes current day
	    
	    public int getElapsedDaysOfCurrentYear() {
	    	if(monthLastDay!=-1) {

	        int total=0;
	        Integer []s =Constants.numberOfDaysInNepaliMonth.get(year);
	        for(int i=0;i<s.length;i++){
	            if(i==month){
	                total= total+day;
	                break;
	            }else{
	                total=total+s[0];
	            }
	        }
	        return total;
	        
	    	}else {
	    		return  -1; // 2110<=date<=1967 
	    	}
	    	
	    }

	    // NUMBER  OF DAYS IN A YEAR
	    
	    public int totalDaysInYear() {
	    	if(monthLastDay!=-1) {
		        int total=0;
		        Integer []s =Constants.numberOfDaysInNepaliMonth.get(year);
		        for(int i=0;i<s.length;i++){
		            total=total+s[0];
		        }
		        return total;
	    	}{
	    		
	    		return -1;	    		// 2110<=date<=1967 

	    	}

	    }


	    // Change AD to BS. It doesnot support for Timezone for ease. You can add if required
	    
	    public LocalDateTime dateInAD() throws ParseException{
	    	if(monthLastDay!=-1) {
	    		return LocalDateTime.of(DateConverter.convertBsToAd(day,month,year), LocalTime.of(hour, minute, second));
	    	}else {
	    		// 2110<date<1967 
	    		return null;
	    	}
	    }















	    // USEFUL FLAG METHODS LIKE: isAfter,  isBefore

	    public boolean isAfter(BikramCalendar base){

	        double dateInMins = this.getYear()*365.2425*24*60 + this.getMonth()*30*24*60 +this.getDay()*24*60 +this.getHour()*60+this.getMinute();
	        double baseInMins = base.getYear()*365.2425*24*60 + base.getMonth()*30*24*60 +base.getDay()*24*60 +base.getHour()*60+base.getMinute();

	        if(dateInMins>baseInMins){
	            return true;
	        }else{
	            return false;
	        }

	    }


	    public boolean isBefore(BikramCalendar base){

	        double dateInMins = this.getYear()*365.2425*24*60 + this.getMonth()*30*24*60 +this.getDay()*24*60 +this.getHour()*60+this.getMinute();
	        double baseInMins = base.getYear()*365.2425*24*60 + base.getMonth()*30*24*60 +base.getDay()*24*60 +base.getHour()*60+base.getMinute();

	        if(dateInMins<baseInMins){
	            return true;
	        }else{
	            return false;
	        }

	    }







	    // For date(01/10/2000  & 01/09/2005) output is 4  .
	    // For date(01/10/2000  & 01/10/2005) output is 5  .

	    public static int getDurationYear(BikramCalendar start,BikramCalendar end){
	        int yearDiff = end.getYear() - start.getYear();
	        if (end.getMonth() < start.getMonth() || (end.getMonth() == start.getMonth() && end.getDay() < start.getDay())) {
	            yearDiff--;
	        }
	        return yearDiff;
	    }















	    // DISPLAY OF DATE


	    public String toNepaliFormat(int formatID ) {
	    	
	    	// You are free to add your style as you like
	        switch (formatID) {
	            case 0:
	                return day+"-"+month+"-"+year; // dd/mm/yyyy
	            case 1:
	                return Constants.nepaliNumerals[day]+"-"+Constants.nepaliNumerals[month]+"-"+Utils.convertToNepali(year+""); // dd-mm-yyyy

	            case 2:
	                return year+"/"+month+"/"+day; // yyyy/mm/dd
	            case 3:
	                return Constants.nepali_months[month-1]+" "+day; // Baishak 3
	            case 4:
	                return year+", "+Constants.nepali_months[month-1]+" "+day;  //"2080, baishak 21"
	            case 5:
	                return day+" "+Constants.nepali_months[month-1]+", "+year;  //"21 baishak, 2080"

	            case 6:
	                return getDate()+", "+getTime();  //"21 baishak, 2080"
	                
	            case 7:
	                return Constants.nepali_months[month-1]+" "+Utils.convertToNepali(year+"");  //" बैशाख २०८०"

	            default:
	                return "";
	        }
	        // formats: 0:, 1:"", 2 : dd/mm/yyyy", 3: "Bai 3", 4: "Baishak 3", 5: 6: "बैशाख "


	    }


	    @Override
	    public String toString() {
	        //   return "BikramCalendar ["+ day +"/"+ (month+1) +"/"+year+"  T "+hour+":"+minute+":"+second+" ] & totalDays =" +monthLastDay;
	        return "BikramCalendar ["+ day +"/"+ month +"/"+year+"  T "+hour+":"+minute+":"+second+" ] ";
	    }


	    public String getDate(){
	        return  day +"/"+ month +"/"+year;
	    }


	    public String getTime(){
	        return  hour+":"+minute+":"+second;
	    }

	    
	    
	    
	    // Display Calendar for particular month
	    public void cal() {
	    	System.out.println("\n          "+toNepaliFormat(7));
	        System.out.println("---------------------------");
	        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
	        System.out.println("---------------------------");
	        int count = 1;
	        int firstDayOfMonth= getMeFirstDayOfMonth(year,month) ;
	        if (firstDayOfMonth != 8)
	            for (int i = 1; i < firstDayOfMonth; i++, count++) {
	                System.out.printf("%-4s", "");
	            }
	        for (int i = 1; i <= monthLastDay; i++, count++) {
	            System.out.printf("%-4d", i);
	            if (count % 7 == 0) {
	                System.out.println();
	            }
	        }
	        System.out.println("\n---------------------------");
	    }

}
