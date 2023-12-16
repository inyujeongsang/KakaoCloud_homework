package Day07_Inheritance;

import java.awt.*;
import java.util.Random;

public class MyFrame extends Frame {
    public final int FRAME_WIDTH=800; //final 제어자는 후에 못바꿔.
    public final int FRAME_HEIGTH = 600;
    public final int INITIAL_SIZE = 50;
    private int x;
    private int y;
    private Color color;
    private MyShape[] shape = new MyShape[10];

    public MyFrame(){
        super();
        this.setSize(FRAME_WIDTH, FRAME_HEIGTH);
        this.setVisible(true);

        ;}

    @Override
    public void paint(Graphics gp) {

        for(int i = 0; i <shape.length; i++){
            //랜덤시드를 지정해줘서 서버를 껐다켜도 그대로 출력되도록함.
            Random random = new Random(i);
            x = random.nextInt(800);
            y = random.nextInt(600);
            int shapeStyle = random.nextInt(4);

            Color color = new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255));
            gp.setColor(color);

            switch (shapeStyle){
                case 0 ://동그라미
                    gp.fillOval(x,y,INITIAL_SIZE, INITIAL_SIZE);
                    break;
                case 1 ://네모
                    gp.fillRect(x,y,INITIAL_SIZE, INITIAL_SIZE);
                    break;
                case 2 ://세모
                    int[] xList = {x,x+25,x+50};
                    int[] yList = {y,y+50,y};
                    gp.fillPolygon(xList,yList,3);
                    break;
                case 3://별
                    int[] xList2 = {x+40,x,x+30,x+20,x+10};
                    int[] yList2 = {y,y,y-20,y+20,y-20};
                    gp.fillPolygon(xList2,yList2,5);
                    break;
            }
        }
    }
}
