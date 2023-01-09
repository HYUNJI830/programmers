package programmersTest.level0;

import java.nio.file.spi.FileSystemProvider;
import java.util.Arrays;

public class 가위바위보 {

	public static void main(String[] args) {
		String rsp = "205";
		String answer = "";
		//결과가 052
		//가위:2, 바위:0, 보:5
		//모두이기는 결과를 가져오세요
		
		//[까먹지 말기] String 문자열 비교는 .equals()
		String[] array = rsp.split("");
		for(int i=0; i<array.length; i++) {

			if(array[i].equals("2")) {
				answer += "0";
			}else if(array[i].equals("0")) {
				answer += "5";
			}else if(array[i].equals("5")) {
				answer += "2";
			}
		}	
		System.out.println(answer);	
	}

}
