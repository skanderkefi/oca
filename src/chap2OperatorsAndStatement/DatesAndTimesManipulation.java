package chap2OperatorsAndStatement;
import java.time.*;
public class DatesAndTimesManipulation {
//public static void main(String[] args) {
//	System.out.println(LocalDate.now());
//	System.out.println(LocalTime.now());
//	System.out.println(LocalDateTime.now());
//	//=>
//	//2015-01-20
//	//12:45:18.401
//	//2015-01-20T12:45:18.401
//
//
//
//	LocalTime time1 = LocalTime.of(6, 15); // hour and minute
//	LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
//	LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds
//
//
//	LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
//	LocalDate date2 = LocalDate.of(2015, 1, 20);
//
//
//	LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
//
//	LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
//
//
////	LocalDate d = new LocalDate(); // DOES NOT COMPILE because date and time constructors are privates that why you are forced 
//	//to use the static methods w kenou yestaamlou feha fl old way
//
//	LocalDate.of(2015, Month.JANUARY, 32); // throws DateTimeException
	
	
	//LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
	//date = date.plusMinutes(1); // DOES NOT COMPILE
//
//	Period period = Period.ofMonths(1);  // create a periode (1 month)
//	Period everyYearAndAWeek = Period.of(1, 0, 7); // every year and 7 days
//	Period wrong = Period.ofYears(1).ofWeeks(1); // every week but not every 1 year and 1 week because that's a static method and
//	//You will get a compiler warning about this.
//
//	date.plus(period) // add a period to our date
//
//	LocalDateTime dateTime = LocalDateTime.of(date, time);System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
//	//ça permet de formater l'objet datetime ou time ou date (ça donne 2020-01-20T11:12:34
//	)
//
//
//	DateTimeFormatter shortDateTime =DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
//	shortDateTime.format(time)); // UnsupportedTemporalTypeException (ne peut pas être formaté comme date)
//	System.out.println(shortDateTime.format(dateTime)); // 1/20/20
//
//
//	DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
//	DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
//	System.out.println(shortF.format(dateTime)); // 1/20/20 11:12 AM
//	System.out.println(mediumF.format(dateTime)); // Jan 20, 2020 11:12:34 AM
//
//	DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
//	System.out.println(dateTime.format(f)); // January 20, 2020, 11:12
//
//
//	 DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm");  f.format(date);
//	 // throws exception
//
//
//	//Parsing Dates and Times:
//	  
//	DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
//	LocalDate date = LocalDate.parse("01 02 2015", f);
//	// 2015-01-02
//
//

//}
}
