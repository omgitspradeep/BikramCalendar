import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class DateConverter {

	  // I. BIKRAM SAMBAT

    // AD TO BS
    
    public DateTimeModel convertAdToBs(LocalDate inputAdDate) throws ParseException {

        int adYear =inputAdDate.getYear();
        TempLookUpModel t = Constants.adEquivalentDatesForNewNepaliYear.get(adYear);
        int equivalentNepaliYear = t.getBsYear();
        Integer[] monthDay = Constants.numberOfDaysInNepaliMonth.get(equivalentNepaliYear);
        LocalDate lookupNearestAdDate = t.getAdDate();

        if (inputAdDate.isBefore(lookupNearestAdDate)) {
            //            System.out.println(inputAdDate.toString() +"  is before  "+lookupNearestAdDate.toString());
            if (adYear==Constants.BIKRAM_SAMBAT_MIN_LIMIT) {
                System.out.println("Date supplied before supported date.");
            }

            t=Constants.adEquivalentDatesForNewNepaliYear.get(adYear-1);
            equivalentNepaliYear =t.getBsYear();
            monthDay = Constants.numberOfDaysInNepaliMonth.get(equivalentNepaliYear);
        }

        //Positive day difference
        int difference = (int) ChronoUnit.DAYS.between(lookupNearestAdDate, inputAdDate);
        // System.out.println(difference+"");
        if(difference<0){
            int totalDaysInYear= getMeTotalDaysOfYear(monthDay);
            difference = totalDaysInYear+difference;
        }
        //  System.out.println(difference+"");

        int nepMonth = 0;
        int nepDay=1;
        int daysInMonth;

        while (difference != 0) {
            if (difference >= 0) {
                //number of days in  Nepali months
                daysInMonth = monthDay[nepMonth];
                nepDay++;
                if (nepDay > daysInMonth) {
                    nepMonth++;
                    nepDay = 1;
                }
                if (nepMonth >= 12) {
                    equivalentNepaliYear++;
                    nepMonth = 0;
                }
                difference--;
            }
        }

        // Increment month by 1, because it was initialized as 0
        return new DateTimeModel(equivalentNepaliYear,nepMonth+1,nepDay);


    }

    
    private static int getMeTotalDaysOfYear(Integer []monthDay) {
        int sum = 0;
        for (int i=0;i<12;i++) {
            sum += monthDay[i];
        }
        return sum;
    }


    
    // BS TO AD

    
    public static LocalDate convertBsToAd(int nepaliDayOfMonth, int nepaliMonth, int nepaliYear) {
        long numberOfDaysPassed = nepaliDayOfMonth - 1;
        for (int i = 0; i <= nepaliMonth - 2; i++) {
            numberOfDaysPassed += Objects.requireNonNull(Constants.numberOfDaysInNepaliMonth.get(nepaliYear))[i];
        }
        LocalDate ld =Constants.adEquivalentDatesForNewNepaliYear.get(getConstantsIndex(nepaliYear)).getAdDate();
        ld=ld.plusDays(numberOfDaysPassed);
        return ld;
    }

    
    
    public boolean validationOfDateInBikramSamvat(int monthDayBS, int monthNumBS, int yearNumBS) {
        if (yearNumBS < Constants.BIKRAM_SAMBAT_MIN_LIMIT) {
        	
        } else if (yearNumBS > (Constants.BIKRAM_SAMBAT_MIN_LIMIT + Constants.numberOfDaysInNepaliMonth.size() - 1)) {
        	
        } else {
        	
            if (monthNumBS >= 1 && monthNumBS <= 12) {
                int dayOfMonth = Objects.requireNonNull(Constants.numberOfDaysInNepaliMonth.get(yearNumBS))[monthNumBS - 1];
                if (monthDayBS <= dayOfMonth) {
                    return true;
                } 
            }
        }
        return false;
    }
    

    private static int getConstantsIndex(int yearNumBS) {
        return yearNumBS - 57;  // (bsYear - Constants.BIKRAM_SAMBAT_MIN_LIMIT)
    }



}
