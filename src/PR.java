public class PR {
    private Oefeningen oefening;
    private Member member;
    private int gewicht;

    public PR (Oefeningen oefening, Member member, int gewicht){
        this.oefening = oefening;
        this.member = member;
        this.gewicht = gewicht;
    }

    public Oefeningen getOefening() {
        return oefening;
    }

    public Member getMember() {
        return member;
    }

    public int getGewicht() {
        return gewicht;
    }
}
