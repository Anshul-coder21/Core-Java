import java.util.Scanner;
public class Temperature{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Temperature in Fehrenheit: ");
	double f = sc.nextDouble();
	double c = (5.0/9)*(f-32);
	double k = c + 273.15;
	System.out.println("Celcius = " + c);
	System.out.println("Kelvin = " + k);
	}
}
