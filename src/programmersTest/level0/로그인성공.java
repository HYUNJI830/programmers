package programmersTest.level0;

import java.util.Arrays;

public class 로그인성공 {

	public static void main(String[] args) {
		String[] id_pw = {"meosseugi", "1234"};
		String[][] db = {{"rardss", "123"},{"yyoom", "1234"},{"meosseugi", "1234"}};
		//					[0][0],[0][1]	[1][0]	[1][1]     [2][0]		[2][1]
		
		//답안 login
		String answer = "";
		for(int i=0; i<db.length; i++) {
				if(db[i][0].equals(id_pw[0])&&db[i][1].equals(id_pw[1])) {
					 answer = "login";
				}else if(db[i][0].equals(id_pw[0])&& !db[i][1].equals(id_pw[1])) {
					 answer = "wrong pw";
				}else {
					answer = "fail";
				}
			}
		 System.out.println(answer);
		}
		
		
	}


