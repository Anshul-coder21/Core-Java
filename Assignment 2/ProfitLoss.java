import java.util.Scanner;
public class ProfitLoss{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The cost price : ");
	double cp = sc.nextDouble();
	System.out.println("Enter The Selling Price : ");
	double sp = sc.nextDouble();
	if(sp>cp)
	System.out.println("profit = "+(sp-cp));
	else if (cp>sp)
	System.out.println("loss = "+(cp-sp));
	else
	System.out.println("No profit No Loss");
	}
}

	


	
	