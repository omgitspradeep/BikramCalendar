# BikramCalendar
A complete Calendar solution for Bikram Samvat from date 1967 to 2110.




// Get current date and time 

BikramCalendar currentTime = BikramCalendar.now("Asia/Kathmandu");
currentTime.cal();
		
		
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
		
		




1. To get Date in different formats

  
		System.out.println(currentTime.getDate());         // Output: 9/11/2081
		System.out.println(currentTime.getTime());         // Output: 18:5:47
		System.out.println(currentTime.toNepaliFormat(0)); // Output: 9-11-2081
		System.out.println(currentTime.toNepaliFormat(1)); // Output: ९/११/२०८१
		System.out.println(currentTime.toNepaliFormat(2)); // Output: 2081/11/9
		System.out.println(currentTime.toNepaliFormat(3)); // Output: फागुन 9
		System.out.println(currentTime.toNepaliFormat(4)); // Output: 2081, फागुन 9
		System.out.println(currentTime.toNepaliFormat(5)); // Output: 9 फागुन, 2081
		System.out.println(currentTime.toNepaliFormat(6)); // Output: 9/11/2081, 18:5:47





2. Find total days of a month

   >int totalDays = bc2.getTotalDaysOfMonth();





   
4. Create BikramSamvat date object
   ```
    BikramCalendar bc1 = BikramCalendar.now("Asia/Kathmandu");
    BikramCalendar bc2 = new BikramCalendar(28, 2, 2049,14,54,0);
    BikramCalendar bc3 = new BikramCalendar(28, 2, 2049);
   ```






5.  Adding and subtracting years

    ```
      BikramCalendar bc2 = new BikramCalendar(28, 10,2081,14,54,0);
  		BikramCalendar bc3 = bc2.minusYear(5); 
  		BikramCalendar bc4 = bc2.plusYear(5);
  		System.out.println(bc2.getDate()+" - 12 months = "+bc3.getDate());
  		System.out.println(bc2.getDate()+" + 12 months = "+bc4.getDate());
  
      Output:
      28/10/2081 - 12 months = 28/10/2076
      28/10/2081 + 12 months = 28/10/2086
    ```







6.Adding and subtracting months
```
		BikramCalendar bc5= bc2.minusMonth(12); 
		BikramCalendar bc6=bc2.plusMonth(12);
		System.out.println(bc2.getDate()+" - 12 months = "+bc5.getDate());
		System.out.println(bc2.getDate()+" + 12 months = "+bc6.getDate());
		
    Output:
    28/10/2081 - 12 months = 28/10/2080
    28/10/2081 + 12 months = 28/10/2082
```





7.  Adding and Subtracting in DAYS  ( 2110<date<1967 )

```
		  BikramCalendar bc7= bc2.minusDays(9);
		  BikramCalendar bc8=bc2.plusDays(9); 
		  System.out.println(bc2.getDate()+" - 9 days = "+bc7.getDate());
		  System.out.println(bc2.getDate()+" + 9 days = "+bc8.getDate());

      Output:
      28/10/2081 - 9 days = 19/10/2081
      28/10/2081 + 9 days = 7/11/2081
```
		  
8. Adding and subtracting in MINUTES ( 2110<date<1967 )
```
      BikramCalendar bc9= bc2.minusMins(120);
		  BikramCalendar bc10=bc2.plusMins(120);
		  System.out.println(bc2+" - 2 hours= "+bc9);
		  System.out.println(bc2+" + 2 hours= "+bc10);

      Output:
      BikramCalendar [28/10/2081  T 14:54:0 ]  - 2 hours= BikramCalendar [28/10/2081  T 12:54:0 ] 
      BikramCalendar [28/10/2081  T 14:54:0 ]  + 2 hours= BikramCalendar [28/10/2081  T 16:54:0 ] 

```





OTHER IMPORTANT FUNCTIONALITIES

1. To know day of any date  1: sunday , 7:saturday

```
  int dayOfWeek=BikramCalendar.getDayOfWeek(2081,11,9);   
  System.out.println(dayOfWeek);
  Output : 6 (i.e Friday)
```




2. To know the starting day of Bikram Samvat month (sunday=1)
```
    int firstDayOfMonth=BikramCalendar.getMeFirstDayOfMonth(2081,11);   
    System.out.println(firstDayOfMonth);
    Output: 5 (i.e. Falgun of 2081 starts with Thursday) 
```






3. To find the number of days between two Bikram samvat years
   ```
   BikramCalendar currentTime = BikramCalendar.now("Asia/Kathmandu");
   BikramCalendar myDOB = new BikramCalendar(28,3,2049,14,54,0);
   int totaldays = BikramCalendar.getDaysBetweenDates(myDOB, currentTime);
   System.out.println("I am "+totaldays+ " days old.");
   
   Output:I am 11880 days old.
   ```
		



 
4. To find the number of YEARS between two Bikram samvat years

   ```
   BikramCalendar currentTime = BikramCalendar.now("Asia/Kathmandu");
   BikramCalendar myDOB = new BikramCalendar(28,3,2049,14,54,0);
   int totalYears = BikramCalendar.getDurationYear(myDOB, currentTime);
   System.out.println("I am "+totalYears+ " years old.");

   Output:I am 32 years old.

   ```





5. No of days completed for particular BS date.
  ```
   BikramCalendar currentTime = BikramCalendar.now("Asia/Kathmandu");
  int elapsedDays=currentTime.getElapsedDaysOfCurrentYear();
	System.out.println("Given date has completed "+elapsedDays+ " days / "+ currentTime.totalDaysInYear());

  Output:
  Given date has completed 350 days / 372
  ```




6. COnvert your BS date in AD
```
    
    LocalDateTime currentTimeAD = currentTime.dateInAD();
    System.out.println(currentTime.getDate() +" BS  =->  "+ currentTimeAD.toLocalDate()+" AD");

    Output:
    9/11/2081 BS  =->  2025-02-21 AD

```


7. COnvert your AD date in BS
```
    
		LocalDate dateInAD = LocalDate.of(2025, 02, 21);
		DateTimeModel myBSDate = new DateConverter().convertAdToBs(dateInAD);
		System.out.println(dateInAD +" AD  =->  "+ myBSDate+" BS");
		
    Output:
    2025-02-21 AD  =->  9/11/2081 BS

```

  

8. To know if date1 comes after or before date2

```
   
   BikramCalendar myTime = currentTime.plusMins(10);
   System.out.println(myTime.isBefore(currentTime));
   System.out.println(myTime.isAfter(currentTime));

    Output:
    false
    true
```






  
