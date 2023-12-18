package Day09_Singletone;

import java.awt.*;

public class MyFrame extends Frame{
    public static final int FRAME_WIDTH = 800;
    public static final int FRAME_HEIGHT = 600;

    public MyFrame(){
        super();
        this.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        this.setVisible(true);
    }

    DuckManager mgr = DuckManager.getInstance();
    @Override
    public void paint(Graphics g){
        if(mgr!=null){
            mgr.displayAllDucks(g);
//            mgr.swimAllDucks(g);
//            mgr.flyAllDucks(g);
//            mgr.quackAllDucks(g);
        }
    }
}
