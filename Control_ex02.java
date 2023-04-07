package day07;

import java.util.Scanner;
public class Control_ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ex11
		//정수를 입력받아, 절대값을 표시해주는 프로그램을 작성하라(삼항연산자를 사용)
		int a;
		Scanner a1 = new Scanner(System.in);
		System.out.println("정수값을 입력하시오");
		a = a1.nextInt();
		String b = (a >= 0) ? ("절대값은 " + a + "입니다") : ("절대값은 " + (-a) + "입니다");
		System.out.println(b);
		
		//ex12  int x=2에서 x값이 짝수인지 홀수인지 판단하는 프로그램을 작성하시오
		
		int x=2;
		String y = (x%2 == 0) ? "짝수입니다" : "홀수입니다";
		System.out.println(y);
		
		//ex13  사용자에게 입력받은 값이 짝수인지 홀수인지 판단하는 프로그램을 작성하시오
		
		int x1;
		Scanner X = new Scanner(System.in);
		System.out.println("자연수를 입력하세요");
		x1 = X.nextInt();
		
		String y1 = (x1%2 == 0) ? "짝수입니다" : "홀수입니다";
		System.out.println(y1);
		
		//ex14
		int c = 20;
		switch(c) {
		case 10: 
			System.out.println("10이다");
			break;
		case 20:
			System.out.println("20이다");
			break;
		case 30:
			System.out.println("30이다");
		default:
			System.out.println("그 외의 값");
			break;				
		}
		
		//ex14-1 위의 스위치문을 if 조건문을 사용하여 변경
		if(c == 10) {
			System.out.println("10이다");
		}	
		else if (c == 20) {
			System.out.println("20이다");
		}
		else if (c == 30) {
			System.out.println("30이다");
		}
		else {
			System.out.println("그 외의 값");
		}
		
		//ex15 : switch 
		
		int day = 2;
		switch (day) {
		case 1: 
			System.out.println("Saturday");
			break;
		case 2:
			System.out.println("Sunday");
			break;
		}
		
		//ex16 : 주민번호를 입력받아 변수 gender의 값이 2,4면 여자, 1,3이면 남자를 출력
		System.out.println("주민번호를 입력하세요. ex)123456-7890123");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();				//사용자에게 String값을 입력받는 함수 nextLine()을 호출해 String 값을 얻는다
		
		char gender = str.charAt(7);			//받은 값 중에서 7번째 index의 char값 하나만 추출해서 char gender 변수에 담아준다
		System.out.println(gender);
		
		switch (gender) {
		case '1': 
			System.out.println("남성");
			break;
		case '2': 
			System.out.println("여성");
			break;
		case '3': 
			System.out.println("남성");
			break;
		case '4': 
			System.out.println("여성");
			break;
		}		
		sc.close();
		
		//ex17 아래의 코드의 결과를 유추해 보기 break 없을 때 어떻게 작동할까? 20이후 계속 출력
		int d = 20;
		switch (d) {
		case 10:
			System.out.println("d는 10이다");
		case 20:
			System.out.println("d는 20이다");
		case 30:
			System.out.println("d는 30이다");
		default:
			System.out.println("그 외의 값");
		}
		
		
		
	}

}
