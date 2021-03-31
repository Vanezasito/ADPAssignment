package za.ac.cput.adpassignment;
/**
 * Siphosethu Manisi - 219039380
 */

public class Gym {
    private int memberNum;
    private  String memberName;
    private  String memberSubscription;
    private  Double cost;

    public Gym( ) {
        memberNum =0;
        memberName = " ";
        memberSubscription = " ";
        cost = 0.0;
    }
    public Gym(int memberNum, String memberName, String memberSubscription, Double cost) {
        this.memberNum = memberNum;
        this.memberName = memberName;
        this.memberSubscription = memberSubscription;
        this.cost = cost;
    }

    public int getMemberNum() {
        return memberNum;
    }

    public void setMemberNum(int memberNum) {
        this.memberNum = memberNum;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberSubscription() {
        return memberSubscription;
    }

    public void setMemberSubscription(String memberSubscription) {
        this.memberSubscription = memberSubscription;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Gym{" +
                "memberNum=" + memberNum +
                ", memberName='" + memberName + '\'' +
                ", memberSubscription='" + memberSubscription + '\'' +
                ", cost=" + cost +
                '}';
    }
}
