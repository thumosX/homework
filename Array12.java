package day12;

public class Array12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 ch에는 'a', 'p', 'p', 'l', 'e'가 저장되어 있다
		//배열의 순서대로 문자를 출력 & 역순으로 문자를 출력
		
		char[] ch = new char[] {'a', 'p', 'p', 'l', 'e'};
		for (int i = 0; i<ch.length; i++)
		{
			System.out.print(ch[i]);
		}
			System.out.println();
		for (int j=4; j>=0; j--)
		{
			System.out.print(ch[j]);
		}
				
		
		
	
		
		
		

	}

}
