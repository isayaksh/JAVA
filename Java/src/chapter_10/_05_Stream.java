package chapter_10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        // 스트림 : 데이터가 흐른다!

        // 스트림 생성
        int[] scores = {100, 95, 90, 85, 80};
        IntStream scoreStream = Arrays.stream(scores);

        String[] langs = {"python", "java", "javascript", "c", "c++", "c#"};
        Stream<String> langStream = Arrays.stream(langs);

        List<String> langList = Arrays.asList("python", "java", "javascript", "C", "C++", "C#");
        Stream<String> langListStream = langList.stream();

        Stream<String> langListOfStream = Stream.of("python", "java", "javascript", "C", "C++", "C#");

        // 스트림 사용
        // 중간 연산(intermediate operation) : filter, map, sorted, distinct, skip, ....
        // 최종 연산(terminal operation) : count, min, max, sum, forEach, anyMatch, allMatch, ...
        Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));
        System.out.println("==========================");

        long count = Arrays.stream(scores).filter(x -> x >= 90).count();
        System.out.println("count = " + count);
        System.out.println("==========================");

        int sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
        System.out.println("sum = " + sum);
        System.out.println("==========================");


        Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(System.out::println);
        System.out.println("==========================");

        Arrays.stream(langs).filter(l -> l.startsWith("c")).forEach(System.out::println);
        System.out.println("==========================");

        Arrays.stream(langs).filter(l -> l.startsWith("java")).forEach(System.out::println);
        System.out.println("==========================");

        Arrays.stream(langs).filter(l -> l.length() <= 4).sorted().forEach(System.out::println);
        System.out.println("==========================");

        Arrays.stream(langs).filter(l -> l.length() <= 4 && l.contains("c")).sorted().forEach(System.out::println);
        System.out.println("==========================");

        boolean b1 = Arrays.stream(langs).anyMatch(l -> l.length() <= 4 && l.contains("c"));
        System.out.println("b1 = " + b1);
        System.out.println("==========================");

        boolean b2 = Arrays.stream(langs).filter(l -> l.length() <= 3).allMatch(l -> l.contains("c"));
        System.out.println("b2 = " + b2);
        System.out.println("==========================");

        Arrays.stream(langs)
                .filter(l -> l.length() <= 4)
                .filter(l -> l.contains("c"))
                .map(l -> l+" (어려워요)")
                .forEach(System.out::println);
        System.out.println("==========================");

        Arrays.stream(langs)
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("==========================");

        List<String> upperC = Arrays.stream(langs)
                .filter(l -> l.contains("c"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        upperC.stream().forEach(System.out::println);
    }
}
