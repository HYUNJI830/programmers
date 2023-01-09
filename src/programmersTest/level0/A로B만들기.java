package programmersTest.level0;

import java.util.Arrays;

public class A로B만들기 {

	public static void main(String[] args) {
		String before = "olleh";
		String after = "hello";
		
		//결과가 1
		
		//비포 문자열의 각각요소가 에프터 문자열가 동일한지 확인
		//순서는 상관없음 -> 존재여부만 확인되면 됨
		// 배열에 담아도 될까? 그럼 배열에 담긴 인덱스의 순서대로 확인할 필요가 없는데
		//조건문을 두개로 나누어서 맞으면 1 다르면 0
		
		int answer = 0;
		String[] bef = before.split("");
		String[] aft = after.split("");
		char[] b = before.toCharArray();
		
		Arrays.sort(bef);
		Arrays.sort(aft);
		Arrays.sort(b);
		
		String be = Arrays.toString(bef);
		String af = Arrays.toString(aft);	
		//String b1 = new String(b);
		String b2 = String.valueOf(b);
		
		if(be.equals(af)) {
			answer = 1;
		} else {
			answer = 0;
		}
		System.out.println(answer);

	}

}
