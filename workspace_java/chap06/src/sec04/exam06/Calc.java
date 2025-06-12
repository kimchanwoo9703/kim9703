package sec04.exam06;

public class Calc {

	int plus(int a, int b) {
		System.out.println("int int 실행");
		return a+ b;
	}

	
	
//	전달인자가 int int로 같기때문에 오버로딩 적용안댐
//	int plus(int a, int b) {
//		return a+ b;
//	}
	
	
	
	double plus(double a, double b) {
		System.out.println("double double 실행");
		return a + b;
	}
	
	double plus(int a, double b) {
		System.out.println("int double 실행");
		return a + b;
	}

//	int plus(int b, int a) {
//		System.out.println("int int 실행");
//		return a+ b;
//	} 타입이 같으니 안됌


	int plus(int x) {
		return x + x;
		
	}
	
	String model;
	String colr;
	int year;
	
//	void setInfo(String m, String c, int y) {
//		model
//	}
	
	
		
	
	
	
	
	
	
}
