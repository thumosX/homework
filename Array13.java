package day12;

public class Array13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// p13
		// 1. int 10개 공간 배열 선언, 메모리 할당, 1, 10, 100, 1000,....값 할당
		// 2. 배열의 합 
		// 3. 배열의 [0], [1]값을 비교하여 더 큰 수의 배열 첨자(index)를 출력 (큰수는 최대값으로 구하면 되는데, 큰수의 인덱스는 어떻게?)
		// 4. 배열의 [0], [1], [2] 값을 비교하여 더 큰 수의 배열 첨자(index)를 출력
		int sum = 0;
		
		int[] a = null;
		a = new int[10];
		int i = 0;
		for (i = 0; i < 10; i++)
		{
			a[i] = (int) Math.pow(10, i);						// 
			System.out.println(i +"배열의 값 할당 : " + a[i]);
			sum = sum + a[i];
		
		}
		System.out.println("배열의 합은 : " + sum);
		System.out.println("a[0]과 a[1]중 큰 수의 값은" + Math.max(a[0], a[1]));
		
		//제곱이 아니라 10씩 곱하기로도 쓸 수 있지
		int[] b = new int[10];
		int c = 1;
		int j = 0;						//b[0] =1, b[1] = 10, b[2] = 100.....
		for (j = 0; j < 10; j++)
		{
			b[j] = (int)c;				//배열 b에 초기값 c를 일단 넣고
			c = c*10;					//10씩 곱하기 하자
			
			System.out.println("배열 b의 " + j + "값 할당 : " + b[j]);
					
		}
		
		
		//그러면 최대값의 인덱스를 어떻게 구하냐
		
		int max = a[0]; 					//배열의 초기값 셋팅
	
		int k = 0;
		for (k = 0; k < 3; k++)				//a[0], a[1], a[2]의 값을 비교하자
		{
			a[k] = (int) Math.pow(10, k);	//배열의 값은 요렇게 되고
			if (max < a[k])					//만약 반복문안의 값이 초기값보다 크면
			{
				max = a[k];					//최대값에 그 값을 할당하자
			}
		
			System.out.println("최대값은" + max);
			System.out.println("최대값 인덱스는" + k);
		}
	
			
		
		
	}

}
