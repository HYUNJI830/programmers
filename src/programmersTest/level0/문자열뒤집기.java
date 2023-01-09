package programmersTest.level0;

public class 문자열뒤집기 {

	public static void main(String[] args) {
	
		String mystring = "java";
		String answer = "";
						
	      for(int i = 3; i>=0; i-- ) 
				{
					answer += mystring.substring(i,i+1);
					System.out.println(answer);
				}
				
				//StringBuffer  클래스는 reverse() 메소드 존재
//				StringBuffer a = new StringBuffer(mystring);
//				String b = a.reverse().toString();
	}

}
