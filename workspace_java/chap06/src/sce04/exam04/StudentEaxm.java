package sce04.exam04;

public class StudentEaxm {

	public static void main(String[] args) {

		Student s1 = new Student ();
		
		s1.name ="찬우";
		s1.age  = 29;
		
		Student s2 = new Student();
		s2.name ="미소";
		s2.age  = 27;
		
//		System.out.println(s1.age);
//		System.out.println(s2.name);
//		System.out.println(s2.age);
		
		System.out.println("이름: " +s1.name+ " 나이:"+ s1.age);
		System.out.println("이름: " +s2.name+ " 나이:"+ s2.age);
		
		s1.setName("참우");
//		System.out.println(s1.name);
		String name = s1.getName();
		System.out.println("name :"+name);
		
		
		
		
		
	}

}
