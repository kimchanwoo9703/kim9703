package quiz;
import java.util.Scanner;
public class GameExam {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Game[] characters = new Game[5];
        characters[0] = new Game("캐릭터1", 1, "직업1", 10, 100, "불", "대검");
        characters[1] = new Game("캐릭터2", 2, "직업2", 20, 120, "물", "활");
        characters[2] = new Game("캐릭터3", 3, "직업3", 30, 90, "빛", "총");
        characters[3] = new Game("캐릭터4", 4, "직업4", 40, 50, "어둠", "마법봉");
        characters[4] = new Game("캐릭터5", 5, "직업5", 50, 0, "바람", "창");

        System.out.print("조회할 캐릭터명을 입력하세요: ");
        String inputName = scanner.nextLine();

        boolean found = false;
        for (Game g : characters) {
            if (g.name.equals(inputName)) {
                g.printInfo();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("캐릭터를 찾을 수 없습니다.");
        }

        scanner.close();
    }
}
