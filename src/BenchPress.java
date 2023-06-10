public class BenchPress extends Oefeningen implements WeightRecord{

    public BenchPress(String naam, String beschrijving, int sets, int reps,int gewicht) {
        super(naam, beschrijving, sets, reps, gewicht);

    }

    @Override
    public void trackProgresie() {
        System.out.println("Je huidige bench press progressie is: " + getGewicht() + "KG");
    }
}