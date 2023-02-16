package chapter_07;

import java.util.ArrayList;
import java.util.List;

public class _Quiz_07 {
    public static void main(String[] args) {
        Burger[] burgers = new Burger[3];
        burgers[0] = new HamBurger();
        burgers[1] = new CheeseBurger();
        burgers[2] = new ShrimpBurger();

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("--------------------");
        for (Burger burger : burgers) {
            burger.cook();
            System.out.println("--------------------");
        }
        System.out.println("메뉴 준비가 완료되었습니다.");
    }
}

class Burger {
    public String name;

    public Burger(String name) {
        this.name = name;
    }
    public void cook(){
        System.out.println(name + "를 만듭니다");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println("> 양상추");
        System.out.println("+ 패티");
        System.out.println("+ 피클");
    }
}

class HamBurger extends Burger {
    public HamBurger() {
        super("햄버거");
    }

    public void cook(){
        super.cook();
        System.out.println("+ 햄");
    }
}

class CheeseBurger extends Burger {
    public CheeseBurger() {
        super("치즈버거");
    }

    public void cook(){
        super.cook();
        System.out.println("+ 치즈");
    }
}

class ShrimpBurger extends Burger {
    public ShrimpBurger() {
        super("새우버거");
    }

    public void cook(){
        super.cook();
        System.out.println("+ 새우");
    }
}
