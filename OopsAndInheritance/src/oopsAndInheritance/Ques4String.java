package oopsAndInheritance;

import java.util.Scanner;

public class Ques4String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(s.length()%2==0) {
			for(int i=0;i<s.length()/2;i++) {
				System.out.print(s.charAt(i));
			}
		}else {
			System.out.println("null");
		}
	}

}
