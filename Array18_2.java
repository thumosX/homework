package day12;

public class Array18_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[0]10, [1]20, [2]30, 40, 50, 60
		
		int[] a = new int[6];
		int i = 0;
		for (i = 0; i < 6; i++)
		{
			a[i] = (i+1)*10;
			System.out.println(a[i]);
		}
	}

}
