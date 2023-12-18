package Day09_Singletone;

import java.awt.*;

public class MallardDuck extends Duck implements Flyable, Quackable{

    public MallardDuck(){
        super();
    }
    public MallardDuck(int x, int y){
        super(x,y);
    }

    @Override
    public void display(Graphics g){
        g.setColor(Color.BLUE);
        g.fillOval(x,y,DUCK_SIZE,DUCK_SIZE);
        swim(g);
        fly(g);
        quack(g);
    }

    @Override
    public void fly(Graphics g){
        g.setColor(Color.BLUE);
        g.drawString("날다",x-25,y+DUCK_SIZE);
    }

    @Override
    public void quack(Graphics g){
        g.setColor(Color.BLUE);
        g.drawString("꽥꽥",x+DUCK_SIZE,y-1);
    }
}
