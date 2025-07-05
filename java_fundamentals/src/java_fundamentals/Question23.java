package java_fundamentals;

import java.util.Scanner;

public class Question23 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {1,2,3,4,5};
		int t=9;
		boolean h=true;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==t) {
				System.out.println(i);
				h=false;
			}
		}
		if(h) {
			System.out.println(-1);
		}
	}

}
