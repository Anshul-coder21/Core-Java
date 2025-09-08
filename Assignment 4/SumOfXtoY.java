import java.util.Scanner;
public class SumOfXtoY{
	public static void main(String[] args){
		int x,y,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X or Y");
		x = sc.nextInt();
		y = sc.nextInt();
		
		for(int i = x; i<=y; i++){
			sum = sum+i;
		}
		System.out.println("sum: "+sum);
	}
}	