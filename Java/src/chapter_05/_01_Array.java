package chapter_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간

        // 배열 선언 첫 번째 방법
        String[] coffees1 = new String[4];
        coffees1[0] = "아메리카노";
        coffees1[1] = "카페모카";
        coffees1[2] = "라떼";
        coffees1[3] = "카푸치노";

        // 배열 선언 두 번째 방법
        String[] coffees2 = new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"};

        // 배열 선언 세 번째 방법
        String[] coffees3 = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        for (String coffee : coffees3) {
            System.out.println(coffee + " 하나");
        }
        System.out.println("주세요.");
    }
}
