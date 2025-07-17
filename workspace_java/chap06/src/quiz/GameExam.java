package quiz;
import java.util.Scanner;
public class GameExam {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Game[] charact = new Game[10];
        charact[0] = new Game("뿴", 115, "넨마스터", 5411, 100, "명속성", "너클");
        charact[1] = new Game("넷마블", 115, "어썰트", 4963, 120, "암속성", "리볼버");
        charact[2] = new Game("다오", 115, "소울브링어", 5396, 90, "암속성", "도");
        charact[3] = new Game("뿡빵삥빵", 115, "트래블러", 4789, 50, "수속성", "장궁");
        charact[4] = new Game("고운말_9545", 115, "크루세이더", 7115, 0, "화속성", "십자가");
        charact[5] = new Game("끪", 115, "넨마스터", 4519, 0, "명속성", "너클");
        charact[6] = new Game("번개찌릿찌릿", 115, "아수라", 4424, 0, "명속성", "도");
        charact[7] = new Game("쀬", 115, "인챈트리스", 6467, 0, "명속성", "스태프");
        charact[8] = new Game("용독붕이", 115, "스트리트파이터", 4115, 0, "암속성", "클로");
        charact[9] = new Game("뛓", 115, "이단심판관", 4038, 0, "화속성", "십자가");

        System.out.print("조회할 캐릭터명을 입력하세요: ");
        String inputName = scanner.nextLine();

        boolean found = false;
        for (Game g : charact) {
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
