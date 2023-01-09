package programmersTest.level0;

import java.util.Arrays;

public class 중앙값구하기 {

	public static void main(String[] args) {
		int[] array = {1,2,7,10,11};
		int answer = 0;
		
		//배열 정렬
		Arrays.sort(array);
		answer = array[array.length/2];
	
		
		System.out.println(answer);
		

	}

}
