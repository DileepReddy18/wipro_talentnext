package java_fundamentals;

import java.util.Arrays;

public class Question32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3};
		int[] arr2= {4,5,6};
		int[] narr=new int[2];
		narr[0]=arr1[1];
		narr[1]=arr2[1];
		System.out.println(Arrays.toString(narr));
	}

}
