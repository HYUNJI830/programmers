package programmersTest.level0;

import java.util.Arrays;

public class 한번만등장한문자 {

	public static void main(String[] args) {
		String s = "hello";
		//답 : "eho"
		// 문자열에서 한번씩만 등장해야함 -> 중복 x
		// 중복제거한 문자열을 순서대로 정렬(sort)
		String[] str = s.split("");
		String a = "";
	
		
		for(int i=0; i<str.length; i++) {
			
			if((s.indexOf(s.charAt(i))==i)&&(s.lastIndexOf(s.charAt(i))==i)) {
			 a += s.charAt(i);
			
			}
		}		
		    char[] b = a.toCharArray(); 
			Arrays.sort(b);
			String answer = new String(b);
	
			System.out.println(answer);
			
			
	}

}
