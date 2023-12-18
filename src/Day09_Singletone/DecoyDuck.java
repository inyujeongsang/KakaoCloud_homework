package Day09_Singletone;

import java.awt.*;

public class DecoyDuck extends Duck {
    public DecoyDuck(){
        super();
    }
    public DecoyDuck(int x, int y){
        super(x,y);
    }

    @Override
    public void display(Graphics g){
        g.setColor(Color.GREEN);
        g.fillOval(x,y,DUCK_SIZE,DUCK_SIZE);
        swim(g);

    }

}
