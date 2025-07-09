package oopsAndInheritance;

import java.util.Scanner;

public class Ques6String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		if(a.length()>b.length()) {
			System.out.println(b+a+b);
		}else {
			System.out.println(a+b+a);
		}
	}

}
