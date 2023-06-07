import java.util.ArrayList;

public class Member {
    private String naam;
    private static int memberIDTeller = 1;
    private int memberID;
    private ArrayList<PR>personalRecords = new ArrayList();
    public Member(String naam){
        this.naam = naam;
        memberID = memberIDTeller++;
    }

    public void addPR(PR personalRecord) {
        this.personalRecords.add(personalRecord);
    }

    public String getNaam() {
        return naam;
    }

    public ArrayList<PR> getPersonalRecords() {
        return personalRecords;
    }
}
