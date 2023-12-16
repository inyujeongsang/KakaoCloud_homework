package Day08_Interface;

import java.awt.*;
import java.util.Random;

public class DuckFrame extends Frame {
    private Duck[] ducks = new Duck[20];
    //20마리의 오리 고정크기 배열에 넣을 거임.

    public static final int INITIAL_SIZE = 50; //상수는 static final로 정의
    private static final int FRAME_WIDTH = 800;
    private static final int FRAME_HEIGHT = 600;

    public DuckFrame(){
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setVisible(true);//디폴트가 false여서 true로 지정해줌.

        makeDuck(); //가독성을 위해 메서드로 따로 빼줌.
    }

    public void makeDuck(){
        Random rnd = new Random();
        int maxX = FRAME_WIDTH - INITIAL_SIZE; //브라우저 크기가 바뀌든, 동그라미 크기가 바뀌든 변수 선언부에서만 수정하면 되도록 함.
        int maxY = FRAME_HEIGHT - INITIAL_SIZE; //유지보수성을 높이는 부분.

        for (int i = 0; i < ducks.length; i++) {
            int x = rnd.nextInt(maxX);
            int y = rnd.nextInt(maxY);
            int duckType = rnd.nextInt(4); //타입을 (0~3)사이 숫자로 받는다.
            switch(duckType){
                case 0:
                    ducks[i] = new MallardDuck(x,y,INITIAL_SIZE,i);
                    break;
                case 1:
                    ducks[i] = new RedDuck(x,y,INITIAL_SIZE,i);
                    break;
                case 2:
                    ducks[i] = new RubberDuck(x,y,INITIAL_SIZE,i);
                    break;
                case 3:
                    ducks[i] = new DecoyDuck(x,y,INITIAL_SIZE,i);
                    break;
            }

        }
    }

    @Override  //Frame클래스에 있는 paint를 재정의한다.
    public void paint(Graphics g) { //Window 기능이라 실행하면 브라우저 띄워짐.
        for (Duck d : ducks) {
            if (d != null) { //에러를 방지하기 위해 if문으로 null체크를 해준다.
                d.display(g);
            }
        }
    }
}