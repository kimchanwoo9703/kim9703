package quiz;

import java.util.Random;
import java.util.Scanner;

public class Game {

	
	String name;
    int level;
    String job;
    int damage;
    int stat;
    int f;
    String at;  
    String weapon;    

    
    Game(String name, int level, String job, int stat, int fatigue, String attribute, String weapon) {
        this.name = name;
        this.level = level;
        this.job = job;
        this.stat = stat;
        this.f = fatigue;
        this.at = attribute;
        this.weapon = weapon;

        
        Random rand = new Random();
        this.damage = rand.nextInt(99999*999999) + 1; 
    }

    
    void printInfo() {
        System.out.println("===== 캐릭터 정보 =====");
        System.out.println("캐릭터명: " + name);
        System.out.println("레벨: " + level);
        System.out.println("직업: " + job);
        System.out.println("스텟: " + stat);
        System.out.println("데미지: " + damage);
        System.out.println("피로도: " + f + " / 156");
        System.out.println("속성: " + at);
        System.out.println("무기: " + weapon);

        if (f == 0) {
            System.out.println(" 피로도가 0입니다.");
        }
        System.out.println("=======================");
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	







