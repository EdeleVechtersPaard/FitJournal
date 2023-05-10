public class Squat extends Oefeningen {


    public Squat(String naam, String beschrijving, int sets, int reps, int gewicht) {
            super(naam, beschrijving, sets, reps, gewicht);


    }

    @Override
    public void trackProgressie() {
        System.out.println("Je huidige squat PR is: " );
    }
}
