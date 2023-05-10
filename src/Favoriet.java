
import java.util.ArrayList;

public class Favoriet {
     private  ArrayList<Oefeningen> favOefeningen = new ArrayList<>();


    public ArrayList<Oefeningen> getFavOefeningen() {
        return favOefeningen;
    }

    public void addFavOefening(Oefeningen oefening) {
        this.favOefeningen.add(oefening);
    }


}
