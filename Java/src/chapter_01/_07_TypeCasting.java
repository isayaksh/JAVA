package chapter_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형 변환 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        // int to float, double
        int score = 93;
        System.out.println("score = " + score); // 93
        System.out.println("(float)score = " + (float) score); // 93.0
        System.out.println("(double)score = " + (double) score); // 93.0
        System.out.println();

        // float. double to int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println("score_f = " + score_f);
        System.out.println("(int) score_f = " + (int) score_f); // 93
        System.out.println();
        System.out.println("score_d = " + score_d);
        System.out.println("(int)score_d = " + (int) score_d);
        System.out.println();

        // 정수 + 실수 연산
        score = 93 + (int) 98.8; // 93 + 98
        System.out.println("score = " + score); // 191

        score_d = (double) 93 + 98.8; // 93.0 + 98.8
        System.out.println("score_d = " + score_d); // 191.8

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 191 → 191.0
        // int → long → float → double 자동 형변환
        System.out.println("convertedScoreDouble = " + convertedScoreDouble);

        int convertedScoreInt = (int) score_d; // 191.8 → 191
        System.out.println("convertedScoreInt = " + convertedScoreInt);
        // double → float → long → int 수동 형변환
        System.out.println();
        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        System.out.println("s1 = " + s1);

        s1 = Integer.toString(92);
        System.out.println("s1 = " + s1);
        System.out.println();

        String s2 = String.valueOf(98.8);
        System.out.println("s2 = " + s2);
        s2 = Double.toString(97.7);
        System.out.println("s2 = " + s2);
        System.out.println();

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println("i = " + i);

        double d = Double.parseDouble("98.8");
        System.out.println("d = " + d);

//        int error = Integer.parseInt("JAVA"); // 올바른 숫자 문자열이 입력되어야 한다.
//        System.out.println("error = " + error);

    }
}
