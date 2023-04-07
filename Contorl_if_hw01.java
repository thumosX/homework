package day08;

import java.util.Scanner;

public class Contorl_if_hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*0407 HW01 : 주민번호를 입력받아 8-9자리 변수 값별로 지역을 출력하는 프로그램 
		서울특별시 : 00~08
		부산광역시 : 09~12
		인천광역시 : 13~15
		경기도 : 16~25
		강원도 : 26~34
		충청북도 : 35~39
		대전광역시 : 40~41
		충청남도 : 42~47
		세종특별자치시 : 44, 96
		전라북도 : 48~54
		전라남도 : 55~66
		광주광역시 : 55, 56			이상한데? 전라남도랑 중복인데? 
		대구광역시 : 67~69, 76
		경상북도 : 70~75, 77~81
		경상남도 : 82~84, 86~89, 90~92
		울산광역시 : 85, 90
		제주특별자치도 : 93~95
		*/
			System.out.println("주민번호를 입력하세요. ex)123456-7890123");
			Scanner sc1 = new Scanner(System.in);
			String temp = sc1.nextLine();			//사용자에게 String값을 입력받는 함수 nextLine()을 호출해 String 값을 얻는다
			
			String jumin = temp.substring(8,10);	//받은 값 중에서 8, 9번째 index의 String값 하나만 추출해서 string 변수에 담아준다 (8-9번째)
			int sido = Integer.parseInt(jumin);		
			
			if (sido >= 0 && sido <=8) {
				System.out.println ("서울출신ㅋㅋㅋ");
			}
			else if (sido >= 9 && sido <= 12) {
				System.out.println ("부산출신ㅎㅎㅎ");
			}
			else if (sido >= 13 && sido <= 15) {
				System.out.println ("인천");
			}
			else if (sido >= 16 && sido <= 25) {
				System.out.println ("경기도");
			}
			else if (sido >= 26 && sido <= 34) {
				System.out.println ("강원도");
			}
			else if (sido >= 35 && sido <= 39) {
				System.out.println ("충청북도");
			}
			else if (sido >= 40 && sido <= 41) {
				System.out.println ("대전광역시");
			}
			else if (sido >= 42 && sido <= 47) {
				System.out.println ("충청남도");
			}
			else if (sido == 44 || sido == 96) {
				System.out.println ("세종특별자치시");
			}
			else if (sido >= 48 && sido <= 54) {
				System.out.println ("전라북도");
			}
			else if (sido == 55 || sido == 56) {
				System.out.println ("광주광역시");
			}
			else if (sido >= 57 && sido <= 66) {
				System.out.println ("전라남도");
			}
			else if (sido >= 67 && sido <= 69 || sido == 76) {
				System.out.println ("대구광역시");
			}
			else if (sido >= 70 && sido <= 75 || sido >= 77 && sido <= 81) {
				System.out.println ("경상북도");
			}	
			else if (sido >= 82 && sido <= 84 || sido >= 86 && sido <= 89 || sido >= 90 && sido <= 92) {
				System.out.println ("경상남도");
			}
			else if (sido == 85 || sido == 90) {
				System.out.println ("울산광역시");
			}
			else if (sido >= 93 && sido <= 95) {
				System.out.println ("제주특별자치도");
			}
			else {
				System.out.println("넌 어디서 왔니?");
			}
			
			
			sc1.close();

	}

}
