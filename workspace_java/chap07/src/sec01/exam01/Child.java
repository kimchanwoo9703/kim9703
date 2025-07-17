package sec01.exam01;

public class Child extends Parent {
	

	void printName() {
		System.out.println("Child의 printName 실행");
		System.out.println("name :"+name);
		System.out.println("this.name :"+this.name);
		
		String pName = getName();
		System.out.println("pName :"+pName);
		
		System.out.println("super.name :"+super.name);
	}
	//전달 인자가 필드를 가리는 현상을  shadow
	void setName(String name) {
		this.name = name;
	}
	
//	부모의 필드를 가리는 형상 overshadow 
	String name = "Child의 name";
		

	Child(){
//		this(1); super이랑 같이 사용 못함 둘다 첫줄에 작성대야함
		super(1); //부모의 전달인자 맞춰줘야함
		System.out.println("Child 생성자");
		
	}
	Child(int a){
		super(1);
	}
	
	String getName() {
		System.out.println("Child의 getName 실행");
		return this.name;
	}
	
}
