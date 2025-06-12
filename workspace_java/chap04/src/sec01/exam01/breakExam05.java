package sec01.exam01;

import java.util.Scanner;

public class breakExam05 {

	public static void main(String[] args) {

		
//		System.out.println("GAME START");
//		int count = 0;
//		while(true) {
//			int num = (int) (Math.random()*6) +1;
//			System.out.println("주사위 :" + num );
//		
//			if(num==6) {
//				break;
//			}
//			count++;
//		}
//		
//		System.out.println("게임 종료 : 총 :" + count);
	
//		for(int i=1; i<10; i++) {
//			System.out.println(i);
//			if(i>=5) {  // 혹시 모르니  == 대신 >=
//				break;
//			}
//		}
//				
//		for (int i=0; i<5; i++) {
//			System.out.println("i: "+ i);
//			
//			for (int j=0; j<20; j++) {
//				System.out.println("j: "+ j);
//				if(j >=2) {
//					System.out.println("break");
//					break;
//				
//				}
//			}
//		}
		
//		한명당 주사위 3번씩던지기
//		for(int i =1; i<=5; i++) {
//			for(int j=1; j<=3; j++) {
//			int num2 = (int) (Math.random()*6) +1;
//				System.out.println("주사위 :" + num2 );
//			
//      만약 6이 나오면 전체 게임종료, 다음사람으로 넘어감
//				if(num2==6) {
//					break;
//				}
//			}
//		}
				
//		한명이라도 6이 나오면 전체 게임종료
		
//		boolean isStop = false;
//		for(int i =1; i<=5; i++) {
//			for(int j=1; j<=3; j++) {
//			int num2 = (int) (Math.random()*6) +1;
//				System.out.println("주사위 :" + num2 );
//			
//				if(num2==6) {
//					isStop = true;
//					break;
//				}
//			}
//			if(isStop) {
//				break;
//		}
//	  }
/////////////////////continue////////////////
//		for(int i=1; i<=10; i++) {
//			if(i % 2 ==0) {          //짝수만 출력하라
//				System.out.println(i);
//			}
//		}
//		
//		for(int i=1; i<=10; i++) {
//			if(i % 2 !=0) {    /// 홀수일때는 건너 뛰어라
//				continue;
//			}
//			System.out.println(i);
//		}
		
		 // 문제 1번
//		Scanner scanner = new Scanner(System.in);
//        int num;
//
//        while (true) {
//            System.out.println("숫자 입력 (0 입력 시 종료):");
//            num = scanner.nextInt();
//
//            if (num == 0) {
//                System.out.println("종료");
//                break;
//            }
//
//            if (num == -3) {
//                System.out.println(num + " 음수");
//            } else {
//                System.out.println(num + " 양수");
//            }
//        }
//
//        scanner.close();
	
//        1번풀이
        
        
        
        
		
		// 문제 2번
        
// 
//			Scanner scanner = new Scanner(System.in);
//		    int mon;
//		
//		    System.out.print("월 입력 (1~12): ");
//		    mon = scanner.nextInt();
//		    
//		
//		    if (mon >= 3 && mon <= 5) {
//		        System.out.println("봄");
//		    } else if (mon >= 6 && mon <= 8) {
//		        System.out.println("여름");
//		    } else if (mon >= 9 && mon <= 11) {
//		        System.out.println("가을");
//		    } else if (mon == 12 || mon == 1 || mon == 2) {
//		        System.out.println("겨울");
//		    } else {
//		        System.out.println("잘못된 입력입니다.");
//		    }
//		
//		    scanner.close();
	
		
		    // 문제 3번
		
        
        
        
        
        
        
        
        
        
        
		    //문제 4444444444444444444444
//		Scanner scan = new Scanner(System.in);
//		int menu = -1;
//		while (menu !=0) {
//			
//			System.out.println(" ---------------------------------------");
//			System.out.println(": 1:예금 |, 2:출금 |, 3:잔고 |, 4:종료 :");
//			System.out.println(" ---------------------------------------");
//			menu = scan.nextInt();
//			
//		    if(menu ==1) {
//	    	System.out.println("예금액>10000");
//	    } else if (menu ==2) {
//	    	System.out.println("출금액>2000 ");
//	    } else if (menu == 3) {
//	      	System.out.println("잔고>8000 ");
//	    } else if (menu == 4) {
//	    	System.out.println("종료합니다");
//	    	break;
//	    } else {
//	    	System.out.println("확인하세용");
//	    }
//		    
//		}
		

//		  Scanner scanner = new Scanner(System.in);
//	        int balance = 0;
//
//	        while (true) {
//	        	System.out.println(" ---------------------------------------");
//				System.out.println(": 1:예금 |, 2:출금 |, 3:잔고 |, 4:종료 :");
//				System.out.println(" ---------------------------------------");
//
//	            int choice = scanner.nextInt();
//
//	            switch (choice) {
//	                case 1:
//	                    System.out.print("입금 금액: ");
//	                    int deposit = scanner.nextInt();
//	                    if (deposit < 0) {
//	                        System.out.println(" 0원이상 ");
//	                    } else {
//	                        balance += deposit;
//	                        System.out.println("입금완료  현재 잔액: " + balance);
//	                    }
//	                    break;
//
//	                case 2:
//	                    System.out.print("출금액 입력: ");
//	                    int withdraw = scanner.nextInt();
//	                    if (withdraw < 0) {
//	                        System.out.println("출금액은 0 이상이어야 합니다.");
//	                    } else if (withdraw > balance) {
//	                        System.out.println("잔고 부족! 현재 잔고: " + balance);
//	                    } else {
//	                        balance -= withdraw;
//	                        System.out.println("출금완료 현재 잔고: " + balance);
//	                    }
//	                    break;
//
//	                case 3:
//	                    System.out.println("현재 잔고: " + balance);
//	                    break;
//
//	                case 4:
//	                    System.out.println("프로그램을 종료합니다.");
//	                    scanner.close();
//	                    return;
//
//	                default:
//	                    System.out.println("1~4 사이의 번호를 입력하세요.");
//	            }
//	        }
	    	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
  }
