import java.util.ArrayList;

public class Deadlift extends Oefeningen {
    private ArrayList<Oefeningen> oefeningen;

    public Deadlift(ArrayList<Oefeningen> oefeningen, String naam, String beschrijving, int sets, int reps, int gewicht) {
        super(naam, beschrijving, sets, reps, gewicht);
        this.oefeningen = oefeningen;
    }


    @Override
    public void trackProgressie() {
        System.out.println("Je huidige deadlift PR is: " + oefeningen.get(0).getGewicht() );
    }


}
