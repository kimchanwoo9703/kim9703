package quiz;

public class Korea {  
    String[] en = {"love", "hate", "devil", "angel"};
    String[] ko = {"사랑", "증오", "악마", "천사"};

    String en2ko(String k) {
        for (int i = 0; i < en.length; i++) {
            if (en[i].equals(k)) return ko[i];
        }
        return "목록에 없어용";
    }

    String ko2en(String k) {
        for (int i = 0; i < ko.length; i++) {
            if (ko[i].equals(k)) return en[i];
        }
        return "목록에 없어용";
    }
}







