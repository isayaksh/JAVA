package chapter_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "상현";
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "정대만";

        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789F;
        System.out.println("d = " + d); // d = 3.14123456789
        System.out.println("f = " + f); // f = 3.1412346


        // int i = 1000000000000;
        long l = 1000000000000L;
        System.out.println("l = " + l);
        l = 1000_000_000_000L;
        System.out.println("l = " + l);

        // int, long, float, double, char, String, boolean

    }
}
