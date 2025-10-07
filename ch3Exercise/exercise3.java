// Exercise 3.3.
// Write a program that converts a total number of seconds to hours, minutes,
// and seconds.
// It should (1) prompt the user for input, (2) read an integer from the
// keyboard, (3) calculate the result, and (4)
// use printf to display the output. For example, "5000 seconds = 1 hours, 23
// minutes, and 20
// seconds" .
// **Hint:* Use the remainder operator.*
//

import java.util.Scanner;

public class ConvertTime {
  public static void main(String[] args) {
    // convert seconds to minutes
    // magic number definitions:
    int SECS_PER_HOUR = 3600;
    int MINS_PER_HOUR = 60;
    int SECS_PER_MIN = 60;
    // for time?
    int seconds, minutes, hours;

    int remainder = seconds % SECS_PER_HOUR;

    Scanner in = new Scanner(System.in);

    seconds = in.nextInt();

    minutes = (seconds / SECS_PER_MIN);

    hours = (seconds / SECS_PER_HOUR);

    // prompt the user and get the value

    System.out.print("seconds do you have?");

    hours = (int) (seconds);

    // convert and output the result
    // inches = (int) (cm / CM_PER_INCH);
    // feet = inches / IN_PER_FOOT;
    // remainder = inches % IN_PER_FOOT;

    // System.out.printf("%.2f cm = %d ft, %d in\n",
    // cm, feet, remainder);
    //
    System.out.printf("You have " + hours + "hours," + minutes +
        " minutes and " + seconds + " seconds ");
  }
}
