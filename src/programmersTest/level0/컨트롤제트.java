package programmersTest.level0;

import java.util.Arrays;

public class 컨트롤제트 {

	public static void main(String[] args) {
		String s = "10 Z 20 Z 1";
		int answer = 0;
		int z = 0;
		int x = 0;
		// 결과 : 1
		//Z앞에 수 20+10
		// 전체 수 10+20+1
		// 전체수 - Z앞수 
		//공백 제거하고 배열에 담기

	
		
		//Z는 먼저 제거
		//남은 숫자 더하기
		String[] b = s.split(" ");
		System.out.println(Arrays.toString(b));
		//System.out.println(Arrays.toString(b));
		for(int i=0; i<b.length; i++) {
			if(b[i].contains("Z")) {
				z += Integer.valueOf(b[i-1]);
			}else {
				x += Integer.valueOf(b[i]);
			}
		}
		
		 answer = x-z;
		System.out.println(answer);
		//System.out.println(answer);
	}

}
