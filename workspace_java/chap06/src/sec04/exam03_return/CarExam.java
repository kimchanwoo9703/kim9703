package sec04.exam03_return;

public class CarExam {

	public static void main(String[] args) {

		Car car = new Car();
		
		boolean status = car.isLeftGas();
		System.out.println("가스있나? "+ status);
		
		car.gas = 3;
		car.setGas(5);
		
		status = car.isLeftGas();
		System.out.println("가스있나? "+ status);
		
		
		if(status) {
			System.out.println("ㄱㄱㄱㄱㄱㄱㄱㄱㄱ~");
			car.run();
		}
		
		
		
		
		
		
		
	}

}
