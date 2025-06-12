package sec04.exam01;

public class Calc {

//	전원 켜는 메소드 void는 타입이없다
	void powerOn() {
		System.out.println("전원ON");
	}
	
//	메소드명 powerOff; 인데 powerOn 과 동일하게
	void powerOff() {
		System.out.println("전원Off");
	}	
	
	/**
	 * JAVADOC 주석
	 * 더하기 기능 
	 * 두 수를 입력 받아서 더한 결과를 돌려주는것
	 * 
	 * 메소드명 : plus
	 * 전달인자 : int x, int y
	 * 리턴타입 : int (두 수의 합)
	 * 
	 * @param int x, int y 
	 * @return int
	 * @author todair@naver.com
	 * 											
	 */
	int plus(int x, int y) {
		System.out.println("x : "+x );
		System.out.println("y : "+y );
		
		int result = x + y;
		
		return result; // 메소드 선언 완료
	}
		
	/**
	 * 두 정수를 입력 받아서 나누기한 결과를 double로 돌려준다
	 * 단! 0으로 나누는건 y가 0일땐 "안대용" 이렇게 출력하고 0을 돌려준다
	 * 
	 * 메소드명 : divide 
	 * 전달인자 : int x, int y
	 * 리턴타입 : double
	 */
	
	
//	double divide(int x, int y) {
//
//	    if (y == 0) {
//	        System.out.println("안대용");
//	        return 0;
//	    }
//	    else {
//    	 double result = (double) x / (double) y;
//	    return result;
//	    }
	    
	    
	    double divide(int x, int y) {
	    	System.out.println("x: "+ x + ",y: "+y);
	    	if (y != 0) {
	    		
	    	double a = (double) x / (double) y;
	    	System.out.println("a :"+a);
	    	return a;
	    	} else {
	    		System.out.println("안대용");
		        return 0;
	    	}
	    	}
	    	
	    
	    
	
	
	
	
	
		
}
		
		
	
	
	
