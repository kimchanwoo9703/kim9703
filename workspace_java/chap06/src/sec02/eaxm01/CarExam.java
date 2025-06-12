package sec02.eaxm01;

public class CarExam {

	public static void main(String[] args) {

//		객체(클래스)생성
		Car myCar = new Car();
		
		System.out.println( myCar.company );
		myCar.company = "";
		
		System.out.println(myCar.speed);
		myCar.speed = 160;
		System.out.println(myCar.speed);
		
//		새로운 영역생김 myCar2
		Car myCar2 = new Car();
		System.out.println( myCar2.company );
		
		
		
		
		
	}

}
