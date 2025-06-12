package sec01.exam01;

import java.util.Scanner;

public class ArrayQuizExam {

	public static void main(String[] args) {

		
		
//		문제0
//		배열 깊은 복사 : {1,2,3} ->{,1,2,3}	
		
//		int[] arr0 = {1,2,3}; //깊은복사
//		int[] arr01 = arr0;  얕은복사
//		int[] arr1 = {1,2,3};
//		int[] arr01 = new int [ arr0.length ];
//		for(int i =0; i < arr0.length; i++) {
//			arr01[i]  = arr0[i];
//		}
//		System.out.println("문제 0번 **********");
//		for(int i =0; i < arr0.length; i++) {
//			System.out.println(arr01[i]);
//		}
//		문제1
//		배열 뒤집기 : {1,2,3} ->{,1,2,3}
		
//		System.out.println("문제 1번 **********");
//		arr01 = new int [ arr0.length ];
//		arr01 [0] = arr0 [2][ arr0.length -1 ];
//		arr01 [1] = arr0 [1][ arr0.length -2];
//		arr01 [2] = arr0 [0];
//		for (int i=0; i < arr01.length; i++) {
//			arr01[i] = arr0[arr01.length]
//		}
		
//		문제2	홀수의갯수
//		여기서 = {3,4,7,5,1,9,4}

		
//        int[] nums = {3,4,7,5,1,9,4};
//        int count = 0;
//        for (int n : nums) {
//        	if (n % 2 !=0) count++;
//        }
//        System.out.println(count);		

//		문제3	4보다 큰수		
//		여기서 = {3,4,7,5,1,9,4}
        
//        int[] nums1 = {3,4,7,5,1,9,4};
//        int count1 = 0;
//        for (int n : nums1) {
//        	if (n>4) count1++;
//        }
//        System.out.println(count1);	
	
//		문제4	제일큰수
//		여기서 = {3,4,7,5,1,9,4}	
        
//        int[] nums2 = {3,4,7,5,1,9,4};
//        max = Integer.MIN_VALUE; 가장 작은값
//        int max = nums[0];
//        for (int n : nums2) {
//        	if (n > max) max= n; 
//        }
//        System.out.println(max);	
        
//      문제5	2번째로 큰수
//      두번째 큰수 라는건 첫번째를 제외하고 가장큰수
        
//        int max2 = Integer.MIN_VALUE;
//        int max4 = nums[0];
//        for (int n : nums4) {
//        	if (n > max4) max4= n; 
//        }
//        System.out.println(max4);
//        
//        문제6 오른쪽으로 한칸밀기 (왼쪽은 0으로 채우기)
//        예시 {3,4,7,5,1,9,4} > {0,3,4,7,5,1,9,4}
        
//        int[] array2 = new int [array.length +1)];
//        array2[0] = 0;
//        for(int i=1; i<array2.length; i++) {
//        	array2[i] = array[i-1];
//        }
//        문제 7 오른쪽이 이동하는데 맨끝에 값을 맨처음으로 보내기
//        같은 크기 배열을 일단 만들고 원본의 맨마지막 값을 사본의 맨처음에 넣기
//        나머지는 사본의 두번째부터 복사한다
    	
//        int[] array7 = new int[array.length];
//        array7[0] = array [array.length -1];
//        for (int i =1; i<array7.length; i++) {
//        	System.out.println(array7[i]);
//        }
//        
        
//        문제 8 -1 한자리 숫자 랜덤
         
//	String pwd = "";
//    for (int i = 0; i < 8; i++) {
//        int ran = (int)(Math.random() * 10); 
//        pwd += ran;
//    }
//    System.out.println(pwd);
		  
			
//          문제 8 -2
//    String pwd = "";
//    for (int i = 0; i < 8; i++) {
//        char so = (char)('a' + (int)(Math.random() * 26));
//        pwd += so;
//    }
//    System.out.println(pwd);
		
//		   문제 8-3
    
//    char[] pwd = new char[8];
//    pwd[0] = (char)('A' + (int)(Math.random() * 26));
//    pwd[1] = (char)('a' + (int)(Math.random() * 26)); 
//    pwd[2] = (char)('0' + (int)(Math.random() * 10)); 
//    pwd[3] = (char)('0' + (int)(Math.random() * 10)); 
//
//    String all = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
//    for (int i = 4; i < 8; i++) {
//        pwd[i] = all.charAt((int)(Math.random() * all.length()));
//	} for (int i = 0; i < 8; i++) 
//    	System.out.print(pwd[i]);	

        
    
//    		문제 9
//        자리가 10개 있는 소극장의 예약 시스템
//        자리 번호는 1~10번까지 번호의 자리가 있습니다.
//        메뉴 : "1.예약 2.모든 좌석 현황 3.잔여좌석 0.종료"
//        만약1 : 예약이 가능하다면 "n번 자리 예약 했습니다"
//        만약2 : 예약이 불가능하다면 "이미 예약 되어 있습니다"
        
//        int[] seat = new int[10]; //0: 예약가능, 1: 예약완료
//        예를 들어 3번째 자리에 예약을했다 =
//        seat[2]= 1;
//        System.out.println("1.예약 2.모든 좌석 현황 3.잔여좌석 0.종료");
//        Scanner scan = new Scanner(System.in);
//        int booking scan.nextInt();
//        while(booking != 0) 
//        do {
//        	System.out.println("1.예약 2.모든 좌석 현황 3.잔여좌석 0.종료");
//            Scanner scan = new Scanner(System.in);
//            int booking scan.nextInt();
//        }while()
	
	
    
    
    
//    		문제 10 로또 추첨기
		int[] lotto = new int[6];
        int count = 0;
        while (count < 6) {
        	int num = (int)(Math.random() * 45) + 1; 
        	boolean num1 = false;
        	for (int i = 0; i < count; i++) {
    		if (lotto[i] == num) {
			num1 = true;
    		}   break;
    	}
        		if (!num1) {
        		lotto[count] = num;
        	}	count++;
        }   System.out.print("로또 : ");
        		for (int i = 0; i < 6; i++) {
        	System.out.print(lotto[i] + " ");
        }   System.out.println();
        
        

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
