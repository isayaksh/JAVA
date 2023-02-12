package chapter_04;

public class _10_Break {
    public static void main(String[] args) {
        // break

        int max = 8;
        for (int i = 1; i < 20; i++) {
            System.out.println(i+"번째 손님 주문하신 치킨 나왔습니다.");
            if (i == max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");

        System.out.println();
        int index = 0;
        while (index++ < 20){
            System.out.println(index+"번째 손님 주문하신 치킨 나왔습니다.");
            if (index == max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");
    }
}
