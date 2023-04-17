package day12;

public class Array16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//p16
		int[] a = null;
		a = new int[6];
		
		int sum = 0;
		int i = 0;
		for (i = 0; i < 6; i++)
		{
			a[i] = i+1;
			sum = sum + a[i];
			System.out.println(sum);
		}
	}

}
