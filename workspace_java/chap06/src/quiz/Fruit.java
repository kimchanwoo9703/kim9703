package quiz;

import java.util.Random;

public class Fruit {
    String storeName;
    String[] name;
    int[] money;

    	Fruit(String storeName) {
        this.storeName = storeName;
        name = new String[] {"샤인머스켓", "수박", "두리안", "망고"};
        money = new int[] {10000, 12000, 15000, 8500000};
    }

   	    void printAllFruits() {
        System.out.println(storeName + " 판매 과일:");
        for (int i = 0; i < name.length; i++)
            System.out.println(name[i] + ": " + money[i]);
    }

        int getFruitCount() {
        return name.length;
    }

   

    	boolean delivery(String a, String name, int count) {
        boolean success = new Random().nextInt(100) < 15;
        if (success)
            System.out.println(a + "에 " + name + " " + count + "주문 완료");
        else
            System.out.println("주문 실패");
        return success;
    }
}