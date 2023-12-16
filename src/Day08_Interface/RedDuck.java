package Day08_Interface;

import java.awt.*;

public class RedDuck extends Duck implements Flyable,Quackable{

    public RedDuck(int x, int y,int size,int index) {//생성자
        super(x,y,size,index);
    }
    @Override
    public void display(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x,y,size,size);
        g.drawString(String.valueOf(index)+"번째",x,y);
        swim(g);
        quack(g);
        fly(g);

    }

    @Override
    public void fly(Graphics g) {
        g.drawString("날다",x-30,y+50);
    }

    @Override
    public void quack(Graphics g) {
        g.drawString("꽥꽥",x+60,y+15);
    }
}