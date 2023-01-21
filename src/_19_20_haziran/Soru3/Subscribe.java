package _19_20_haziran.Soru3;

import java.util.StringJoiner;

public class Subscribe {
    private String name;
    private boolean doYouWannaSubscribe;
    private String whichMember;

    public Subscribe(String name, boolean doYouWannaSubscribe, String whichMember) {
        this.name = name;
        this.doYouWannaSubscribe = doYouWannaSubscribe;
        this.whichMember = whichMember;
    }

    public Subscribe() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getDoYouWannaSubscribe() {
        return doYouWannaSubscribe;
    }

    public void setDoYouWannaSubscribe(boolean doYouWannaSubscribe) {
        this.doYouWannaSubscribe = doYouWannaSubscribe;
    }

    public String getWhichMember() {
        return whichMember;
    }

    public void setWhichMember(String whichMember) {
        this.whichMember = whichMember;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Subscribe.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("doYouWannaSubscribe=" + doYouWannaSubscribe)
                .add("whichMember='" + whichMember + "'")
                .toString();
    }
}
