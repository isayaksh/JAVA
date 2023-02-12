package chapter_04;

public class _Quiz_04 {
    public static void main(String[] args) {

        final int MAX = 30000;
        final int price = 4000;

        int hour = 10;
        boolean isSmallCar = false;
        boolean withDisabledPerson = true;

        int totalPrice = price * hour < MAX ? price * hour : MAX;
        if (isSmallCar || withDisabledPerson){
            totalPrice /= 2;
        }
        System.out.println("최종 요금은 " + totalPrice +"원 입니다.");

    }
}
