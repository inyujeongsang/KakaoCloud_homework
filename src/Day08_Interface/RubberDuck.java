package Day08_Interface;

import java.awt.*;

public class RubberDuck extends Duck implements Flyable,Quackable{


    public RubberDuck(int x, int y, int size, int index){
        super(x, y, size, index);
    }
    @Override
    public void display(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(x,y,size,size);
        g.drawString(String.valueOf(index)+"번째",x,y);
        swim(g);
        quack(g);
    }

    @Override
    public void fly(Graphics g) {;}//러버덕은 날지 못함.

    @Override
    public void quack(Graphics g) {
        g.drawString("삑삑",x+60,y+15);
    }
}