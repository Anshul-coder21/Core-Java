import java.util.Scanner;
public class Swapping {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n1,n2,temp;
	System.out.println("Enter The Two Numbers : ");
	n1 = sc.nextInt();
	n2 = sc.nextInt();
	temp = n1;
	n1 = n2;
	n2 = temp;
	System.out.println("n1 is : "+n1);
	System.out.println("n2 is : "+n2);
	}
}
	
	
		