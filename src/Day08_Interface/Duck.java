package Day08_Interface;

import java.awt.*;

public abstract class Duck {//추상클래스는 추상메서드를 포함한다.
    // 다른 클래스에서 Duck을 상속받아 추상메서드를 재정의(함수 오버라이딩)한다.
    protected int x, y,size,index;
    //protected 접근제어자는 같은 패키지 내에서, 다른패키지의 경우 자식 클래스에서 접근 가능.

    public Duck(int x, int y,int size, int index){//Duck 생성자
        this.x = x; //x좌표
        this.y = y; //y좌표
        this.size = size; //동그라미의 사이즈
        this.index = index; //몇번째 출력된 오리인지 체크
    }

    public abstract void display(Graphics g);

    public void swim(Graphics g){//모든 오리는 수영을 할 수 있기때문에 Duck클래스에 메서드를 생성.
        g.drawString("수영",x-10,y-10);
    }

}