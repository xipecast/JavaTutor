package tutorial;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
// TODO Auto-generated method stub
//prompt user age:
	System.out.print("Age?");
//acquire input from user.
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	int age = Integer.parseInt(s);

//implement condition for ride:
	if (age >= 18) {
		System.out.println("You are an adult");
		if (food.equals("pizza")) {
		System.out.print("mine too!");
			}
		else {
			System.out.print("Not mine!");
			}
		}
	else if (age <= 13) {
		System.out.println("You are a child");
	}
	else {
		System.out.println("You are not a teenager or an adult");
	}
	}

}
