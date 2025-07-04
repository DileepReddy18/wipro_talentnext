package java_fundamentals;

import java.util.Scanner;

public class Question4A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==0) {
			System.out.println("Zero");
		}else if(n>0) {
			System.out.println("positive");
		}else if(n<0) {
			System.out.println("Negative");
		}
	}

}
