package programmersTest.level0;

import java.util.ArrayList;
import java.util.Arrays;

public class n의배수고르기 {

	public static void main(String[] args) {
		int n =3;
		int[] numlist = {4,5,6,7,8,9,10,11,12}; 
		ArrayList<Integer> a = new ArrayList<>();
	
		//결과 [6,9,12]
		//n의 배수만 추출하기
		
		for(int i=0; i<numlist.length; i++)
		if(numlist[i]%n ==0) {
			a.add(numlist[i]);
		}
		int[] answer = {a.size()};
		for (int i = 0; i <a.size(); i++) {
          answer[i] = a.get(i);
        }
		System.out.println(Arrays.toString(answer));	
	}

}
