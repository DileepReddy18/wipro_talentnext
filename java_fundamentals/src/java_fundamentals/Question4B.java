package java_fundamentals;

import java.util.Scanner;

public class Question4B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		if(n%10==m%10) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}

}
