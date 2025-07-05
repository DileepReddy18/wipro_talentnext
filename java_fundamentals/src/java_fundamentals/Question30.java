package java_fundamentals;

import java.util.Arrays;

public class Question30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,0,1,0,1,1};
		int n=arr.length;
		int j=0;
		int[] narr=new int[n];
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				narr[j]=arr[i];
				j++;
			}
		}
		for(int i=0;i<n;i++) {
			if(arr[i]%2!=0) {
				narr[j]=arr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(narr));
	}

}
