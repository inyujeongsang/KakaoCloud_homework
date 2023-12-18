package Day09_Singletone;

import java.awt.*;

public class RedDuck extends Duck implements Flyable,Quackable{
    public RedDuck(){
        super();
    }
    public RedDuck(int x, int y){
        super(x,y);
    }

    @Override
    public void display(Graphics g){
        g.setColor(Color.RED);
        g.fillOval(x,y,DUCK_SIZE,DUCK_SIZE);
        swim(g);
        fly(g);
        quack(g);
    }

    @Override
    public void fly(Graphics g){
        g.setColor(Color.RED);
        g.drawString("날다",x-25,y+DUCK_SIZE);
    }

    @Override
    public void quack(Graphics g){
        g.setColor(Color.RED);
        g.drawString("꽥꽥",x+DUCK_SIZE,y-1);
    }
}
