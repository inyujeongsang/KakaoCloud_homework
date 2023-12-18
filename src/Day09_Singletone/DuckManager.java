package Day09_Singletone;

import java.awt.*;
import java.util.Random;

public class DuckManager { //싱글톤패턴 구현, makeDucks메서드 추가
    private Duck[] arr = new Duck[20];
    private static DuckManager instance;

    private  DuckManager() {makeDucks();}
    public static DuckManager getInstance() { //접근제어자 public static으로
       if(instance == null){
           synchronized (DuckManager.class){
               if(instance == null){
                   instance = new DuckManager();
               }
           }
       }

       return instance;
    }

    public void makeDucks(){
        Random rnd = new Random();
        int type = 0;
        for(int i = 0; i < arr.length; i++){
            type = rnd.nextInt(4);
            switch (type) {
                case 0:
                    arr[i] = new MallardDuck();
                    break;
                case 1:
                    arr[i] = new RedDuck();
                    break;
                case 2:
                    arr[i] = new RubberDuck();
                    break;
                case 3:
                    arr[i] = new DecoyDuck();
                    break;
                default:
                    arr[i] = new MallardDuck();
            }
        }
    }

    public void displayAllDucks(Graphics g){
        for (Duck d:arr) {
            d.display(g);
        }
    }

    public void swimAllDucks(Graphics g){
        for(Duck d:arr){
            d.swim(g);
        }
    }

    public void flyAllDucks(Graphics g) {
        for(Duck d:arr){
            if(d instanceof Flyable){
                ((Flyable) d).fly(g);
            }
        }
    }

    public void quackAllDucks(Graphics g){
        for(Duck d : arr){
            if(d instanceof Quackable){
                ((Quackable)d).quack(g);
            }
        }
    }
}
