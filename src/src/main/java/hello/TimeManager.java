package src.main.java.hello;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeManager {

  public TimeManager() {}

  public String getDateTime()
  {
    Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    return sdf.format(cal.getTime());
  }
}
