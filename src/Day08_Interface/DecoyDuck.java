package Day08_Interface;

import java.awt.*;

public class DecoyDuck extends Duck {


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
}