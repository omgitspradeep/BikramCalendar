
public class DateTimeModel {
	int year;
    int month;
    int day;
    String nameOfDay;
    int weekDay;

    public DateTimeModel(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    @Override
    public DateTimeModel clone() {
        try {
            return (DateTimeModel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // This should never happen
        }
    }

    public String getNameOfDay() {
        return nameOfDay;
    }

    public void setNameOfDay(String nameOfDay,int dayNumber) {
        this.nameOfDay = nameOfDay;
        this.weekDay=dayNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String toStringMY() {
        return month+"/"+year;
    }

    @Override
    public String toString() {
        return day+"/"+month+"/"+year;
    }




    // This is to display day after 12'O clock and before sunrise
    public String midNightDay() {
        return (day-1)+"/"+month+"/"+year;
    }


    public String getNepaliDate() {
        return  Utils.getMonthNepaliName(month)+" "+ Constants.nepaliNumerals[day]+",  " + Utils.convertToNepali(year+"");

    }

    public String getFormattedBS() {
        return  Constants.nepaliNumerals[day]+" - "+Constants.nepaliNumerals[month]+" - "+Utils.convertToNepali(year+"");
    }


    public int getWeekDay() {
        return weekDay;
    }


}
