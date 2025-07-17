package sce06.exam06;

public class Car {

	
//	필드는 private 로 지정해서 직접 읽고 쓰는걸 방지
	private int speed;
	private boolean stop;
	
	private String color;
	private double gas;
	
	
	//이렇게 만들어도 되지만
	public int test() {
		return this.speed;
	}
	
//	getter 보통 필드값을 돌려주는 기능
//	메소드명 : get + 필드명 (대문자로 시작)
//	전달인자 : 없음
//	리턴타입 : 필드의 타입으로 return
	public int getSpeed() {
		return this.speed;  //필드를 직접 노출안하려는게 목적 수정을못하게하기위해
	}
		
//	setter 보통 필드값을 수정 하는 기능
//	메소드명 : set + 필드명 (대문자로 시작)
//	전달인자 : 필드의 타입
//	리턴타입 : void 없음
	void setSpeed(int speed) {
		if(speed >= 0) {
			this.speed = speed;
		}
	}
			
	
//	getter 중에서 boolean 타입의경우
//	get 대신 is 를 사용하기도함
//	getStop, isStop 둘다 허용되지만 일부에서는 get만 사용가능한 경우가 있다
	public boolean isStop() {
		return this.stop;
	}
	public boolean getStop() {
		return this.stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	

	// 자동 완성된 getter/setter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getGas() {
		return gas;
	}

	public void setGas(double gas) {
		this.gas = gas;
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	




