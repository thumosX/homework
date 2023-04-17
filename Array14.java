package day12;

public class Array14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//p14
		//아래는 무슨 프로그램인가 = 검색하면 찾아주기인가? 
		
		int[] a = new int[10]; 				// 10개짜리 배열선언,할당
		int key = 8;						// 정수 key는 8
		for (int i = 0; i < 10; i++)
		{
			a[i] = i;						//각각의 배열 방에는 0부터 9까지 넣어줌
		}
		
		for (int i = 0; i < 10; i++)
		{
			System.out.println(a[i]);		//배열에 들어 있는 값을 출력
			if (key == a[i])				//만약 key 값과 a[i]배열 값이 같으면 아래 출력
			{
				System.out.println("key찾음.");
				break;						//키 찾으면 반복문 돌지말고 여기서 끝내라 
			}
		}
	}

}
