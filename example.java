public class example {
    public static void main (String[] args) {
//declaration statements
    String message;
    int x;
    String firstName;
    String lastName;
    int hour, minute;
    message = "Hello"; // give message the value "Hello!"
    hour = 11;  // assign the value 11 to hour
    minute = 59; // set minute to 59
    message = "129"; //legal
                    //message = 123;

// from there we don't need to redeclare variable types. Shiny!!
    message = "Hello!";
    hour = 11;
    minute = 59;
// more declarations
    int a = 5;
    int b = a;
    a = 3;

    String firstLine = "Hello, again!";
// I think we are done with declarations and statements.
System.out.println(firstLine);

hour = 11;
minute = 59;

System.out.print("the current time is ");
System.out.print(hour);
System.out.print(":");
System.out.print(minute);
System.out.println(".");

hour = 11;
minute = 59;

System.out.print("Number of minutes since midnight ");
System.out.println(hour * 60 + minute);

System.out.print("Fraction of the hour that has passed: ");
System.out.println(minute / 60);

System.out.print("Percent of the hour that has passed: ");
System.out.print(minute * 100 / 60);
  } // method declaration.
} //class declaration
