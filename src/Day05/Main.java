package Day05;

public class Main {
    public static void main(String[] args) {
// TODO Auto-generated method stub
//MemberManager 객체생성
//이달의 최고회원을 뽑는 메서드: calcBestMember()
//출력 메서드: showMember()
//메서드들을 관리한다.
        MemberManager manager = new MemberManager();

//Member 인스턴스들 생성
        manager.createMembers();

//이달의 최고회원을 뽑는 메서드
        manager.calcBestMember();

//출력메서드
        manager.showMember();


    }
}