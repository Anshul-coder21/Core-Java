import java.util.Scanner;

public class DivisibleOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter number: ");
        int num = sc.nextInt();
        if (num % 5 == 0 && num % 7 == 0)
	System.out.println("Divisible by 5 and 7");
        else 
	System.out.println("Not Divisible by 5 and 7");
	}
}
