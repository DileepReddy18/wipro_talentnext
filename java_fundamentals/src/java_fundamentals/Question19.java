package java_fundamentals;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0;
		while(n>0) {
			int d=n%10;
			rev=rev*10+d;
			n/=10;
		}
		System.out.println(rev);

	}

}
