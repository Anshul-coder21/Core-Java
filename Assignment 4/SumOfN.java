import java.util.Scanner;
public class SumOfN{
	public static void main(String[] args){
		int i,n,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The N");
		n = sc.nextInt();
		for(i=1; i<=n; i++){
			sum = sum+i;
		}
		System.out.println("Sum is : "+sum);
		
	}
}
			