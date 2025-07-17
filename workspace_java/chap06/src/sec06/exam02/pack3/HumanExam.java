package sec06.exam02.pack3;

//import sec06.exam02.pack2.Human;
import sec06.exam02.pack1.*;
public class HumanExam {

	public static void main(String[] args) {

//		new Human(); // pack2.Human
//		
////		클래스명이 같으면 한번밖에 못부름
////		pack1.Human 부르는법 같은방법으론 안됌
////		new sce06.exam02.pack1.Human();  이런식으로 패키지 명까지 붙여주면 가능
////		new sec06.exam02.pack1.Human();  이런식으로 하거나
//		sec06.exam02.pack1.Human h2 = new sec06.exam02.pack1.Human();
		
		new Human(); // pack1.Human 은 가능
//		new Sub1();  // 이건 안됌pack1.Human.sub1 까지 작성해야 가능 하위 패키지 클라스라서
		
//		import java.lang.* 자동선언 되어서 import 는 생략가능
		String a = "1";
		System.out.println();
		Math.random();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
