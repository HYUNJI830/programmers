package programmersTest.level0;

public class 모음제거 {

	public static void main(String[] args) {
		 String my_string = "nice to meet you";
		 String[] str = {"a","e","i","o","u"};
		 String answer ="";
		 
		// for(int i=0; i<str.length; i++) {
			//if(my_string.contains(str[i])) {
				answer = my_string.replaceAll("[aeiou]", "");
				//my_string = answer; //왜 이걸 넣어야 답이지?
			//}else {
				//answer=my_string;//왜? 이미 if문에서 모음제거 조건을 넣으니 끝 아닌가?
			//}
		 //}
		 System.out.println(answer);
	}

}
