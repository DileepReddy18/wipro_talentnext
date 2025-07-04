package java_fundamentals;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=10;i<99;i++) {
			boolean h=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					h=false;
					break;
				}
			}
			if(h) {
				System.out.println(i);
			}
		}
	}

}
