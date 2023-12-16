package Day08_Interface;

import java.awt.*;

public class DecoyDuck extends Duck implements Flyable,Quackable{


    public DecoyDuck(int x, int y,int size, int index) {
        super(x, y, size, index);
    }
    @Override
    public void display(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillOval(x,y,size,size);
        g.drawString(String.valueOf(index)+"번째",x,y);
        swim(g);
    }

    @Override
    public void fly(Graphics g) {//날지못함
        ;
    }

    @Override
    public void quack(Graphics g) {//소리 못냄
        ;
    }
}