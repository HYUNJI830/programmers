package programmersTest.level0;

import java.util.Arrays;

public class 잘라서배열로저장하기 {

	public static void main(String[] args) {
		String my_str = "abc1Addfggg4556b";
		int n = 6;
		// 답 :["abc1Ad", "dfggg4", "556b"]
	
		int A = (my_str.length() + n - 1) / n;
		String[] answer = new String[A];
		
		for(int i=0; i<A; i++) {
			int start = n*i;
			//0,6,12
			int end = 0;
				if(start + n >=my_str.length()) {
					end = my_str.length();
					
				} else {
					end = start + n;
					//6,12
				}
				answer[i] = my_str.substring(start,end);
		}
		
		System.out.println(Arrays.toString(answer));
		//[abc1Ad, dfggg4, 556b]
	}

}
