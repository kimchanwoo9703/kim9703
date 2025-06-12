package sce04.exam04;

public class Student {

//	클레스 문제 *필드*
//	학생(student)이라는 클레스 를 만들고  o
//	이름과 나이 필드를 만든다
//	학생 Exam 클래스를 만들고
//	학생 2명을 각각 등록하고
//	두 학생의 정보를 각각 출력
	
//	메소드 문제
//	메소드를 통해서 이름과 나이를 전달해서 저장하는 메소드
//	이름과 나이를 돌려 받아서 출력하기
	
	String name;
	int age;
	
	void setName(String n) {
		name = n;
	}
	String getName() 	    {
		return name;
	}
//	get은 void 안붙고 변수붙음
	
	 void setAge(int a)    {
		 age = a;
	}
	
	int getAge() 		    {
	return age;
	}
	
//	void setInfo(String n, int a) {
//		name = n;
//		age  = a;
//	}
	
	
	
//		String getInfo() {
//		return name + ","+age;
//	}
//	
//	String getName (String n) {
//		
//	}
	
}
