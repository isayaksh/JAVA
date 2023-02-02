package chapter_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2
        System.out.println(5 / 2); // 2 정수간의 연산의 결과는 정수로 변환
        System.out.println(2 / 4); // 0
        System.out.println(4 % 3); // 1 나머지 연산

        // 우선 순위 연산
        System.out.println(2 + 2 * 2); // 6
        System.out.println((2 + 2) * 2); // 8
        System.out.println(2 + (2 * 2)); // 6

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println("c = " + c); // 30
        c = a - b;
        System.out.println("c = " + c); // 10
        c = a * b;
        System.out.println("c = " + c); // 200
        c = a / b;
        System.out.println("c = " + c); // 2
        c = a % b;
        System.out.println("c = " + c); // 0

        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println("val = " + val); // 10
        System.out.println("val++ = " + val++); // 10
        System.out.println("val = " + val); // 11
        System.out.println("++val = " + ++val); // 12
        System.out.println("val = " + val); // 12

        val = 10;
        System.out.println("val = " + val); // 10
        System.out.println("val-- = " + val--); // 10
        System.out.println("val = " + val); // 9
        System.out.println("--val = " + --val); // 8
        System.out.println("val = " + val); // 8

        // 은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); // 대기인원 : 0
        System.out.println("대기 인원 : " + waiting++); // 대기인원 : 1
        System.out.println("대기 인원 : " + waiting++); // 대기인원 : 2
        System.out.println("총 대기 인원 : " + waiting); // 총 대기 인원 : 3


    }
}
