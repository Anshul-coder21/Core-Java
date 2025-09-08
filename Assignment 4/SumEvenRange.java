import java.util.Scanner;

public class SumEvenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter starting number (x): ");
        int x = sc.nextInt();
        System.out.print("Enter ending number (y): ");
        int y = sc.nextInt();

        int sum = 0;

       
        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) { // check even
                sum += i;
            }
        }

        System.out.println("Sum of even numbers from " + x + " to " + y + " = " + sum);

        sc.close();
    }
}
