package java_fundamentals;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean h=true;
		int n=sc.nextInt();
		if(n==0||n==1) {
			System.out.println("not prime");
		}
		else {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					h=false;
					break;
				}
			}
		}
		if(h) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}

	}

}
