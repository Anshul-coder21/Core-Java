import java.util.Scanner;
public class Velocity{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The initial Velocity (u): ");
	double u = sc.nextDouble();
	System.out.println("Enter Acceleration (a): ");
	double a = sc.nextDouble();
	System.out.println("Enter Time(t): ");
	double t=sc.nextDouble();
	double v = u + a * t;
	double s = u * t + 0.5 * a * t * t;
	System.out.println("Final Velocity = " + v);
	System.out.println("Distance Travelled = " + s);
	}
}