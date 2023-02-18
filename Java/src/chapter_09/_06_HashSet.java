package chapter_09;

import java.util.HashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // 원소 추가
        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료");
        set.add("소금");
        set.add("후추");
        set.add("삼겹살");
        set.add("깻잎");
        set.add("상추");
        set.add("삼겹살");

        System.out.println("총 구매 상품 수 : " + set.size());
        for (String s : set) { System.out.print(s + " "); }
        System.out.println("\n=============================");

        if (set.contains("삼겹살")){ System.out.println("삼겹살 사러 출발!"); }
        System.out.println("=============================");

        System.out.println("총 구매 상품 수 (삼겹살 구매 전) : " + set.size());
        set.remove("삼겹살");
        System.out.println("총 구매 상품 수 (삼겹살 구매 후) : " + set.size());
        System.out.println("=============================");

        // 전체 삭제
        set.clear();
        if (set.isEmpty()){
            System.out.println("남은 구매 상품 수 : " + set.size());
            System.out.println("집으로 출발");
        }
        System.out.println("=============================");

        //       HashSet<> : 중복 허용X, 순서 보장X
        // LinkedHashSet<> : 중복 허용X, 순서 보장O
    }
}
