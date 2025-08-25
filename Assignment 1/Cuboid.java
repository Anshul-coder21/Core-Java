import java.util.Scanner;
public class Cuboid{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Length : ");
	double l = sc.nextDouble();
	System.out.println("Enter The Bridth: ");
	double b = sc.nextDouble();
	System.out.println("Enter The Height: ");
	double hh = sc.nextDouble();
	double cuboidSA = 2*(l*b+l*hh+b*hh);
	double cuboidVol = l*b*hh;
	System.out.println("Cuboid Surface Area = " + cuboidSA);
	System.out.println("Cuboid Volume = " + cuboidVol);
	}
}
	
	
