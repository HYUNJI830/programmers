package programmersTest.level0;

import java.util.Arrays;

public class 가장큰수찾기 {

	public static void main(String[] args) {
		int[] array = {9,10,11,8};
		int[] answer = new int[2];	
		//답 [11,2]
		//가장 큰수와 해당 위치 구하기
	
		int max = 0;
		int index = 0;
		
		for(int i=0; i<array.length; i++) {
			//최대값
			if(array[i]>max) { 
				max = array[i];
				index = i;
			}
			
			answer[0] = max;
			answer[1] = index;
		}
			System.out.println(answer[0]);
			System.out.println(answer[1]); 
	}

}
