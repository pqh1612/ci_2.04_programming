import java.util.Scanner;
import java.time.LocalTime;
import java.time.*; //get everything(?) from [time] (not sure if works, needs testing)
import java.time.format.DateTimeFormatter; // more info at https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

public class HelloTimeOfDay { // public class [filename]
    public static void main(String[] args)
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("H");
        DateTimeFormatter twelvehour = DateTimeFormatter.ofPattern("hh");
        int timeLabel12 = Integer.parseInt(LocalTime.now().format(twelvehour));
        int timeLabel = Integer.parseInt(LocalTime.now().format(dtf));
        Scanner nameinput = new Scanner(System.in);
        System.out.print("Input your first name: ");
        String firstname = nameinput.next();
        System.out.print("Input your last name: ");
        String lastname = nameinput.next();
        System.out.println();
        System.out.print("Hello " + firstname + " " + lastname + "! It's " + timeLabel12 + " in the "); //timeLabel12 for AM&PM, timeLabel for 24h.
        if (timeLabel >= 7 && timeLabel < 13) { //Use timeLabel to recognize Morning/Afternoon/Evening easier than 12h format.
            System.out.print("Morning!");
        } else if (timeLabel >= 13 && timeLabel < 18) {
            System.out.print("Afternoon!");
        } else {
            System.out.print("Evening!");
        }
        // Line 19: double ++ ONLY between " ".
    }
}