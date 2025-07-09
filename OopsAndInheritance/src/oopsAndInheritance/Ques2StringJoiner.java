package oopsAndInheritance;

import java.util.*;
public class Ques2StringJoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner s1 = new StringJoiner("-", "[", "]");
        s1.add("Mumbai").add("Chennai").add("Kolkata");

        StringJoiner s2 = new StringJoiner("-", "[", "]");
        s2.add("Delhi").add("Bangalore").add("Hyderabad");

        StringJoiner merged1 = new StringJoiner("-", "[", "]");
        merged1.merge(s2);
        merged1.merge(s1);
        System.out.println("s1 merged to s2: " + merged1);

        StringJoiner merged2 = new StringJoiner("-", "[", "]");
        merged2.merge(s1);
        merged2.merge(s2);
        System.out.println("s2 merged to s1: " + merged2);
	}

}
