import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class weekendCal {
	public static void main(String[] args) throws ParseException {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	    Date date1 = (Date) df.parse("10/08/2013");
	    Date date2 = (Date) df.parse("21/08/2013");
	    Calendar cal1 = Calendar.getInstance();
	    Calendar cal2 = Calendar.getInstance();
	    cal1.setTime(date1);
	    cal2.setTime(date2);

	    int numberOfDays = 0;
	    while (cal1.before(cal2)) {
	        if ((Calendar.SATURDAY != cal1.get(Calendar.DAY_OF_WEEK))
	           &&(Calendar.SUNDAY != cal1.get(Calendar.DAY_OF_WEEK))) {
	            numberOfDays++;
	        }
	        cal1.add(Calendar.DATE,1);
	    }
	    System.out.println(numberOfDays);
	}

}
