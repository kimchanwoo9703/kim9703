package sce03.exam01_0612;

public class Car {

//	리턴타입이 없으면서 클래스명과 같은이름의 메소드를 생성자
//	new Car 를 실행할때 무조건 실행되는 메소드 *생성자의특징*
	
//	Exam class 에서 new Car(); 출력값:Car 생성자 실행

//	Car() {
//		color = "빨강";
//		if
//		for      전부 가능
//		test();
//	}
	
//	기본생성자를 생략한경우
//	기본 생성자가 자동 완성된다.
//	예 : Car() {
//	
//	생성자가 하나라도 선언되어 있으면 기본 생성자는 만들어지지 않는다
//	}
//	System.out.println("Car 생성자 실행");
                 
		
	String model = "아방이";
	String color;
	int maxSpeed;
	CarExam carExam = new CarExam();
	
	
//	Car(String c){
//		color = c;
//	}      *에러아님*
	
	Car(String c){
		this("아방이",c, 240);
//		this(); //전달인자가 없을땐 이렇게 가능
//		다른 생성자를 호출하는법 ,무조건 첫줄
		
		color = c;
		model = "아방이";
		maxSpeed = 240;       
	}
	
	
	Car(String m, String c, int ms){
		model = m;
		color = c;
		maxSpeed = ms;
	}
	
	
	
	void test() {
		
	}
//	void setColor(String c) {
//		color = c;
//	}   *에러아님*
	
//	void setColor() {
//		String color;    //이것도 가능  이건 컬러라는 바구니를 만들어줘서
//		color = "빨강";   //이렇게 작성하면 지역변수   이렇게하면 빨강으로 적용
//	}
	
	void setColor(String color) {
//		this.color = "빨강";    
		this.color = color;    
//		this.test();   필드는 붙혀주고 메소드는 this를 거의 안붙힘
		
		
		
	}
	
	
	
	
	
}
