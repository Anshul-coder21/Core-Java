import java.util.Scanner;
public class Mean{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The First Number : ");
	double n1 = sc.nextDouble();
	System.out.println("Enter Second number: ");
	double n2 = sc.nextDouble();
	double am = (n1+n2)/2;
	double hm = (n1*n2)/(n1+n2);
	System.out.println("Arithmatic mean = " +am);
	System.out.println("harmonic mean = " +hm);
	}
}

