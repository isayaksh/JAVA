package chapter_09;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        // 이터레이터
        List<String> list = new ArrayList<>();

        list.add("유재석");
        list.add("(알 수 없음)");
        list.add("김종국");
        list.add("(알 수 없음)");
        list.add("강호동");
        list.add("(알 수 없음)");
        list.add("박명수");
        list.add("(알 수 없음)");
        list.add("조세호");

        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println("\n==============================");

        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println("\n==============================");

        it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            if (s.equals("(알 수 없음)")){
                it.remove();
            }
        }

        it = list.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println("\n==============================");

        HashSet<String> set = new HashSet<>();
        set.add("유재석");
        set.add("박명수");
        Iterator<String> it1 = set.iterator();

        while (it1.hasNext()){
            System.out.print(it1.next() + " ");
        }
        System.out.println("\n==============================");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("유재석", 15);
        map.put("박명수", 10);

        // map.iterator();
        Iterator<String> it2 = map.keySet().iterator();
        while (it2.hasNext()){
            System.out.print(it2.next() + " ");
        }
        System.out.println("\n==============================");

        Iterator<Integer> it3 = map.values().iterator();
        while (it3.hasNext()){
            System.out.print(it3.next() + " ");
        }
        System.out.println("\n==============================");

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\n==============================");

    }
}
