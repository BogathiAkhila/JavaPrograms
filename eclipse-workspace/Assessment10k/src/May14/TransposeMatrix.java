package May14;
import java.util.Scanner;

public class TransposeMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row length");
		System.out.println("Enter the cols length");
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		int[][] matrix=new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				matrix[i][j]=sc.nextInt();
				
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(matrix[j][i]);
			}
			System.out.println(" ");
			
		}
	}

}
