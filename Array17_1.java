package day12;

public class Array17_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//p17-1
		//배열 변수 num에는 10, 100, 1000, 10000이 들어있음 
		int[] num = new int[4];					
		int a =1;
		int i = 0;
		for (i = 0; i < 4; i++)
		{
			a = a*10;
			num[i] = a;
			System.out.println(num[i]);
		}
		
		
		
	}

}
