package day12;

public class Array19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//p19 : [1] = 1 [3] = 9 [5] =25 [7]= 49, [9] = 81
		
		int[] n = new int[5]; 			//배열변수 n은 5개의 값을 가진 배열	
		int i = 0;						//i는 인덱스의 초기값 설정
		int b = 1;						//i에 넣어줄 값 b 초기값 설정
		for (b = 1; b < 10; b++)		//b의 값은 반복을 할건데
		{
			if (b%2 == 1)				//만약 b의 값이 홀수이면
			{
				n[i] = b*b;				//그 값의 제곱을 배열에다가 넣어줍시다
				System.out.println(n[i]);
			}
		}
	}

}
