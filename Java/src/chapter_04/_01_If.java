package chapter_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 if
        int hour = 15;
        if(hour < 14){
            System.out.println("ice americano +1");
            System.out.println("샷 추가");
        }
        System.out.println("커피 주문 완료 #1");


        hour = 10;
        boolean morningCoffee = false;

        if(hour < 14 && !morningCoffee){
            System.out.println("ice americano +1");
            System.out.println("샷 추가");
        }
        System.out.println("커피 주문 완료 #2");

        hour = 15;
        morningCoffee = true;
        if(hour >= 14 || morningCoffee){
            System.out.println("디카페인 커피 +1");
        }
        System.out.println("커피 주문 완료 #3");

    }
}
