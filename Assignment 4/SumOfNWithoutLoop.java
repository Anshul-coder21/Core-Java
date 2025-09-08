import java.util.Scanner;
public class SumOfNWithoutLoop{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n,sum;
		System.out.println("Enter the N");
		n = sc.nextInt();
		
		sum = n*(n+1)/2;

		System.out.println("sum is : "+sum);
	}
}

		
		