package java_fundamentals;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		if(c==Character.toLowerCase(c)) {
			System.out.println(c+"->"+Character.toUpperCase(c));
		}else {
			System.out.println(c+"->"+Character.toLowerCase(c));
		}
	}

}
