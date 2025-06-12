package sec04.exam03_return;

public class Car {

	int gas;
	
	void setGas(int g) {
		gas = g;
	}
	
	
	
	
//	gas 가 0이면 false 그렇지 안으면 true 를 돌려주는 메소드
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas 없어용");
			return false;
		} else {
//		else 가 있는건 무조건 하나는 실행되는 것을 보장!
			System.out.println("gas 있어용");
			return true;
		}
	}
//		System.out.println("gas 있어용");
//		return true;

	boolean isLeftGas2() {
		boolean result = false;
		
		if(gas == 0) {
			System.out.println("Gas 없어용");
			result = false;
		} else {
			System.out.println("gas 있어용");
			result = true;
		}
		return result;	
	}
	
	boolean isLeftGas3() {
		return gas != 0;
	}
	
	void run() 			{
		while (true)   {
			if(gas > 0) {
				System.out.println("달려용ㅇㅇㅇㅇㅇㅇ 잔량:"+gas);
				gas--;
			} else 		{
				System.out.println("멈춰용ㅇㅇㅇㅇㅇ 잔량:"+gas);
				return;
			}
			} 
			}
			}		
	
	
	
	
	
	

	
	
