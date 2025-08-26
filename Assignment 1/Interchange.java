import java.util.Scanner;
public class Interchange{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First Integer: ");
	int x = sc.nextInt();
	System.out.println("Enter second Integer: ");
	int y = sc.nextInt();
	System.out.println("Before Swaping:x=" + x + ", y=" + y);
	int temp = x;
	y = temp;
	System.out.println("After swaping (temp): x=" + x + ", y=" + y);
	x = x+y;
	y = x-y;
	System.out.println("After Swaping :x=" +x+ ", y=" + y);
	}
}
	


