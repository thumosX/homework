package day12;

public class Array18_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// p18 [0]=1, [1]=3, [2] = 5, [3] =7, [4] = 9, [5] = 11
		int[] a = new int[6];			// 배열변수 a는 6개의 배열이 들어있단다
		int i = 0;						// 배열 방번호 초기값 설정
		int b = 1;						// 방 안에 넣어줄 값들을 
		for(b =1; b < 12; b++)			// 1부터 돌려보자
		{	
			if(b%2 ==1)					// 만약 b값이 홀수이면
			{
			a[i] = b;					// 그 값을 a 배열에 넣어주세요
			System.out.println(a[i]);	// 프린트 하고 다시 반복
			}
			
		}	
		
			
							
		
	}

}
