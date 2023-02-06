package chapter_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println("s = " + s);

        // 문자열의 길이
        System.out.println("s.length() = " + s.length());

        // 대소문자 변환
        System.out.println("s.toUpperCase() = " + s.toUpperCase());
        System.out.println("s.toLowerCase() = " + s.toLowerCase());

        // 포함관계
        System.out.println("s.contains(\"Java\") = " + s.contains("Java"));
        System.out.println("s.contains(\"C#\") = " + s.contains("C#"));
        System.out.println("s.indexOf() = " + s.indexOf("Java")); // 7
        System.out.println("s.indexOf(\"C#\") = " + s.indexOf("C#")); // -1
        System.out.println("s.indexOf(\"and\") = " + s.indexOf("and")); // 처음 일치하는 위치 정보
        System.out.println("s.lastIndexOf(\"and\") = " + s.lastIndexOf("and")); // 마지막 일치하는 위치 정보
        System.out.println("s.startsWith(\"I like\") = " + s.startsWith("I like")); // 인자로 시작하면 true
        System.out.println("s.endsWith(\".\") = " + s.endsWith(".")); // 인자로 끝나면 true

    }
}
