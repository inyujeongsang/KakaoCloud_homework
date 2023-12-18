package Day09_Singletone;

import java.awt.*;
import java.util.*;
public abstract class Duck { //4가지 스타일 Duck의 공통된 스타일을 정의한다.
    protected int x;
    protected int y;
    public static final int DUCK_SIZE = 30;
    public Duck(){
        Random rnd = new Random();
        x = rnd.nextInt(MyFrame.FRAME_WIDTH-100)+50;
        y = rnd.nextInt(MyFrame.FRAME_HEIGHT-140)+70;
    }

    public Duck(int x, int y){
        this.x = x;
        this.y = y;
    }

    public abstract void display(Graphics g);

    public final void swim(Graphics g){
        g.drawString("수영",x-20,y-1);
    }

}
