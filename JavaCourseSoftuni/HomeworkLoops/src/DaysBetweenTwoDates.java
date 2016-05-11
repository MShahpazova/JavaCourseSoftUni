import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class DaysBetweenTwoDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
        String firstDateStr = scanner.nextLine();
        String secondDateStr = scanner.nextLine();
        Date firstDate = sdf.parse(firstDateStr, new ParsePosition(0));
        Date secondDate = sdf.parse(secondDateStr, new ParsePosition(0));
        long diff = Math.abs(firstDate.getTime() - secondDate.getTime());
        System.out.printf("%d", TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));

    }
}
