package programmersTest.level0;

public class 배열원소의길이 {

	public static void main(String[] args) {
		String[] strlist = {"We","are","the","world!"};
		
		
	        int[] count = new int[strlist.length];
	        for(int i=0; i<strlist.length; i++)
	        {
	          count[i] = strlist[i].length(); 
	          System.out.println(count[i]);
	        }


	}

}
