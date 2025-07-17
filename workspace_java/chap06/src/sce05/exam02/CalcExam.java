package sce05.exam02;

public class CalcExam {

	public static void main(String[] args) {

//		static 쓰면 new 사용안해도 사용가능 
		System.out.println("Calc.pi :" +Calc.pi);
		
		Calc c1 = new Calc();
		c1.color = "쥐색";
		c1.pi = 3.141592;
		System.out.println("c1.pi :" +c1.pi);
		
		
		
		Calc c2 = new Calc();
		c2.color = "노랑";
		System.out.println("c2.pi :" +c2.pi);
		
//		클래스 클래스  메소드 ()가 없으면 무조건 변수 대문자로 시작하면 클래스                
		System.out.println( Math.PI);
		
//		2. test 메소드 사용하기
//		test(); 는 static 아니라서 사용못함
//		1. 메소드명 test 만들기
//		전달인자 , 리턴타입 없음
//		그냥 아무말이나 출력하는 메소드
		
	test(); }
	static void test() {
	System.out.println("가갸거겨고교구규그기");
	
	
	
	
	
	
	
	
	
	
	}
}		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


