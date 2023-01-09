package programmersTest.level0;

import java.util.Arrays;
import java.util.HashSet;



public class 중복된문자제거 {

	public static void main(String[] args) {
		String my_string ="people";
		//peol
	    String[] str = my_string.split("");
	   
	    
	    HashSet<String> hashset = new HashSet<String>();
	    for (String answer : str) {
			hashset.add(answer);
			System.out.println(answer);
		}

	System.out.println(hashset);
	
	}
}
