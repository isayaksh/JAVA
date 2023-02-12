package chapter_04;

public class _11_Continue {
    public static void main(String[] args) {
        // continue
        int max = 8;
        int sold = 0;
        int noShow = 3;
        for (int i = 1; i < 20; i++) {
            System.out.println(i + "번째 손님 주문하신 치킨나왔습니다.");
            if (i == noShow){
                System.out.println(i + "번째 손님은 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue;
            }
            sold++;
            if (sold == max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");
    }
}
