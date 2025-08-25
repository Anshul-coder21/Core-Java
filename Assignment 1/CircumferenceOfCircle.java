import java.util.Scanner;
public class CircumferenceOfCircle{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The Radius: ");
	double r = sc.nextDouble();
	double area = Math.PI*r*r;
	double circumference = 2 * Math.PI * r;
	System.out.println("Circumference = " + circumference);
	System.out.println("Area = " + area);
	}
}
		