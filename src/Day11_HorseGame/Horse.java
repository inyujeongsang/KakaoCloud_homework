package Day11_HorseGame;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Horse extends Canvas implements Runnable{
    public static final int HORSE_SIZE = 50;

    public static final int RUN_DISTANCE = 700;

    private int x;
    private int y;

    private static int rank = 1;

    public Horse(){
        this.x = 20;
        this.y = 20;
    }

    public void paint(Graphics g){
    g.setColor(Color.RED);
    g.fillOval(x,y,HORSE_SIZE,HORSE_SIZE);


        if(x > RUN_DISTANCE ) {
            rank(g);
        }
    }

    public void rank(Graphics g){
        g.setColor(Color.BLACK);
        g.drawString((rank++)+"등",x-20,y-1);
    }

    @Override
    public void run() {
        Random rnd = new Random();
        while (x <= RUN_DISTANCE){
            this.x += rnd.nextInt(5); //오른쪽으로 좌표이동.
            repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("깨어났습니다.");
            }
        }
    }
}
