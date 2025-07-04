package java_fundamentals;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=n;
		int rev=0;
		while(n>0) {
			int d=n%10;
			rev=rev*10+d;
			n/=10;
		}
		if(rev==p) {
			System.out.println(p+" is a palindrome");
		}else {
			System.out.println(p+" is not palindrome");
		}
	}

}
