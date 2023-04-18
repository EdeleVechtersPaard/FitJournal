abstract public class Oefeningen {
     private String naam;
     private String beschrijving;
     private int sets;
     private int reps;
     public int gewicht;

     public Oefeningen(String naam, String beschrijving, int sets, int reps, int gewicht) {
         this.naam = naam;
         this.beschrijving = beschrijving;
         this.sets = sets;
         this.reps = reps;
         this.gewicht = gewicht;
     }


     public abstract void trackProgressie();

     public String getBeschrijving() {
         return beschrijving;
     }

     public String getNaam() {
         return naam;
     }

     public int getSets() {
         return sets;
     }

     public int getReps() {
         return reps;
     }

     public void setNaam(String naam) {
         this.naam = naam;
     }

     public void setBeschrijving(String beschrijving) {
         this.beschrijving = beschrijving;
     }

     public void setSets(int sets) {
         this.sets = sets;
     }

     public void setReps(int reps) {
         this.reps = reps;
     }

     public int getGewicht() {
         return gewicht;
     }

     public void setGewicht(int nieuwGewicht) {
         this.gewicht = nieuwGewicht;
     }

 }




