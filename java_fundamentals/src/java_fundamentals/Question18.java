package java_fundamentals;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int j=0;
			while(j<=i) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
		}
	}

}
