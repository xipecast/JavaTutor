import java.util.Scanner;

public class ConvertTime {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("seconds do you have?");
    // convert seconds to minutes
    // magic number definitions:
    int SECS_PER_HOUR = 3600;
    // int MINS_PER_HOUR = 60;
    int SECS_PER_MIN = 60;
    // for time?
    int seconds, minutes, hours, rem_seconds;
    seconds = 0;

    int remainder = seconds % SECS_PER_HOUR;

    seconds = in.nextInt();

    minutes = (seconds / SECS_PER_MIN);

    // prompt the user and get the value

    hours = (int) (seconds);

    hours = (seconds / SECS_PER_HOUR);
    rem_seconds = (seconds - hours - minutes);

    // convert and output the result
    // inches = (int) (cm / CM_PER_INCH);
    // feet = inches / IN_PER_FOOT;
    // remainder = inches % IN_PER_FOOT;

    // System.out.printf("%.2f cm = %d ft, %d in\n",
    // cm, feet, remainder);
    //
    System.out.printf("You have " + hours + " hours ," + minutes +
        " minutes and " + rem_seconds + " seconds ");
  }
}
