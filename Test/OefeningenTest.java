import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class OefeningenTest {
    //test om te kijken of het gewichtSetten correct werkt.
    @Test
    public void testGewichtSetter() {
        Oefeningen oefening = new Squat("Squat", "Been oefening", 3, 5, 120);
        assertEquals(120,oefening.getLeaderboardGewicht());

        oefening.setLeaderboardGewicht(150);
        assertEquals(150, oefening.getLeaderboardGewicht());

    }
}