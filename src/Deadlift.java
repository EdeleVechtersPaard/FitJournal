public class Deadlift extends Oefeningen {

    public Deadlift(String naam, String beschrijving, int sets, int reps, int gewicht) {
        super(naam, beschrijving, sets, reps, gewicht);
    }

    @Override
    public void trackProgressie() {
        System.out.println("Je deadlift progressie is:"  );
    }


}
