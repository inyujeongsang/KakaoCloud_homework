package Day08_Interface;

import java.awt.*;

public class MallardDuck extends Duck implements Quackable,Flyable{

    public MallardDuck(int x, int y, int size, int index) {//생성자
        super(x,y,size,index); //부모클래스의 생성자를 호출
    }
    @Override
    public void display(Graphics g) { //오버라이딩
        g.setColor(Color.BLUE);
        g.fillOval(x,y,size,size);
        g.drawString(String.valueOf(index)+"번째",x,y);
        swim(g);
        quack(g);
        fly(g);
    }

    @Override
    public void fly(Graphics g) {//인터페이스 메서드를 재정의한다.
        g.drawString("날다",x-30,y+50);
    }

    @Override
    public void quack(Graphics g) {
        g.drawString("꽥꽥",x+60,y+15);
    }
}