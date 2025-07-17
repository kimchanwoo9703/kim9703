package sec01.exam01;

public class ExtedsExam {

	public static void main(String[] args) {

		
		//Child를 생성해서 print name 실행
		Child child = new Child();
		System.out.println("---------------------------------");
		child.printName();
		
		System.out.println(   child.getName() );
		child.setName("바뀐 이름");
		System.out.println(   child.getName() );
		
		System.out.println( "child.name :"+child.name );
	
		System.out.println( "child.getName() :"+child.getName() );
		child.setName("바뀐 이름");
		System.out.println(child.getName());
	
	}
}
	
	

