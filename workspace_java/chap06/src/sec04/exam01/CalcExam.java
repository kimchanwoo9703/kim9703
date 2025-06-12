package sec04.exam01;

public class CalcExam {

	public static void main(String[] args) {

		Calc calc = new Calc();
		
		calc.powerOn();
		calc.powerOff();
		
		int sum = calc.plus(5, 7);
		System.out.println("sum: "+sum );
		
		int x =5;
		sum = calc.plus(x, 7);
		System.out.println("sum: "+sum );
		
		
//		    int divide(int x, int y) {
//				System.out.println("x : "+ x );
//				System.out.println("y : "+ y );
//				
//				int result = x / y;
//				
//				return result; 
//			}
		    
		
//					(       2.0      )
		double b = calc.divide(10, 0);
		System.out.println("나누기: "+b);
		
		
		 
		
		
		
		
		
		
	}

}
