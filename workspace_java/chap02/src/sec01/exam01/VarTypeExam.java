package sec01.exam01;

public class VarTypeExam {

	public static void main(String[] args) {
        
//b1 = 128;  범위초과 
		byte b1;
        b1 = 127;
        System.out.println("b1: "+ b1);

        
// char = 아스키코드 65=A char 는 글씨전용 변수
	    char c1 = 65;
	    System.out.println("c1:" + c1);
		c1 = 65 +2;
		System.out.println("c1:" + c1);
		
// 글씨 하나를 표할떄 ' 나머진 "
		char c2 = 'F';
		System.out.println("c2:" + (c2-c1));
		
// char 은 글씨 하나만 표시가능
		char c3 = '한';
		System.out.println("c3: "+c3);
		System.out.println("c3: "+(c3+1));
		
//중간에 " 넣고싶을때 앞에 \         \= 탈출문자 
		String s1 = "김찬우";
		System.out.println("s1:"+ s1);
		
		String s2 = "김\"찬우";
		System.out.println("s2:"+ s2);
//  \T는 적당한공백   \n 은 엔터 표시						
		String s3 = "김\t찬\n우";
		System.out.println("s3:"+ s3);
		
//() 안에넣어야 한번에 출려됌
		s3 = s3 + "글씨" + (3+1);
		System.out.println(s3);
		
		String s4 = 3+2+"글씨";
		System.out.println(s4);
		
		String s5 = s3+ s4;
		System.out.println(s5);
		
		
		int i1 = 2100000000;
//X int i2 = 2200000000;
       
//long l1 = 2200000000;      int 형태 long 타입x
//L 또는 l을붙이면 명시적인 long 안붙이면 무조건 int 로인식		
		long l1 = 2200000000L;    
	    
	    long l2 = 123;
	    
	    System.out.println();
	    
	    float f1 = 3.14f;
	    double d1 = 3.14;
	    System.out.println("f1:"+ f1);
	    System.out.println("d1:"+ d1);
// float 는 8자리 까지만 출력가능	소숫점 7자리까지만 신뢰할수있음 (끝자리 반올림됌) 
        float f2 = 0.123456789f;
        System.out.println("f2:"+ f2);
	
// double 는 소숫점 16자리까지만 신뢰가능 (끝자리 반올림됌) 	    
        double d2 = 0.12345678901234567890;
        System.out.println("d2:"+ d2);
        
        double i10 = 5e2;  //500
        System.out.println("i10:"+ i10);
	
// 참과 거짓을 저장하는 방법 boolean
        boolean stop = true;        
        boolean start = false;
        
//  내 나이를 저장하시오
        int age;
        age = 29;
        
// 내 소유 차가 있다
        boolean car = true;        
   
        
// 우리집에 있는 스마트폰의 개수 phone
        int phone = 3;
        
        
        
// 내이름 name
        String name = "김찬우";
	
	
	
// 1평은 3.3 제곱미터입니다 . 5평은? area
		double area = 5* 3.3;
		

		
// 퀴즈0  두 변수 a,b 에 각각 3, 4 를 넣고 "3과4" 로 출력
		int a =3;
	    int b =4;
	    System.out.println(a + "과" +b); 
	    
//퀴즈 1 두 변수 a,b에 각각 3,4 를넣고 출력결과 "3>4의 결과는 false
	   
	    System.out.println(a + " > " + b + "출력값" + (a > b)+ "결과"); 
	        	
//퀴즈 1-1 풀이
	//	int x=3;
	//	int y=4;
	//	System.out.println(x +">" + y + "결과는"+(x>y)+ "입니다");
		
	    
//퀴즈 2 두 변수의 값을 6,5 변경 출력 결과 6>5의 결과는 true입니다
	    int x =6;
	    int y =5;
	    System.out.println(x + " > " + y + "출력값" + (x > y)+ "결과");


	    
// 퀴즈 2 숫자 132 출력결과 백의자리 5 십의자리 3 일의자리 7 출력
	    
	   int num = 567;
	   int qor = num / 100;
	   System.out.println("백의자리 : "+ qor);
	   num = num - (qor * 100);
	   System.out.println("num : "+ num);
	   int tlq = num /10;
	   System.out.println("십의자리 : "+ tlq);
	   num = num - (tlq * 10);
	   System.out.println("num : "+ num);
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	
	}

}
