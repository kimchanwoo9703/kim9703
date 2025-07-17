package sce05.exam02;

import java.util.Scanner;

public class Calc {

	String color;
//	static 이긴 하지만 필드다
//	static int plus
	static double pi = 3.14;
//	static int a = 10;
	int a = 10;
//	static int price = a;
	static int price;
//	price = 100;
	static{          //static 블럭은 자바 시작하자마 실행됌 new 보다 빨리실행됌
		price = 100;          // 이건 실행 가능
		System.out.println("값을 입럭하시오");
//		Scanner s = new Scanner(System.in);
//		price = s.nextInt();
	}
	Calc(){
		price = 10000;
	}
	
	
	
	
	
	
}
