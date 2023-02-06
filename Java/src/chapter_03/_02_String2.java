package chapter_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        
        // 문자열 변환
        System.out.println("s.replace(\" and\", \", \") = " + s.replace(" and", ",")); // "and" 를 ","로 변환
        System.out.println("s.substring(7) = " + s.substring(7));
        System.out.println("s.substring(s.indexOf(\"Java\")) = " + s.substring(s.indexOf("Java")));
        System.out.println("s.substring(s.indexOf(\"Java\"), s.indexOf(\".\")) = " + s.substring(s.indexOf("Java"), s.indexOf(".")));

        // 공백 제거
        s = "              I love Java.              ";
        System.out.println("s = " + s);
        System.out.println("s.trim() = " + s.trim());

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println("s1+s2 = " + s1 + s2);
        System.out.println("s1 + \", \" + s2 = " + s1 + ", " + s2);
        System.out.println("s1.concat(\",\").concat(s2) = " + s1.concat(", ").concat(s2));
    }
}