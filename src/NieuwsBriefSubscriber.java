
public class NieuwsBriefSubscriber implements Observer {

    private String name;
    private Notification notification = new Notification();

    public NieuwsBriefSubscriber(String name) {
        super();
        this.name = name;
    }

    @Override
    public void update() {
        System.out.printf("Hey " + name + " de news brief met de titel: \""+ notification.title + "\" staat voor je klaar!\n");

    }

    //"Dubbelpartners Miyu Kato en Aldila Sutjiadi zijn zondag gediskwalificeerd in de vierde ronde van het dubbelspel op Roland Garros. De Japanse Kato sloeg na een punt de bal weg en raakte per ongeluk een ballenmeisje, dat in tranen uitbarstte.\n" +
    //        "Het duo kreeg aanvankelijk een waarschuwing, maar tegenstanders Sara Sorribes Tormo en Marie Bouzková waren het daar niet mee eens. Kato had zich al verontschuldigd bij het ballenmeisje en uitgelegd dat het een onbewuste actie was.\n" +
    //        "\n" +
    //        "Na het protest van het Spaans-Tsjechische duo liet de umpire van dienst twee hoofdscheidsrechters de baan op komen. Uiteindelijk besloot de wedstrijdleiding het duo te diskwalificeren. Op dat moment stonden Kato en Sutjiadi op een 3-1-voorsprong in de tweede set, nadat ze de eerste set hadden verloren.\n" +
    //        "\n" +
    //        "\"Als je iemand raakt en diegene is geblesseerd, dan ben je daar verantwoordelijk voor\", legde een hoofdscheidsrechter uit aan het tennisduo. \"Tijdens de wedstrijd is dat niet het geval, maar wel als het spel stilligt.\"\n\n"
    @Override
    public void subscribeChannel(Notification nc) {
        notification = nc;
    }
}
