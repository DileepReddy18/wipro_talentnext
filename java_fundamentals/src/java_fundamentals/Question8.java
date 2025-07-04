package java_fundamentals;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		if(Character.isDigit(c)) {
			System.out.println("Digit");
		}else if(Character.isLetter(c)) {
			System.out.println("Alphabet");
		}else {
			System.out.println("special character");
		}

	}

}
