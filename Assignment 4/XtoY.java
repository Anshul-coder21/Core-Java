import java.util.Scanner;
public class XtoY{
	public static void main(String[] args){
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X or Y");
		x = sc.nextInt();
		y = sc.nextInt();
		
		for(int i = x; i<=y; i++){
			System.out.println(i);
		}
	}
}											
		