package chapter_09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트(Linked List)
        LinkedList<String> list = new LinkedList<>();

        // 데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 데이터 조회
        System.out.print(list.get(0) + " ");
        System.out.print(list.get(1) + " ");
        System.out.print(list.getFirst() + " ");
        System.out.println(list.getLast());
        System.out.println("===========================");

        // 데이터 추가
        list.addFirst("서장훈");
        list.addLast("김희철");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println("\n===========================");

        list.add(1,"김영철");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println("\n===========================");

        // 삭제
        System.out.println("남은 학생 수 (제외 전) : " + list.size());
        list.removeLast();
        System.out.println("남은 학생 수 (제외 후) : " + list.size());
        System.out.println("===========================");

        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
        list.removeFirst();
        list.removeLast();
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println("\n===========================");

        // 변경
        list.set(0,"이수근");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println("\n===========================");

        // 확인
        String name = "김종국";
        if(list.contains(name)){
            System.out.println("수강 신청 성공!");
        } else {
            System.out.println("수강 신청 실패");
        }
        System.out.println("===========================");

        // 전체 삭제
        list.clear();
        if (list.isEmpty()){
            System.out.println("학생 수 : " + list.size());
            System.out.println("리스트가 비었습니다.");
        }
        System.out.println("===========================");

        // 새로운 학기
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");
        Collections.sort(list);
        for (String s : list) {
            System.out.print(s + " ");
        }

    }
}
