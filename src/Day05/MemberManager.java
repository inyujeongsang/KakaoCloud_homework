package Day05;
import java.util.ArrayList;
import java.util.List;

public class MemberManager {
    private List<Member> members;//Member클래스의 인스턴스들을 members변수에 담는다.

    //생성자
    public MemberManager(){
        members = new ArrayList<>();
    }

    //Member객체에 member를 추가해준다.
    public void addMember(Member member){
        members.add(member);
    }

    //이달의 최고회원을 구한다.
    public void calcBestMember(){
        int maxCnt = Member.maxCount(members); //Member객체에 있는 메서드를 이용한다.

        for(Member member : members){ //리스트를 순회하며 구매횟수가 maxCnt와 같으면 bestMem을 true로.
            if (member.getCnt() == maxCnt) {
                member.setBest(true);
                member.addPoints(10000); //추가누적점수 10000점!
            }
        }
    }

    public void showMember() { //출력메서드. Member객체에 있는 display와 헷갈릴까봐 show로 명명했다.
        for(Member member:members){
            member.display();
        }
    }

    public void createMembers(){
//Member객체의 인스턴스들을 생성해준다.
        Member mobj1 = new Member("1","홍길동","20120212",3);
        Member mobj2 = new Member("2","김길동","20120812",2);
        Member mobj3 = new Member("3","이길동","20130112",10);
        Member mobj4 = new Member("4","박길동","20110912",11);
        Member mobj5 = new Member("5","최길동","20100712",6);
        Member mobj6 = new Member("6","한길동","20120112",8);

        //member를 추가해준다.
//MemberManager객체에서 여러 메서드들을 이용하려면 members변수에 담겨야하기 때문이다.
        addMember(mobj1);
        addMember(mobj2);
        addMember(mobj3);
        addMember(mobj4);
        addMember(mobj5);
        addMember(mobj6);
    }
}