import java.util.ArrayList;

public class Member implements Observer {
    private String naam;
    private static int memberIDTeller = 1;
    private int memberID;
    private ArrayList<PR>personalRecords = new ArrayList<>();
    private Notification notification = new Notification();

    public Member(String naam){
        super();
        this.naam = naam;
        memberID = memberIDTeller++;
    }

    @Override
    public void update() {
        System.out.printf("Hey " + naam + " de news brief met de titel: \""+ notification.title + "\" staat voor je klaar!\n");
    }

    @Override
    public void subscribeChannel(Notification nc) {
        notification = nc;
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
