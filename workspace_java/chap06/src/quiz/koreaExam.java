package quiz;
import java.util.Scanner;


public class koreaExam {

	public static void main(String[] args) {

		Korea k = new Korea();
        Scanner s = new Scanner(System.in);

        System.out.print("1. En-Ko, 2. Ko-En: ");
        int menu = s.nextInt();
        s.nextLine(); 
        System.out.print("단어: ");
        String word = s.nextLine();

        if (menu != 1) {
            System.out.println("뜻: " + k.en2ko(word)); 
        } else {
            System.out.println("뜻: " + k.ko2en(word));  

        s.close();
    }
}
}