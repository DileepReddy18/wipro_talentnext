package java_fundamentals;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String g=sc.nextLine().toLowerCase();
		int a=sc.nextInt();
		if(g=="female") {
			if(a>1&&a<=58) {
				System.out.println("the percentage interest is 8.2%");
			}else {
				System.out.println("the percentage interest is 9.2%");
			}
		}else{
			if(a>1&&a<=58) {
				System.out.println("the percentage interest is 8.4%");
			}else {
				System.out.println("the percentage interest is 10.5%");
			}
		}
	}

}
