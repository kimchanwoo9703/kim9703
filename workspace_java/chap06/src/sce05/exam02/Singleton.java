package sce05.exam02;

public class Singleton {

	
////		안써도 null인지만 써줘서 강조함
//	private static Singleton singleton = null; 
//	
////	private Singleton(){         private 붙으면 클래스안에서만 사용가능 나만
////	}										접근할수없음 
//		
//	
////	Singleton getInstance() {
//	static	Singleton getInstance() {
//		if(singleton == null) {
//			singleton = new Singleton();
//		}
//		return singleton;
//	}
	
	private static Singleton singleton = new Singleton();
	private Singleton () {}
	static	Singleton getInstance() {
		return singleton;
	}








}
