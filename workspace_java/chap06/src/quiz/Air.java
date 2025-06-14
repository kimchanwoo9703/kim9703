package quiz;

public class Air {

    String brand;
    String di; 
    int dyd; 
    double ele; 
    int price;
    int bo; 
    boolean powerOn;

    // 💡 메서드 (기능)
    void powerOn() {
        powerOn = true;
        System.out.println("에어컨이 켜졌습니다.");
    }

    void cool() {
        if (powerOn) {
            System.out.println("차가운 공기가 나옵니다.");
        } else {
            System.out.println("전원을 먼저 켜주세요.");
        }
    }

    void filter() {
        if (powerOn) {
            System.out.println("공기를 걸러줍니다.");
        } else {
            System.out.println("전원을 먼저 켜주세요.");
        }
    }

    void lower() {
        if (powerOn) {
            System.out.println("온도를 낮춥니다.");
        } else {
            System.out.println("전원을 먼저 켜주세요.");
        }
    }

    void de() {
        if (powerOn) {
            System.out.println("제습 효과가 작동합니다.");
        } else {
            System.out.println("전원을 먼저 켜주세요.");
        }
    }

    void control() {
        System.out.println("리모컨으로 전원이 켜졌습니다.");
        powerOn = true;
    }
	
	
	
	
	
	
	
	
	
}
