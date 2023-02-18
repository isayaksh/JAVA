package chapter_09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _Quiz_09 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("유재석", "파이썬"));
        list.add(new Student("박명수", "자바"));
        list.add(new Student("김종국", "자바"));
        list.add(new Student("조세호", "C"));
        list.add(new Student("서장훈", "파이썬"));

        Iterator<Student> it = list.iterator();
        while (it.hasNext()){
            if(!it.next().match("자바")){
                it.remove();
            }
        }

        System.out.println("자바 자격증을 보유한 학생");
        System.out.println("-------------------");
        it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next().name);
        }


    }
}

class Student {
    public String name;
    public String certificate;

    public Student(String name, String certificate) {
        this.name = name;
        this.certificate = certificate;
    }

    public boolean match(String certificate){
        return this.certificate.equals(certificate);
    }
}
