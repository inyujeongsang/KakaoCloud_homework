package Day10_Generic.coffee;

import Day10_Generic.user.User;

public class CoffeeByUser <T extends User>{//User클래스만 T에 들어올 수 있다.

    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready(){
        System.out.println("커피 준비 완료 : "+user.name);
        user.addPoint();
    }
}
