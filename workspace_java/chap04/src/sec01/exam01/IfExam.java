package sec01.exam01;

public class IfExam {

	public static void main(String[] args) {

/*		
		int score = 75;
		
		if (score >= 90) {
			System.out.println("90 이상입니다");
			System.out.println("A 등급");
			
		}
		if (score >= 90) {
			System.out.println("90 미만입니다");
			System.out.println("B 등급");
		}
		
		
		
		if (score >= 90) {
			System.out.println("90 이상입니다");
			System.out.println("A 등급");
			
		} else {      //if (score >= 90)
			System.out.println("90 미만입니다");
			System.out.println("B 등급");
		}
		
		
		
// when  = else if
		
		if (score >= 90) {
			System.out.println("A 등급");
//		} else if(score < 90 && score >= 80)
		} else if (score >= 80) {
			System.out.println("B 등급");
		} else if (score >= 70) {
			System.out.println("C 등급");
		} else {
			System.out.println("D 등급");
		}
//      else 가 있다는 건 무조건 하나의 실행블럭이 실행 된다.
		score= 97;
		if(score >= 95) {
			System.out.println("95점 이상");
		} else if (score >= 90) {
			System.out.println("90점 이상");
		} 
		
		if (score >= 90)
			System.out.println("90점 이상");
		
		if (score >= 95) {
			System.out.println("95점 이상");
		}		
		
		
		if(score >= 90) {
			System.out.println("90점 이상");
		}
		if (score >= 95){
			System.out.println("95점 이상");
		} 
		
		int x =3;
		if (x%2 ==0){
			System.out.println("짝수");
		
//		if (x%2 != 0)
//		if (x%2 == 1)
		} else {
		
			System.out.println("홀수");
		
	    }	
		
		/////////////////////////////////////
		///////////////랜덤//////////////////
		/////////////////////////////////////
		
		double random1 = Math.random();
		System.out.println(random1);
	    
		// Math.random()
				// 0 <= Math.random() < 1
				// 주사위 : 1~6
				// 0~5로 구해놓고 +1을 해서 1~6까지 만들겠다
				// 대충 나머지로 구하는 법
		double random2 = Math.random() * 10000;
	                 //int 를 적용해서 나머지 소숫점을 없앰	
		int dice = ( (int)random2 ) % 6 + 1; // 1234 % 6 : 0~5  +1 = 1~6
		System.out.println("주사위 : "+ dice);
		
		// 0 <= Math.random() < 1
		// 3 + 2 =5
		// 3 + 2 + 10 = 5 + 10
		// 0 < 5 < 10
		// 0*6 <= Math.random()*6 < 1*6
   		// 0 <= Math.random() *6 < = 0 ~ 5.99999999999999999

		int dice0 = (int) (Math.random() *6); // 0~5
		dice = dice0 +1; //1~6
		System.out.println("주사위 : "+ dice);		
	
		int lotto1 = (int) (Math.random() *45) + 1; //1~45
		System.out.println("lotto1: " + lotto1);		
				
		
		int num = 1;
		if (num == 1) {
			System.out.println("num은 1입니다");
		} else if (num ==2) {
			System.out.println("num은 2입니다");
		} else {			
			System.out.println("num은 1과 2가 아닙니다");
		} 
		
		// 사용가능 char, byte, short, int m String
		// 사용불가 boolean, long, float, double
		switch(num) {
			case 1:
				System.out.println("switch num은 1입니다");
//				break;
			case 2:
				System.out.println("switch num은 2입니다");
				break;
			default :
				System.out.println("switch num은 1과 2가 아닙니다");
				break; }
			
		
		int month = 1;
		
		if (month == 3 || month ==4 || month ==5) {
			System.out.println("봄");
		} else if (month == 6 || month ==7 || month ==8) {
			System.out.println("여름");
		} else if (month == 9 || month ==10 || month ==11) {
			System.out.println("가을");
		} else if (month == 12 || month ==1 || month ==12) {
			System.out.println("겨울");
		} else {
		    System.out.println("X");
		}
		
		
		
		if (month ==1) {
			System.out.println("겨울");
		} else if(month ==2) {
			System.out.println("겨울");
			
		}
		if ( 3<= month && month <=5) {
			System.out.println("봄");
		}if ( 6<= month && month <=8) {
			System.out.println("여름");
		}if ( 9<= month && month <=11) {
			System.out.println("가을");
		} else {	
			System.out.println("겨울");
		}		
			
			
		switch(month) {
			case 3:
				System.out.println("봄");
			case 4:
				System.out.println("봄");
			case 5:
				System.out.println("봄");
			break;
		
			case 6:
				System.out.println("여름");
			case 7:
				System.out.println("여름");
			case 8:
				System.out.println("여름");
			break; }
		
		
		int i = 10;
		if(i >5) {
			System.out.println("5보다 크다");
		}
		if(i>5)
			System.out.println("5보다 크다");
		
		if(i < 0) i = 0;
		
		if (i >50)
			System.out.println("보다 크다");
			
		System.out.println("양수");

		*/
		
//		if (i>0)
//			if(i>5)
//				System.out.println("5보다 크다");
//			else
//				System.out.println("5보다 작다");
//		else
//			System.out.println("음수");
		
		
		
		
		// 퀴즈 문제1
		int num = 56456463;
		if (num >0) {
			System.out.println("양수 입니다");
		}else if (num ==0) {
			System.out.println("0입니다");
		}else {
			System.out.println("음수 입니다");
		}
		
		// 퀴즈 문제2
		int a = 1121112;
		int b = 2156984;
		if (a > b) {
			System.out.println("높은숫자: " + a);
		} else {
			System.out.println("높은숫자: " + b);
		}	


		
		// 퀴즈 문제3
		int h = 5;
		int m = 30;

		m += 35;
		if (m >= 60) {
		    h += 1;
		    m -= 60;
		}
		System.out.println("35분 후: " + h + "시 " + m + "분");
		// 퀴즈 문제4
		int a1 = 55;
		if (a1 >= 10 && a1 <= 20) {
		    System.out.println("범위 안");
		} else {
		    System.out.println("범위 밖");
		}
		// 퀴즈 문제 5
		int money = 10000;
		int withdraw = 10; 
		if (withdraw <= 0) {
		    
		} else if (withdraw > money) {
		    System.out.println("잔액부족");
		} else {
		    int remaining = money - withdraw;
		    System.out.println(withdraw + "원 출금 " + remaining + "원 남음");
		}
		
		
		// 퀴즈 문제 6
		int num2 = 0; 
		if (num2 > 100) {
			System.out.print("100보다 큰수, ");
		} else {
			System.out.print("100보다 작은수, ");
		}
		
		if (num2 >= 0) {
			System.out.print("양수, ");
		} else {
			System.out.print("음수, ");
		}
		
		if (num2 % 2 == 0) {
			System.out.println("짝수.");
		} else {
			System.out.println("홀수.");
		}
		
		
		// 퀴즈 문제 7
		int yesterday = 2;
		int today = -3;
		
		int d = today - yesterday;
		
		System.out.print("오늘 ");
		if (today < 0) {
			System.out.print("영하 " + Math.abs(today) + "도 ");
		} else {
			System.out.print(today + "도 ");
		}
		System.out.print("입니다. ");
		
		if (d > 0) {
			System.out.println("어제보다 " + d + "도 높습니다.");
		} else if (d < 0) {
			System.out.println("어제보다 " + Math.abs(d) + "도 낮습니다.");
		} else {
			System.out.println("어제와같은온도.");
		}
		
		
		// 퀴즈 문제 8
		int numbur = 11; 
		int tlq = numbur / 10;
		int dlf = numbur % 10;
		
		if (tlq == dlf) {
			System.out.println("10의 자리와 1의 자리가 같습니다.");
		} else {
			System.out.println("10의 자리와 1의 자리가 다릅니다.");
		}
		
		
		
		// 퀴즈 문제 9
		
		int x1 = 10, y1 = 20;
		int x2 = 90, y2 = 100;
		int x3 = 50, y3 = 70; 

		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
}

