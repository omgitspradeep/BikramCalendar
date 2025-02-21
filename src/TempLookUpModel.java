import java.time.LocalDate;

public class TempLookUpModel {
	 int adYear;
	    int bsYear;
	    int adNewYearMonth =4;
	    int adNewYearDay;

	    public TempLookUpModel(int adYear, int bsYear, int getAdNewYearDay) {
	        this.adYear = adYear;
	        this.bsYear = bsYear;
	        this.adNewYearDay = getAdNewYearDay;
	    }

	    public int getAdYear() {
	        return adYear;
	    }

	    public LocalDate getAdDate(){
	        return LocalDate.of(adYear,adNewYearMonth,adNewYearDay);
	    }

	    public int getBsYear() {
	        return bsYear;
	    }

	    public int getAdNewYearMonth() {
	        return adNewYearMonth;
	    }

	    public int getGetAdNewYearDay() {
	        return adNewYearDay;
	    }

}
