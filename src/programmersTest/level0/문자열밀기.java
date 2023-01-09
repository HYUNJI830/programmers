package programmersTest.level0;

import java.util.Arrays;

public class 문자열밀기 {

	public static void main(String[] args) {
		String A = "hello";
		String B = "ohell";
		//1 1번 밀어야해

	    int answer = -1;
	
	    for(int i=0; i<A.length(); i++) {
	    	if(A.equals(B)) {
	    		answer = i;
	    	}

	    	A = A.charAt(A.length()-1) + A.substring(0,A.length()-1);
	    }
		System.out.println(answer);
 }
}
