package quiz;

import java.util.Scanner;

public class CalcExam {

	public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("첫번째 수 입력: ");
    int num1 = s.nextInt();

    System.out.print("연산자 입력 (+, -, *, /): ");
    char sn = s.next().charAt(0);

    System.out.print("두번째 수 입력: ");
    int num2 = s.nextInt();

    int result = 0;

    if (sn == '+') result = num1 + num2;
    else if (sn == '-') result = num1 - num2;
    else if (sn == '*') result = num1 * num2;
    else if (sn == '/') result = num1 / num2;

    System.out.println(num1 + sn + num2 + " = " + result);

    s.close();
    }
	
}