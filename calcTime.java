import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class calcTime {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first time in format (hh:mm:ss): ");
        String t1 = scan.nextLine();

        System.out.println("Enter second time in format (hh:mm:ss): ");
        String t2 = scan.nextLine();

        Date d1 = null;
        try {
            d1 = sdf.parse(t1);
            System.out.println("Time 1 is " + d1.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date d2 = null;
        try {
            d2 = sdf.parse(t2);
            System.out.println("Time 2 is " + d2.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        /*long diff = 0;
        if (d1.after(d2)){
            diff = d2.getTime() - d1.getTime();
        }
        else if (d1.before(d2)){
            diff = d1.getTime() - d2.getTime();
        }*/

        long diff = Math.abs(d1.getTime() - d2.getTime());
        long diffSeconds = diff / 1000 % 60;
        long diffMinutes = diff / (60 * 1000) % 60;
        long diffHours = diff / (60 * 60 * 1000) % 24;

        System.out.println("The difference is: ");
        System.out.print(diffHours + " hours, ");
        System.out.print(diffMinutes + " minutes, ");
        System.out.print(diffSeconds + " seconds.");
    }
}
