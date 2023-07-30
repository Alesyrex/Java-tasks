package kap.newbie.short_topics.date.test1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author Alexandr Korovkin
 */
public class Test {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getTime() + " " + System.currentTimeMillis());

        Calendar calendar = new GregorianCalendar(2000,Calendar.JANUARY,25);
        calendar.set(Calendar.HOUR,14);

        calendar.add(Calendar.MONTH,-3);
        System.out.println(calendar.getTime());
        calendar.roll(Calendar.MONTH,3);
        System.out.println(calendar.getTime());

        calendar.set(Calendar.ERA,GregorianCalendar.BC);
        DateFormat df = new SimpleDateFormat("HH:mm:ss dd-MMMM-yyy G");
        System.out.println(df.format(calendar.getTime()));

        String newDateString = "16 сентября 1990 н. э. 10:30:00";
        DateFormat format = new SimpleDateFormat("dd MMMM y G HH:mm:ss");

        try{
            Date myBD = format.parse(newDateString);
            System.out.println(myBD);
            System.out.println(format.format(myBD));
        }catch (ParseException exception){
            exception.printStackTrace();
        }

    }
}
