package DateTime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

enum months {Jan, Feb, Marh, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec};

public class DateTimeClass {
  public void dateTime() {
    SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm.sss");
    System.out.printf("%n%s%n", sdf.format(new Date()));
//    LocalDateTime ldt = new LocalDateTime(currentDateTime);
//    ZonedDateTime zdt = new ZonedDateTime();
  }
}
