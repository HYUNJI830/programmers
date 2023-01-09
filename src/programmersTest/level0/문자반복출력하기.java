package programmersTest.level0;

import java.util.Arrays;

public class 문자반복출력하기 {

	public static void main(String[] args) {
	 String my_string = "hello";
	 int n = 3;
	 String answer = "";

	 for(int i=0; i<my_string.length(); i++) {
	 answer += my_string.substring(i, i+1).repeat(n);
	 //answer에 ooo만 생겼던 이유는 반복문이 돌아갈때마다 마지막 문자열만 저장해서, 
	 //answer에 반복문을 누적 저장해야 해당 문자열이 반복되서 저장됨
	 
	 }
	 System.out.print(answer);
	 System.out.println();
	 
// split
	 String str = "ab#c#d";
	 String[] a = str.split("#");
	 System.out.println(a[0]);
	 System.out.println(a[1]);
	 System.out.println(a[2]);
	 
	
	}

}
