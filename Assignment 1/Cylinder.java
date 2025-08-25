import java.util.Scanner;
public class Cylinder{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The Radius Of Cylinder : ");
	double rc = sc.nextDouble();
	System.out.println("Enter The Height of Cylinder: ");
	double h = sc.nextDouble();
	double surfaceArea = 2*Math.PI*rc*rc+2*Math.PI*rc*h;
	double volume = Math.PI*rc*rc*h;
	System.out.println("surface Area = " + surfaceArea);
	System.out.println("Volume = " + volume);
	}
}