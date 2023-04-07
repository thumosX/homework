package day07;

import java.util.Scanner;

public class Control_ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ex1
		int a= 5, b =15;
		if (a > 10) {
			System.out.println("a=" + a);
		}
		System.out.println("---------");			//---------
		
		if (b > 10) {
			System.out.println("b=" + b);			//b=15
		}
		
		//ex2
		int c=10, d=20;
		boolean flag=true;
		
		if(c == 10) {
			System.out.println("a가 10이면 참");
		}
		if(c == d) {
			System.out.println("a가 b와 같으면 참");
		}
		if(flag) {
			System.out.println("flag값이 true이면 참");
		}
		System.out.println("이 문장은 if문과 상관없이 실행");
		
		//ex3
		int e = 89;
		if (e >= 60) {
			 System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		
		//ex4
	
		boolean flag1 =false;
		if (c>10) {
			System.out.println("a는 10보다 크다");
		}
		
		if (c==10 && d>=20) {
			System.out.println("조건을 만족함");
		}
		else {
			System.out.println("조건을 만족하지 못함");
		}
		
		if(flag1) {
			System.out.println("참");
		}
		else {
			System.out.println("거짓");
		}
		
		//ex5 : 입력받는 점수에 따라 60점 이상이면 합격, 미만이면 불합격을 출력하는 프로그램
		int jumsu;
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하라");			//점수를 입력받는 위치가 여기인가?
		jumsu = sc.nextInt();
		
		if (jumsu >= 60) {
			System.out.println("합격");
		}
		System.out.println("불합격");
		
		//ex6 : 나잘난의 성적 총합계와 평균을 구해서 출력하는 프로그램
		int p = 60, j = 70, x = 80, y = 50, z = 30;
		int sum = p+j+x+y+z;
		double avr = sum/5;
		System.out.println("나잘난 성적 총합계는 "+ sum + "평균은 " + avr + "입니다");

		
		//ex7 : 직사각 기둥 가로 4 세로 6 높이 5일때 부피 구하기
		int w = 4, l = 6, h =5;
		int v1 = w*l*h;						//부피 : 가로*세로*높이
		System.out.println("직사각 기둥의 부피는 " + v1);
		
		//ex8 사용자에게 임의의 길이(가로, 세로, 높이)를 입력받아 부피를 출력할 수 있게 
		int width1, length1, height1;
		Scanner w1 = new Scanner(System.in);
		System.out.println("가로는?");
		width1 = w1.nextInt();
		Scanner l1 = new Scanner(System.in);
		System.out.println("세로는?");
		length1 = l1.nextInt();
		Scanner h1 = new Scanner(System.in);
		System.out.println("높이는?");
		height1 = h1.nextInt();
		
		int vol = width1*length1*height1;
		
		System.out.println("직사각 기둥의 부피는" + vol + "입니다");
		
		
		//ex9 원기둥의 부피 구하기 (원주율은 3.14f)
		int r = 3, h2 = 7;
		float pi = 3.14f;
		float v2 = r*r*h2*pi;
		System.out.println("원기둥의 부피는 " + v2 + "입니다");
		
		//ex10 사용자에 반지름과 높이를 입력받아 부피를 출력
		int round, height3;
		Scanner r1 = new Scanner(System.in);
		System.out.println("반지름은?");
		round = r1.nextInt();
		Scanner h3 = new Scanner(System.in);
		System.out.println("높이는?");
		height3 = h3.nextInt();
		
		float vol2 = round*round*height3*pi;
		
		System.out.println("원기둥의 부피는" + vol2 + "입니다");
	
	
	}
}
