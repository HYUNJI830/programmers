package programmersTest.level0;

import java.util.Arrays;

public class 삼각형의완성조건 {

	public static void main(String[] args) {
		int[] sides = {1,2,3};
		int answer = 0;
		
		 Arrays.sort(sides); // 배열 정렬(순서대로)
		 if(sides[2]<(sides[0]+sides[1])) {
			 answer = 1;
		 }else {
			 answer = 2;
		 }
		 System.out.println(answer);
	}

}
