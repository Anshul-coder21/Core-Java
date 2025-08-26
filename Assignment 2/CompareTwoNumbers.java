import java.util.Scanner;

public class CompareTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter 2 numbers: ");
        int x = sc.nextInt(), y = sc.nextInt();
        if (x == y) System.out.println("Equal");
        else if (x > y) System.out.println("x > y");
        else System.out.println("x < y");
	}
}