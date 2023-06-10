public class Squat extends Oefeningen implements WeightRecord{

    public Squat(String naam, String beschrijving, int sets, int reps,int gewicht) {
        super(naam, beschrijving, sets, reps, gewicht);


    }

    @Override
    public void trackProgresie() {
        System.out.println("Je huidige squat progressie is: " +  getGewicht() + "KG" );
    }
}
