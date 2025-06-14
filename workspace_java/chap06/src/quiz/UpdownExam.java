package quiz;

import java.util.Scanner;

public class UpdownExam {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num = (int)(Math.random() * 1001);
		int num1;
		int count = 0;
		
		System.out.println("Up&Down 시작");
		
		while (true) {
			System.out.println("숫자입력");
			num1 = scanner.nextInt();
			count++;
		
		if(num1 < 0 || num1 >1000) {
			System.out.println("0~1000사이 입력해주세요");
			continue;
		}
		if (num1 <num) {
			System.out.println("업");
		} else if(num1 >num) {
			System.out.println("다운");
		} else {
			System.out.println("정답");
			System.out.println("횟수 :"+ count + "번 만에 정답");
			break;
		}
		}
			
			
		
		
		
		
		
		
		
			
		
		
		
	}

}
