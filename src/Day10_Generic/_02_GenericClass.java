package Day10_Generic;

import Day10_Generic.coffee.*;
import Day10_Generic.user.User;
import Day10_Generic.user.VIPUser;

public class _02_GenericClass {
    public static void main(String[] args) {

        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("강호동"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("서장훈"));
        c8.ready();

        orderCoffee("우루루파도","카페라떼");
    }


    public static <T,V> void orderCoffee(T name,V coffee){
        System.out.println(coffee+" 준비 완료 : " + name);
    }
}
