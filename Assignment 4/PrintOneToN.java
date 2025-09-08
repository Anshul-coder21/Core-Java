import java.util.Scanner;
public class PrintOneToN{
	public static void main(String[] args){
		int i,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The N : ");
		n = sc.nextInt();
		
		for(i=1; i<=n; i++){
			System.out.println(i);
		}
	}
}