import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter lowercase character: ");
        char ch = sc.next().charAt(0);
        if ("aeiou".indexOf(ch) != -1)
        System.out.println("Vowel");
        else
        System.out.println("Consonant");
	}
}
