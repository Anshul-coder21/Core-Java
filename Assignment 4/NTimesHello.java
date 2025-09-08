import java.util.Scanner;

public class NTimesHello{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n,i;
		System.out.println("Enter N Value : ");
		n = sc.nextInt();
		for(i=1; i<=n; i++)
		{
			System.out.println("Hello");
		}
	}
}
		
		