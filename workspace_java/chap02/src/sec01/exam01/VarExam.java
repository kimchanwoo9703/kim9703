package sec01.exam01;

public class VarExam {

	public static void main(String[] args) {

		int value; // int value; 변수 선언
		value = 5; // 변수에 값 넣기
		value = 6; // 덮어쓰는효과
		System.out.println(value);

		int result = value + 10; // 변수 이름은 상관없음 result= value +10
// 실행전 나올 값 예측한후 실행하기
/* syso 컨트롤 스페이스 */
		System.out.println(result); // (변수)result = value 다 더해진값
// 연산자 우선순위가 +가 =보다 빠름 = 기준으로 오른족
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간" + minute + "분");

		System.out.println("value : " + value);

		value = value + 1;
		System.out.println("value : " + value);

// 한줄 지우기 ctrl d
// 한줄복사 ctrl alt 위아래 방향키
// 주석 단축기 ctrl /
// 한줄이동 alt 위아래 방향키
// 자동정렬 ctrl shift f
// 변수 a를 선언과 동시에 10으로 초기화
		int a = 10;
		int b; // 변수선언
// System.out.println(b);

// System.out.println(x); 출력x
		int x = 10;
		int y = x;

		System.out.println(x);
		int z = 5;
		System.out.println("z : " + z);
		
//= 은 대입연산자, 할당연산자 오른쪽의 값을 왼쪽의변수에 넣는 기호
//변수는 서언이후에 사용가능하다
// 그 지역이 끝날때 까지 사용가능={} 중괄호 사이
// {} 안에 다른 {} 있어도 사용가능
		
		
		int x1 = 26845;
		int x2 = 648648;
		
	    int x3 = x1;
	    x1 = x2;
		x2 = x3;

		System.out.println("x1 : " + x1); 
		System.out.println("x2 : " + x2); 
          
		
		
// user + info
// userInfo : 카멜 케이스 camel case 중간에 대문자로 이어지는거
// user_info: snake case
// nUserInfo, sUserInfo : 헝가리언 표기법


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	}

}
