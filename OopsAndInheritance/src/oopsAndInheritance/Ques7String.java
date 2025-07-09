package oopsAndInheritance;

import java.util.Scanner;

public class Ques7String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int len=s.length();
		if(s.charAt(0)=='x'&&s.charAt(len-1)=='x'&&len>1) {
			System.out.println(s.substring(1, len-1));
		}
		else if(s.startsWith("x")) {
			System.out.println(s.substring(1,len));
		}
		else if(s.endsWith("x")) {
			System.out.println(s.substring(0,len-1));
		}else {
			System.out.println(s);
		}
	}

}
