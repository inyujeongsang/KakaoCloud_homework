package Day05;
import java.util.List;

public class Member {
    private String mid;//회원아이디
    private String mname;//회원명
    private String registerDay;//가입일
    //Date타입을 사용해야하지만, 아직 안배움!
    private int buyCnt;//구매횟수
    private int accumPoint;//누적포인트
    private String mclass;//회원등급
    private boolean bestMem;//이달의최고회원

    //모든 클래스는 초기화를 담당하는 '생성자'를 무조건 포함해야한다.
    public Member(String id,String name,String day,int cnt) {
        this.mid = id;
        this.mname = name;
        this.registerDay = day;
        this.buyCnt = cnt;
        this.accumPoint = 0;
        this.mclass = null;

        //메소드를 호출한다.
        calcPoint();//누적포인트 계산하기
        memberClass();//회원등급 부여하기
    }

    //이달의최고회원을 판단하기 위해 필요하다.
    public int getCnt() {
        return buyCnt;
    }

    //누적포인트를 계산후, 인스턴스에 결과를 set해준다.
    public void setAccumPoint(int accumPoint) {
        this.accumPoint = accumPoint;
    }

    //회원등급을 구분하고, 인스턴스에 결과를 set해준다.
    public void setClass(String c) {
        this.mclass = c;
    }

    //이달의 최고회원인지 아닌지, true,false로 구분한다.
    public void setBest(boolean b) {
        this.bestMem = b;
    }


    //누적포인트구하기
    public int calcPoint() {
        //값 초기화
        int accumPoint = 0;
        int cnt = this.buyCnt;

        if(cnt < 3) {
            accumPoint = cnt*20;
        } else if (cnt < 5) {
            accumPoint = cnt*30;
        } else if (cnt < 10) {
            accumPoint = cnt*50;
        } else {
            accumPoint = cnt*100;
        }

        this.setAccumPoint(accumPoint);

        return accumPoint;

    }


    //회원등급 정하기
    public String memberClass() {
        int point = this.accumPoint;

        if(point < 100) {
            mclass = "Family";
        } else if(point < 300) {
            mclass = "Gold";
        } else if(point < 500) {
            mclass = "VIP";
        } else {
            mclass = "VVIP";
        }

        this.setClass(mclass);

        return mclass;

    }



    //최대구매횟수 구하기(클래스변수 사용)
    public static int maxCount(List<Member>member) {//멤버를 List에 담고 반복문을 돌렸다.

        int maxCnt = 0; //값 초기화
        for(Member m:member) {
            if(m.getCnt() > maxCnt) { //구매횟수가 maxCnt보다 크면 maxCnt을 다시 정의(?)해준다.
                maxCnt = m.getCnt();
            }
        }
        return maxCnt;
    }

    //이달의 최고회원에게 포인트 추가하기
    public void addPoints(int addNum) {//문제에선 10000점을 추가하지만, 추가점수가 바뀔 경우를 고려하여 인수를 따로 받았다.
        this.accumPoint += addNum;
    }

    //출력한다.
    public void display() {
        System.out.println("회원아이디:"+mid+" 이름:"+mname+" 가입일:"+registerDay+" 구매횟수:"+buyCnt+" 누적포인트점수:"+accumPoint+" 회원등급:"+mclass);
    }
}