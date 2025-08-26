import java.util.Scanner;

public class ValidTrigle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter 3 sides: ");
        int s1 = sc.nextInt(), s2 = sc.nextInt(), s3 = sc.nextInt();
        if (s1 + s2 > s3 && s2 + s3 > s1 && s1 + s3 > s2)
            System.out.println("Valid Triangle");
        else
            System.out.println("Invalid Triangle");
	}
}