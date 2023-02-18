package chapter_09;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class _07_HashMap {
    public static void main(String[] args) {
        // Map<Key, Value>
        HashMap<String, Integer> map = new HashMap<>();

        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);
        map.put("서장훈", 15);

        System.out.println("총 고객 수 : " + map.size());
        System.out.println("========================");

        System.out.println("유재석님의 포인트 : " + map.get("유재석"));
        System.out.println("박명수님의 포인트 : " + map.get("박명수"));
        System.out.println("========================");

        // 확인
        if (map.containsKey("서장훈")) {
            Integer point = map.get("서장훈");
            map.put("서장훈", ++point);
            System.out.println("서장훈님의 누적 포인트는 : " + map.get("서장훈"));
        } else {
            map.put("서장훈", 1);
            System.out.println("서장훈님 신규 등록 (포인트 1)");
        }
        System.out.println("========================");

        // 삭제
        map.remove("유재석");
        System.out.println(map.get("유재석"));

        // 전체 삭제
        map.clear();
        if (map.isEmpty()){
            System.out.println("남은 고객 수 : " + map.size());
            System.out.println("가게 접자");
        }
        System.out.println("========================");

        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);
        map.put("서장훈", 15);

        for (String s : map.keySet()) {
            System.out.print(s + " ");
        }
        System.out.println("\n========================");

        for (Integer value : map.values()) {
            System.out.print(value + " ");
        }
        System.out.println("\n========================");

        for (String s : map.keySet()) {
            System.out.println("고객 이름 : " + s + ", 포인트 : " + map.get(s));
        }
        System.out.println("========================");
    }
}
