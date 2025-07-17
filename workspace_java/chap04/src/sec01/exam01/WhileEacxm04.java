package sec01.exam01;

import java.util.Scanner;

public class WhileEacxm04 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);	
	int menu;
	
	do {
	    System.out.println("메인 메뉴를 고르세요");
	    System.out.println("1:커피, 2:차, 0:종료");
	
	    menu = scan.nextInt();
	
    if(menu == 1) {
        System.out.println("커피 종류를 고르세요:");
        System.out.println("1: 아메리카노, 2: 카페라떼, 3: 자바칩 프라푸치노");
	
    int coffeeChoice = scan.nextInt();

    switch(coffeeChoice) {
        case 1:
            System.out.println("아메리카노 드릴께요");
            break;
        case 2:
            System.out.println("카페라떼 드릴께요");
            break;
        case 3:
            System.out.println("자바칩 프라푸치노 드릴께요");
            break;
        default:
            System.out.println("커피 종류를 확인하세요");
    }
	
    	}else if(menu == 2) {
	        System.out.println("차 종류를 고르세요:");
	        System.out.println("1: 녹차, 2: 홍차, 3: 유자차");
	
        int teaChoice = scan.nextInt();
	
    switch(teaChoice) {
        case 1:
            System.out.println("녹차 드릴께요");
            break;
        case 2:
            System.out.println("홍차 드릴께요");
            break;
        case 3:
            System.out.println("유자차 드릴께요");
            break;
        default:
            System.out.println("차 종류를 확인하세요");
    }
	
	    } else if(menu == 0) {
	        System.out.println("주문을 종료합니다. 다음에 뵈요");
	    } else {
	        System.out.println("메뉴를 확인하세요");
        }
	
        } while(menu != 0);
	
        scan.close();
    }
}



		



    

		
		
		
		

