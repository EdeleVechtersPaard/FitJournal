import java.util.ArrayList;

public class Deadlift extends Oefeningen implements WeightRecord{

    public Deadlift(String naam, String beschrijving, int sets, int reps,int gewicht) {
        super(naam, beschrijving, sets, reps, gewicht);

    }

    @Override
    public void trackProgresie() {
        System.out.println("Je huidige deadlift progressie is: " + getGewicht() + "KG");
    }
}
