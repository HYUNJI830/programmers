package programmersTest.level0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class 약수구하기 {

	public static void main(String[] args) {
		int n =24;
		// Set의 문제점 : 순서가 없는데 정렬이 가능한가? 
		// List 문제점 : 중복값 잡을수가 없음 / 
		HashSet <Integer> answer = new HashSet<Integer>();
		
		//답 [1,2,3,4,6,8,12,24]
		//이후 배열에 담은 후 정렬
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i*j == n) {
					answer.add(i); 
					answer.add(j); 
				}
			}
		}
		List <Integer> answer1 = new ArrayList<Integer>(answer);
		Collections.sort(answer1);
		System.out.println(answer1.get(7));
		
	}

}
