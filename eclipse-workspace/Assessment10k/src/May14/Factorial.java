package May14;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int count=1;
		for(int i=n;i>=1;i--) {
			count*=i;
			
		}
		System.out.println(count);

	}

}
