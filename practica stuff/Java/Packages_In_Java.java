

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;



public class Packages_In_Java {
    public static void main(String[] args) {
        Scanner timeinput = new Scanner (System.in);

        int hour1 = 0, minute1 = 0, hour2 = 0, minute2 = 0;
        System.out.print("Input your 1st hour: ");
        hour1 = timeinput.nextInt();
        System.out.print("Input your 1st minute: ");
        minute1 = timeinput.nextInt();

        System.out.print("Input your 2nd hour: ");
        hour2 = timeinput.nextInt();
        System.out.print("Input your 2nd minute: ");
        minute2 = timeinput.nextInt();
        System.out.println("------------------");//Method 1
        int totalhour = 0, totalminute = 0, totalseconds = 0;
        if(hour1 <= hour2){
            totalhour = (hour2 - hour1);
        }   else{
            totalhour = (hour1 - hour2);
        }
        
        if(minute1 <= minute2){
            totalminute = (minute2 - minute1);
        }   else{
            totalminute = (minute1 - minute2);
        }

        totalseconds = (totalhour*3600) + (totalminute*60);

        System.out.println("It is total of: "+totalseconds+" seconds between the times!");
        //Above solution does not use java.time => not what the teacher wants
        System.out.println("------------------");//Method 2
        LocalTime time1 = LocalTime.of(hour1,minute1);
        LocalTime time2 = LocalTime.of(hour2,minute2);
        Duration timepassed = Duration.between (time1,time2);

        System.out.println("Time taken is in: "+ Math.abs(timepassed.getSeconds()) +" seconds");
        //Math.abs() stands for absolute value
        return;
    }
}
    

