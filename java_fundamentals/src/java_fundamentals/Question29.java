package java_fundamentals;

import java.util.Arrays;

public class Question29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,4,10,10,5,3};
		int n=arr.length;
		int[] narr=new int[n];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=10) {
				narr[j]=arr[i];
				j++;
			}
		}
		while(j<n) {
			narr[j]=0;
			j++;
		}
		
		System.out.println(Arrays.toString(narr));

	}

}
