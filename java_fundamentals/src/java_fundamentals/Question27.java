package java_fundamentals;

import java.util.HashMap;

public class Question27 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> hm=new HashMap<>();
		int[] arr= {1,2,3,4,1,2,5};
		for(int i=0;i<arr.length;i++) {
			hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
			if(hm.containsKey(arr[i])&&hm.get(arr[i])==1) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
