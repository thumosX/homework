package day07;

import java.util.Scanner;
public class Control_ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ex18 학년을 입력받아 출력
		int grade;
		Scanner sc = new Scanner(System.in);
		System.out.println("학년을 입력하세요");
		grade = sc.nextInt();
		
		switch(grade) {
		case 1:
			System.out.println("1학년입니다");
			break;
		case 2:
			System.out.println("2학년입니다");
			break;
		case 3:
			System.out.println("3학년입니다");
			break;
		case 4:
			System.out.println("4학년입니다");
			break;
		default:
			System.out.println("학년을 잘못 입력하셨습니다");
			
		}
		//ex19 : 18코드에서 grade 데이터타입을 int에서 String으로 변경하여 동작할 수 있도록 수정
		String grade1;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("학년을 입력하세요");
		grade1 = sc1.nextLine();
		
		switch(grade1) {
		case "1":
			System.out.println("1학년입니다");
			break;
		case "2":
			System.out.println("2학년입니다");
			break;
		case "3":
			System.out.println("3학년입니다");
			break;
		case "4":
			System.out.println("4학년입니다");
			break;
		default:
			System.out.println("학년을 잘못 입력하셨습니다");
		}
		
		
		
	}

}
