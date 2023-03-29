class BenchPress extends SoortOefening {

    public BenchPress(String naam, String beschrijving, int sets, int reps, int gewicht) {
        super(naam, beschrijving, sets, reps, gewicht);
        this.gewicht = gewicht;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    @Override
    public void trackProgressie() {
        System.out.println("Je bench press progressie...");
    }
}