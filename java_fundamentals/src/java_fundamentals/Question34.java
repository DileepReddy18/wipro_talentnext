package java_fundamentals;

import java.util.Scanner;

public class Question34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[3][3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
			System.out.println();
		}
		System.out.println(max);
	}

}
