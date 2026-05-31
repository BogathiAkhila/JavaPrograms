package May14;

import java.util.Scanner;
import java.util.ArrayList;

public class BoundaryMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row length");
		System.out.println("Enter the col length");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] Boundarymatrix=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				Boundarymatrix[i][j]=sc.nextInt();
			}
		}
		ArrayList<Integer> arr=new ArrayList<>();
		for(int j=0;j<col;j++) {
			arr.add(Boundarymatrix[0][j]);
			
		}
		for(int i=1;i<row;i++) {
			arr.add(Boundarymatrix[i][col-1]);
		}
		if(row > 1) {
			for(int j=1;j>=0;j--) {
				arr.add(Boundarymatrix[row-1][j]);
			}
			
		}
		if(col>1) {
			for(int i=row-2;i>0;i--) {
				arr.add(Boundarymatrix[i][0]);
			}
		}
		System.out.println(arr);

	}

}
