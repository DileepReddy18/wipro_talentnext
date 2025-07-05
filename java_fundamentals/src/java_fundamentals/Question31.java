package java_fundamentals;

public class Question31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,1,1,4,4,4};
		boolean h=true;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=1&&arr[i]!=4) {
				h=false;
			}
		}
		if(h) {
			System.out.println(h);
		}else {
			System.out.println(h);
		}

	}

}
