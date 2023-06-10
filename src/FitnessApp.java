

import java.util.ArrayList;
import java.util.Scanner;

public class FitnessApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Favoriet favorieten = new Favoriet();
        ArrayList<PR> prGewicht = new ArrayList<>();

        //code voor de newsletter
        Notification notification = new Notification();
        Member subscriber1 = new Member("Sjaakie");
        Member subscriber2 = new Member("Willem");
        Member subscriber3 = new Member("Pieter");
        Member subscriber4 = new Member("Koen");
        Member subscriber5 = new Member("Bas");

        notification.subscribe(subscriber1);
        notification.subscribe(subscriber2);
        notification.subscribe(subscriber3);
        notification.subscribe(subscriber4);
        notification.subscribe(subscriber5);

        subscriber1.subscribeChannel(notification);
        subscriber2.subscribeChannel(notification);
        subscriber3.subscribeChannel(notification);
        subscriber4.subscribeChannel(notification);
        subscriber5.subscribeChannel(notification);
        //Einde van de code voor newsletter

        ArrayList<Member> members = new ArrayList<>();
        members.add(new Member("Kees"));
        members.add(new Member("Karel"));
        members.add(new Member("Johan"));

        ArrayList<Oefeningen> oefeningen = new ArrayList<>();
        oefeningen.add(new Squat("Squat", "Been oefening", 5, 8, 120));
        oefeningen.add(new BenchPress("Bench press", "Borst oefening", 5, 8, 85));
        oefeningen.add(new Deadlift("Deadlift", "rug oefening", 5, 8, 130));
        System.out.println("Welkom bij onze fitness applicatie!");

        for (int i = 0; i < members.size(); i++) {
            System.out.println(i + 1 + ") " + members.get(i).getNaam());
        }

        int memberKeuze = scanner.nextInt();
        Member currentMember = members.get(memberKeuze);

        boolean exit = false;
        while (!exit) {
            System.out.println("\nMaak een keuze:");
            System.out.println("1. Voer progressie in voor een bestaande oefening");
            System.out.println("2. Bekijk favoriete oefeningen");
            System.out.println("3. Bekijk alle oefeningen");
            System.out.println("4. Verlaat het programma");

            int optie = scanner.nextInt();
            scanner.nextLine();
            Scanner scanner1 = new Scanner(System.in);

            switch (optie) {

                case 1:
                    System.out.println("Welke oefening wil je bijwerken?");

                    int teller = 1;
                    for (Oefeningen oefening : oefeningen) {
                        //System.out.printf("%d) %s\n", teller, oefening.getNaam());
                        System.out.println(teller + ") " + oefening.getNaam());
                        teller++;
                    }

                    int oefeningKeuze = scanner1.nextInt();
                    Oefeningen huidigeOefening = oefeningen.get(oefeningKeuze - 1);
                    System.out.println("Je hebt gekozen voor de " + huidigeOefening.getNaam());
                    scanner1.nextLine();
                    System.out.println("Wil je de progressie aanpassen? (ja/nee)");
                    String antwoord = scanner1.nextLine();

                    if (antwoord.equals("ja")) {
                        System.out.println("Voer het nieuwe gewicht in:");
                        int nieuwGewicht = scanner1.nextInt();

                        Integer verwijderPR = null;
                        for (int i = 0; i < currentMember.getPersonalRecords().size(); i++) {
                            PR currentPR = currentMember.getPersonalRecords().get(i);
                            if (currentPR.getOefening().getNaam().equals(huidigeOefening.getNaam())) {
                                verwijderPR = i;
                            }
                        }
                        if (verwijderPR != null) {
                            currentMember.getPersonalRecords().remove((int) verwijderPR);
                        }
                        PR pr = new PR(huidigeOefening, currentMember, nieuwGewicht);
                        currentMember.addPR(pr);


                        prGewicht.add(pr);
                        pr.getOefening().setGewicht(pr.getGewicht());


                        System.out.println("Opgeslagen!");

                    } else {
                        for (PR pr : currentMember.getPersonalRecords()) {
                            System.out.println(pr.getOefening().getNaam() + ": " + pr.getGewicht());
                        }
                    }
                    break;

                case 2:
                    for (int i = 0; i < favorieten.getFavOefeningen().size(); i++) {
                        System.out.println("Naam: " + favorieten.getFavOefeningen().get(i).getNaam());
                        System.out.println("Beschrijving: " + favorieten.getFavOefeningen().get(i).getBeschrijving());
                        System.out.println("Sets: " + favorieten.getFavOefeningen().get(i).getSets());
                        System.out.println("Reps: " + favorieten.getFavOefeningen().get(i).getReps());
                        System.out.println("Gewicht: " + favorieten.getFavOefeningen().get(i).getGewicht() + "KG");
                    }
                    break;

                case 3:
                    System.out.println("Alle oefeningen:");

                    for (Oefeningen oefening : oefeningen) {
                        System.out.println("\nNaam: " + oefening.getNaam());
                        System.out.println("Beschrijving: " + oefening.getBeschrijving());
                        System.out.println("Sets: " + oefening.getSets());
                        System.out.println("Reps: " + oefening.getReps());

                        //Dit is nodig om trackProgressie te gebruiken in mijn menu.
                        if(oefening instanceof Squat){
                            ((Squat) oefening).trackProgresie();
                        }
                        if(oefening instanceof Deadlift){
                            ((Deadlift) oefening).trackProgresie();
                        }
                        if(oefening instanceof BenchPress){
                            ((BenchPress) oefening).trackProgresie();
                        }
                    }
                    System.out.println("\nWil je een van deze oefeningen toevoegen aan je favorieten? ");
                    System.out.println("(ja/nee)");
                    String antwoord2 = scanner.nextLine();
                    if (antwoord2.equals("ja")) {
                        System.out.println("Welke oefening wil je toevoegen aan je favorieten?");
                        System.out.println("1. Squat");
                        System.out.println("2. Bench press");
                        System.out.println("3. Deadlift");

                    } else {
                        break;
                    }

                    int keuze = scanner.nextInt();

                    if (keuze == 1) {
                        System.out.println("Squat is toegevoegd aan je favorieten!");
                        favorieten.addFavOefening(oefeningen.get(0));
                        break;
                    } else if (keuze == 2) {
                        System.out.println("BenchPress is toegevoegd aan je favorieten!");
                        favorieten.addFavOefening(oefeningen.get(1));
                        break;
                    } else if (keuze == 3) {
                        System.out.println("Deadlift is toegevoegd aan je favorieten!");
                        favorieten.addFavOefening(oefeningen.get(2));
                        break;
                    }
                case 4:
                    exit = true;
                    break;
                case 5: //nieuws brief case
                    notification.upload("Diskwalificatie voor dubbelspelers op Roland Garros wegens geraakt ballenmeisje");
                    break;
                default:
                    System.out.println("Ongeldige keuze. Probeer opnieuw.");
                    break;
            }
        }
        System.out.println("Bedankt voor het gebruik van onze fitness applicatie!");

    }
}