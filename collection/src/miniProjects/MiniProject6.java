package miniProjects;
import java.util.*;

public class MiniProject6 {

	public static ArrayList<String> performOperations(String s1, String s2) {
        ArrayList<String> result = new ArrayList<>();

        // 1. Alternate index character of S1 replaced with S2
        StringBuilder op1 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0)
                op1.append(s2);
            else
                op1.append(s1.charAt(i));
        }
        result.add(op1.toString());

        // 2. If S2 appears > once in S1, replace last occurrence of S2 with reverse(S2)
        // else return S1 + S2
        int firstIndex = s1.indexOf(s2);
        int lastIndex = s1.lastIndexOf(s2);
        if (firstIndex != -1 && firstIndex != lastIndex) {
            String reversed = new StringBuilder(s2).reverse().toString();
            StringBuilder sb = new StringBuilder(s1);
            sb.replace(lastIndex, lastIndex + s2.length(), reversed);
            result.add(sb.toString());
        } else {
            result.add(s1 + s2);
        }

        // 3. If S2 appears > once in S1, delete the first occurrence of S2
        // else return S1
        if (firstIndex != -1 && firstIndex != lastIndex) {
            StringBuilder sb = new StringBuilder(s1);
            sb.delete(firstIndex, firstIndex + s2.length());
            result.add(sb.toString());
        } else {
            result.add(s1);
        }

        // 4. Divide S2 into two halves and merge with S1
        int half = s2.length() / 2;
        int extra = s2.length() % 2;
        String firstHalf = s2.substring(0, half + extra);
        String secondHalf = s2.substring(half + extra);
        result.add(firstHalf + s1 + secondHalf);

        // 5. Replace all characters in S1 that are in S2 with '*'
        Set<Character> s2Chars = new HashSet<>();
        for (char ch : s2.toCharArray()) {
            s2Chars.add(ch);
        }
        StringBuilder op5 = new StringBuilder();
        for (char ch : s1.toCharArray()) {
            if (s2Chars.contains(ch))
                op5.append('*');
            else
                op5.append(ch);
        }
        result.add(op5.toString());

        return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "JAVAJAVA";
        String s2 = "VA";

        ArrayList<String> output = performOperations(s1, s2);

        System.out.println("Output:");
        for (String str : output) {
            System.out.println("\"" + str + "\"");
        }

	}

}
