package sec01.exam01;

public class RefExam {

	public static void main(String[] args) {

		
		int a = 10;
		int b = a;
		System.out.println(a + ", "+ b);
		
		b = 12;
		System.out.println(a + ", "+ b);
		
//	    = 기준으로 무조건 오른쪽먼저 실행
//	    "찬우" 를 힙 heap 영역의 비어있는 번지에 할당(놓기)
//	    스텍 stack 영역의 변수c 에 방금 그 번지를 저장
		String c = "찬우";
		System.out.println("c : "+c);
		
		System.out.println( a == b);
		
//		== 또는 !=는 무조건 stack의 값을 비교한다
//		String c = "찬우";  축약한거 밑에가 정석
		String d = new String("찬우");
		System.out.println(c == d);
		System.out.println(c.equals(d));
		
//		String 값 비교는 무조건 equals() 를 사용한다
		
		String e = d;
		System.out.println( e== d);
		
		String f0 = "찬우";
		System.out.println("c==f0 :"+(c==f0) );
		
		String f = "찬"+"우";
		System.out.println("c==f :"+(c==f) );
		
		
//		a = null;  기본 타입에는 null을 넣을수없다 참조타입은 가능!
//		null 은 참조하는 주소가 없는 상태
		
		String g = "휴면";
		System.out.println("g == null :" + (g == null));
		System.out.println("g != null :" + (g != null));
		
//		String h = "";  비어있는값 문자값은 들어가있음 null X
		String h = "";  
		System.out.println("h != null :"+ (h != null));
		
		g = null;
		System.out.println("g == null :"+ (g == null));
		System.out.println("g + \"abc\":"+ (g+"abc"));
		
		System.out.println( h.equals(g) );
//		if(g != null) {   방어코딩 에러없앰
		if(g != null) {   
			System.out.println( g.equals(h) );
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
