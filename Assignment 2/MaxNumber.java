import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter 3 numbers: ");
        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
        int max = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
        int min = (n1 < n2) ? (n1 < n3 ? n1 : n3) : (n2 < n3 ? n2 : n3);
        System.out.println("Max = " + max + ", Min = " + min);
	}
}