package programmersTest.level0;

import java.util.Arrays;

public class 중복된문자제거2 {

	public static void main(String[] args) {
		String my_string = "We are the world";
		//peol
	 
	    String answer = "";
	    for(int i =0; i<my_string.length(); i++) {
	    	if(my_string.indexOf(my_string.charAt(i))==i) {
	    		answer += my_string.charAt(i);
	    	}
	    }
	System.out.println(answer);
	}

}
