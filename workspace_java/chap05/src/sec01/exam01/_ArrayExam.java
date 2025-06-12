package sec01.exam01;

public class _ArrayExam {

	public static void main(String[] args) {

		
		
//		배열 array 한번에 여러변수를 만드는 방법
//		같은 타입만 선언가능
//		생성할때 전체 크기를 지정해줘야함
//		생성된 여러 변수들은 index로 관리한다 (index는 0부터 시작)
	    
//		java 타입
//		int [] a;   
		int[]a1;  //앞에 String 오면 스트링 타입 뭐든올수있음 
//		c언어 타입
		int a2[];
		
//		배열 변수는 참조변수라서 null을 넣을수있다
		a1 = null;
		
		int score_0 = 90;
		int score_1 = 95;
		int score_2 = 80;
		
		int [] score = new int[30];
		score[0] = 90;
		score[1] = 95;
		score[2] = 80;
		
		System.out.println("score[1] :"+ score[1]);
		System.out.println("score[3] :"+ score[3]);
		
//		첫번째 [] : int []
//				int 로 이루어진 배열 변수 타입니다
//		두번째 [] : new int[3]
//				배열의 크기. 즉 한번에 만들 변수의 개수
//		세번째 [] : score[0] = 90;
//				만들어진 변수중에서 몇번째인지
			
//		배열 생성후 기본값은 0,false,null로 초기화됨
		String[] str= new String[3];
		System.out.println("str[1] :"+ str[1]);
//		System.out.println("str[122] :"+ str[122]); 
//		길이가 3 이라서 0~2까지만 사용가능한데 100을 넣어서 예외발생
//		배열을 선언하는 두번째 방법 넣을 값을 "모두" 정확히 알고있는경우
		
		int[] i1 = new int[] {90,95,80};
		int[] i2 = null;
		i2 = new int[] {90,95,80};
		
//		배열을 선언하는 세번째 방법
//		선언과 동시에 초기화 하는 경우에만 new int[] 생략가능
		
//		int[] i3 = {90,95,80};
//		int[] i4 = null;
//		i4 = {90,95,80};
//		
//		int[] seores = {83,90,87};
//		int sum =0;
//		for(int i=0; i<3; i++) {
//		System.out.println( scores[i]);
//		sum += scores[i];
//	}
//	System.out.println("총합 :"+ sum);
	
	
//	System.out.println("scores.length :"+ scores.length);
	
//	int b0 = 5;
//	int b1 = 15;
//	int b2 = 55;
//	
//	int[] bs0 = new int[3];
//	bs0[0] = b0;
//	bs0[1] = b1;
//	bs0[2] = b2;
//	
//	int[] bs1 = new int[3];
//	bs1[0] = b0+1;
//	bs1[1] = b1+1;
//	bs1[2] = b2+1;
//	
//	int[] [] bs = new int[10][3];
//	bs[0] = bs0;
//	bs[1] = bs1;
//		
//		
    
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}