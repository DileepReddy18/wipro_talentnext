package java_fundamentals;

public class Question28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,3,6,4,5};
		int r=0;
		int sum=0;
		int d=0,l=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(arr[i]==7) {
				r=i;
			}
			if(arr[i]==6) {
				l=i;
			}
		}
		for(int j=l;j<=r;j++) {
			d+=arr[j];
		}
		System.out.println(sum-d);
	}

}
