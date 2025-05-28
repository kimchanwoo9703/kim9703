package sec02.exam02;

public class OpExam {

	public static void main(String[] args) {

		int x = 10;
		
		x++;
		System.out.println("x:" + x);
		++x;
		System.out.println("x:" + x);
		
		x = 10;
		x = x +1; // 출력값11
		x += 1;   // 동일한 코드
		x++;      // 동일한 코드 단 1을 증가할때만 가능
		
		
		int y = 10;
		y--;
		--y;
		System.out.println("y :" +y);
		
		x=  10;
		int z = ++x;
		System.out.println("z :" +z);
		
		x = 10;
		z = x++;
		System.out.println("z :" +z);
		System.out.println("x :" +x);
		
		x = 10;
		System.out.println("x++ :" + ++x);
		
		x = 10;
		System.out.println("x++ :" + x++);
		
// 항을 넘어갈때벗어날때 or 엔터  더하기됌
		x = 1; 
//		     1  +  3
	    z = x++ + ++x;
	    System.out.println("z :" + z);
	    System.out.println("x :" + x);
		
		x =1;
		
// 순서     3        1   2     4
//		   x= 1>> 2 >> 1>> 2>> 1
//          1  -   1 *  1   -  2   
// 값       1  -   0 *  0   -  2             x의값            
		z = x++ - (--x * x++) - x--;
		System.out.println("z :" + z);
	    System.out.println("x :" + x);
		
		boolean a = false;
		a = !a;         //! =not
		System.out.println("a :" + a);
		
//      나누기할때 0으로 나누지 않게 조심 infinity 출력
		int b = 10;
//      int c = b/0;   by zero 에러
        
		double d = 7.3;
		double e = d/0;
		
		System.out.println(d);
		
//      참 거짓을 담을수있는 변수는 boolean 뿐
//		boolean 3 > 4 ;
//      소숫점을 비교할때는 같은 타입으로 변환해서 비교		
        System.out.println(0.1 == 0.1f); //false
        System.out.println(0.1 == 0.1f); //true
        
//      대문자 시작하는 타입은 == 사용x 글씨는 무조건 equals
        String s1 = "s1";
        String s2 = "s" +1 ;
        System.out.println(s1.equals(s2));
        System.out.println( "s1".equals(s2)); // 이것도 가능 아닌걸 true 하고싶을땐 !
        
        System.out.println(10 % 3);
        
        
// 퀴즈 돈이 10000원 4500원짜리 최대 몇잔 살수있나요
        int money = 10000;
        int coffee = 4500;
        int count = money / coffee;
        System.out.println("총 :"+count +"잔");
        
//      그리고 남은돈
        int change = money % coffee;
        System.out.println("잔돈 :"+ change);
        
// 퀴즈 올리브영에 꿀홍차가 8000원 15% 세일 나는 얼마를 줘야할가
        
//        int hunny = 8000;
//        double m = hunny - (hunny -*.15);
        
        int score = 87;
        System.out.println("내 점수는 80과 90사이다 참? 거짓?");
        System.out.println( score >= 80 && score <=90 );      // && 앤드
        
//      957 을 900 으로 바꾸는법 957-57    957%100= 57
//      어떤 숫자를 10의 자리 이하 버림        
//      a - (a%100)
        
        int k = 1937;
        k = k - (k %100 );
        k = k / 100;
//      k /= 100;
        k = k * 100;
//      k *= 100;
        
        
//      v1 / v2를 소수점 3자리까지 출력하시오        
        double v1 = 1000.0;
        double v2 = 794;
        double v3 = v1/ v2;
//      System.out.println("%.3f",v3);
//      (int) (v3 * 1000) // 1259
        v3 = ( (int) (v3 * 1000) ) / 1000.0;
        System.out.println(v3);
        
        double v4 = (v1 /v2) * 1000;
        int v5= (int) v4;
        double v6 = (double) v5 / 1000;
        System.out.println(v6);
        
        
        int s= 95;
//      char int 사용 x
        String grade = ( s > 90 ) ? "A" : "B";
        System.out.println("grade:"+ grade);
        
        
        
        
        
        
        
        
        
        
        
        
        
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
