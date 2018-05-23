package package1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTime {

	Date date;

	public void getcurrentTime() {

		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Date dt = new Date();
		Calendar clnder = Calendar.getInstance();
		this.date = clnder.getTime();

	}

}
