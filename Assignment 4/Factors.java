import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0, sum = 0;

        System.out.print("Factors of " + num + " are: ");

        
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                count++;
                sum += i;
            }
        }

        
        System.out.println("\nTotal number of factors: " + count);
        System.out.println("Sum of factors: " + sum);

        sc.close();
    }
}
