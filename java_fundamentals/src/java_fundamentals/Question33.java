package java_fundamentals;

import java.util.Scanner;

public class Question33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[2][2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int a=0,b=0;
		for(int i=0;i<2;i++) {
			if(i==0) {
				int temp=arr[i][0];
				arr[i][0]=arr[1][1];
				arr[1][1]=temp;
			}else {
				int temp=arr[0][i];
				arr[0][i]=arr[i][0];
				arr[i][0]=temp;
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
