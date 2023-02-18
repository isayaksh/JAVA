package chapter_09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크 (List, Set, Map)
        ArrayList<String> list = new ArrayList<>();

        // 데이터 추가
        list.add("신동엽");
        list.add("정준하");
        list.add("강호동");
        list.add("이수근");
        list.add("민경훈");

        // 데이터 조회 (인덱스)
        System.out.println("0 : " + list.get(0));
        System.out.println("1 : " + list.get(1));
        System.out.println("2 : " + list.get(2));
        System.out.println("3 : " + list.get(3));
        System.out.println("4 : " + list.get(4));
        System.out.println("======================");

        // 데이터 삭제
        System.out.println("신청 학생 수 : " + list.size());
        list.remove("정준하");
        System.out.println("신청 학생 수 : " + list.size());
        System.out.println("3 : " + list.get(3));
        System.out.println("======================");

        System.out.println("남은 학생 수(제외 전) : " + list.size());
        list.remove(list.size()-1);
        System.out.println("남은 학생 수(제외 후) : " + list.size());
        System.out.println("======================");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("======================");

        // 변경 (수강권 양도)
        list.set(0, "유재석");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("======================");

        // 확인
        if(list.contains("강호동")){
            System.out.println("강호동님은 " + (list.indexOf("강호동") + 1) + "등으로 포함되어 있습니다.");
        } else {
            System.out.println("강호동님은 포함되어 있지 않습니다.");
        }
        System.out.println("======================");

        // 전체 삭제
        list.clear();
        if(list.isEmpty()){
            System.out.println("학색 수 : " + list.size());
            System.out.println("리스트가 비었습니다.");
        }
        System.out.println("======================");

        // 다음학기 새로운 공부 시작
        list.add("신동엽");
        list.add("정준하");
        list.add("강호동");
        list.add("이수근");
        list.add("민경훈");

        // 정렬
        Collections.sort(list);

        for (String s : list) {
            System.out.print(s + " ");
        }

    }
}
