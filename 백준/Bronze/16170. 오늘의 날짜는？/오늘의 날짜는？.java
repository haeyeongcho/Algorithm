import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime utcNow = ZonedDateTime.now(ZoneId.of("UTC"));

        int year = utcNow.getYear();
        int month = utcNow.getMonthValue();
        int day = utcNow.getDayOfMonth();

        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
    }
}