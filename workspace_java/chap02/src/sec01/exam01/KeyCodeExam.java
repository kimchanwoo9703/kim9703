package sec01.exam01;

import java.io.IOException;
import java.util.Scanner;

public class KeyCodeExam {

	public static void main(String[] args) {
/*
		System.out.println(1);
		System.out.println(2);
		
		System.out.print(3);
		System.out.print(4);
		
		System.out.println();
		
		System.out.println(5);
		System.out.println(6);
		
*/		                        // %s 자리에 감자바 들어감
//		System.out.printf("이름: %s", "감자바");
		
		System.out.printf("이름: %1$s, 나이: %2$d" , "김자바", 25);
		System.out.printf("이름: %s, 나이: %d" , "김자바", 25);
		System.out.println();
		System.out.printf("이름: %6s, 나이: %04d" , "김자바", 25);
		
		
//		System.out.printf("이름: "+ name+",나이 : "+ age);
// 입력
		
		/*   Scanner 연습하려고 주석처리
		
		try {
			
			keyCode = System.in.read();
			System.out.println("keyCode: "+ keyCode);
			
			keyCode = System.in.read();
			System.out.println("keyCode: "+ keyCode);
			
			keyCode = System.in.read();
			System.out.println("keyCode: "+ keyCode);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		*/
// scanner 에 빨간줄 나오면 import 선택 or 컨트롤 쉬프트 o 빨간줄 지우기
// scanner 은 실무에선 사용 거의 x 연습용	
//타입  변수
// 변수에 담을수있는 모든것은 출력가능
		Scanner scan = new Scanner(System.in); // System.in을 Scanner안에 넣겠다  
//엔터까지의 모든 글씨
		String inputData = scan.nextLine();
		System.out.println("inputData :"+ inputData);
		
// 엔터쳤을 때 띄어쓰기까지의 모든 글씨
		String inputData2 = scan.next();
		System.out.println("inputData2 :"+ inputData2);
//엔터쳤을 때 숫자
		int input = scan.nextInt();
		System.out.println("input: "+ (input*10));
		
		System.out.println("x값을 입력하시오:");
		int input2 = scan.nextInt();
		System.out.println("입력한 x값: "+ input2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
