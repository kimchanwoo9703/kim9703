package quiz;

public class FruitExam {

    public static void main(String[] args) {

        Fruit store = new Fruit("찬우네집"); 

        store.printAllFruits();  

        System.out.println("과일 종류 수: " + store.getFruitCount());

        store.delivery("휴면교육센타", "수박", 10500);
    }
}