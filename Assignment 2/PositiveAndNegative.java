import java.util.Scanner;
public class PositiveAndNegative{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The Number : ");
	int n = sc.nextInt();
	if(n>0)
	System.out.println("positive");
	else if (n<0)
	System.out.println("Negative");
	else
	System.out.println("Zero");
	}
}


	
