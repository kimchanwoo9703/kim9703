package sec01.exam01;

public class TypeCastingexam {

	public static void main(String[] args) {

		
		int intValue = 10;
		byte byteValue = (byte)intValue;
		System.out.println(byteValue);
		
// 여기서 괄호는 우선순위 연산자
		
		int a = 2 * (3+4);
		
// 127을 넘어가서 예상하기 힘듬
// 비트를 2의 보수로 계산한 결과가 나온다
		
		intValue = 200;
		byteValue = (byte)intValue;
		System.out.println(byteValue);
		
// 형 변환 연산자 type casting opreter
		
		double d = -3.14;
		int i = (int) d;
		System.out.println("i: "+ i );
		
		
	    int i2 = 100;
	    long l1 = (long)i2;
	    long l2 = i2;
	    System.out.println();
		
// byte < shoet < int < long < float < double 형변환 가능 거꾸로는 x
		
/*		int i3 = 3;
		long l3 = 4L;
		i3 + l3;        조건 x 3m 가 4L랑 더한다고표시  */
		
		int i3 = 3;
		long l3 = 4L;
		long l4 = i3 +l3;
// (long)i3 + l3; long로 자동 형변환
		
		int i4 = 2100000000;
		int i5 = 2100000000;
		int i6 = i4+ i5;         //int + int
		System.out.println(i6);  //-94967296
		
		
		int i7 =10;
		double d7 = 5.5;
		double d8 = i7 + d7;  //double 으로 형변환된 (double)i7이존재 d7생략
		System.out.println("d8: "+ d8);
		
		double d9 = 10.0 / 4;      //int 로 바뀜 .0 을 붙이던 앞 (double)을 붙임 뒤는 생략가능
		System.out.println("d9:" + d9);
		
// 105P 문자열 결합 연산   문자를 숫자로 바꾸기
////////////////중요///////////
		String s1 = "123";  // java.lang.NumberFormatException 중간에 다른문자 a 공백등 들어가면 에러 숫자양식에서 에러) 
//		int i8 = (int)s1; 지원x    
		int i8= Integer.parseInt(s1);  //함수 분석한다
		System.out.println(i8);
		
// 가장쉽게 숫자를 문자로 바꾸는 방법
		String s2 = ""+i8;
		
//퀴즈 회식비 43000원 참석인원은 4명 인당가격
//1. 디테일하게 원단위까지
		double total= 4.3;
		int count = 4;
//double result1 = total / (double) count;
		double result1 = total / count;
		System.out.println("1번 : "+ (result1 *10000));
//2. 참석인원은 만원단위로만 회식비를 낸다
		int result2 = (int)result1;
		System.out.println("2번: "+ (result2 * 10000));
		
//3. 2번처럼 받으면 주최자는 얼마를 내야하나
		double result3 = total - ((count -1) * result2); 
		System.out.println("3번: "+ (result3 * 10000));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
