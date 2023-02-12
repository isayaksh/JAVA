package chapter_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case
        int ranking = 4;

        switch (ranking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상자가 아님");
        }

        int grade = 1;
        int price = 7000;

        switch (grade){
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
        }
        System.out.println(grade +"등급 제품의 가격은 " + price + "입니다.");

    }
}
