package Day09_Singletone;

import java.awt.*;

public class RubberDuck extends Duck implements Quackable{
    public RubberDuck(){
        super();
    }
    public RubberDuck(int x, int y){
        super(x,y);
    }

    @Override
    public void display(Graphics g){
        g.setColor(Color.YELLOW);
        g.fillOval(x,y,DUCK_SIZE,DUCK_SIZE);
        swim(g);
        quack(g);
    }

    @Override
    public void quack(Graphics g){
        g.setColor(Color.YELLOW);
        g.drawString("삑삑",x+DUCK_SIZE,y-1);
    }
}
