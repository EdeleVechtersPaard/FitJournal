import java.util.Scanner;

public class fitnessApp {

    public static void main(String[] args) {
        Favorieten favorieten = new Favorieten();
        Scanner scanner = new Scanner(System.in);
        SoortOefening[] oefeningNaam = new SoortOefening[2];
        oefeningNaam[0] = new Squat("Squat", "Been oefening", 5, 8, 120);
        oefeningNaam[1] = new BenchPress("Bench press", "Borst oefening", 5, 8, 85);

        System.out.println("Welkom bij onze fitness applicatie!");

        boolean exit = false;
        while (!exit) {
            System.out.println("\nMaak een keuze:");
            System.out.println("1. Voer progressie in voor een bestaande oefening");
            System.out.println("2. Bekijk favoriete oefeningen");
            System.out.println("3. Bekijk alle oefeningen");
            System.out.println("4. Verlaat het programma");

            int optie = scanner.nextInt();
            scanner.nextLine();

            switch (optie) {

                case 1:
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Welke oefening wil je bijwerken?");
                    System.out.println("1. Squat");
                    System.out.println("2. Bench press");
                    int oefeningKeuze = scanner1.nextInt();

                    if (oefeningKeuze == 1) {
                        Squat squat = (Squat) oefeningNaam[0];
                        System.out.println("Je hebt gekozen voor de Squat.");
                        System.out.println("Huidige gewicht: " + squat.getGewicht() + " kg");
                        System.out.println("Wil je de progressie aanpassen? (ja/nee)");
                        String antwoord = scanner1.next();
                        if (antwoord.equals("ja")) {
                            System.out.println("Voer het nieuwe gewicht in:");
                            int nieuwGewicht = scanner1.nextInt();
                            oefeningNaam[0].setGewicht(nieuwGewicht);
                            System.out.println("Nieuw gewicht: " + nieuwGewicht + " kg");


                        } else {

                            System.out.println("Huidige gewicht: " + squat.getGewicht() + " kg");


                        }
                        break;

                    }
                    if (oefeningKeuze == 2){
                        BenchPress benchPress = (BenchPress) oefeningNaam[1];
                        System.out.println("Je hebt gekozen voor de Squat.");
                        System.out.println("Huidige gewicht: " + benchPress.getGewicht() + " kg");
                        System.out.println("Wil je de progressie aanpassen? (ja/nee)");
                        String antwoord = scanner1.next();

                        if (antwoord.equals("ja")) {
                            System.out.println("Voer het nieuwe gewicht in:");
                            int nieuwGewicht = scanner1.nextInt();
                            oefeningNaam[1].setGewicht(nieuwGewicht);
                            System.out.println("Nieuw gewicht: " + nieuwGewicht + " kg");


                        } else {

                            System.out.println("Huidige gewicht: " + benchPress.getGewicht() + " kg");


                        }
                        break;
                    }
                        case 2:

                                for(int i = 0; i<favorieten.voegFavorietenToe.size(); i++){
                                    System.out.println("Naam: " + favorieten.voegFavorietenToe.get(i).getNaam());
                                    System.out.println("Beschrijving: " + favorieten.voegFavorietenToe.get(i).getBeschrijving());
                                    System.out.println("Sets: " + favorieten.voegFavorietenToe.get(i).getSets());
                                    System.out.println("Reps: " + favorieten.voegFavorietenToe.get(i).getReps());
                                    System.out.println("Gewicht: " + favorieten.voegFavorietenToe.get(i).getGewicht() + " KG\n");
                                }
                            break;
                        case 3:
                            System.out.println("Alle oefeningen:");

                            for (SoortOefening oefening : oefeningNaam) {
                                System.out.println("\nNaam: " + oefening.getNaam());
                                System.out.println("Beschrijving: " + oefening.getBeschrijving());
                                System.out.println("Sets: " + oefening.getSets());
                                System.out.println("Reps: " + oefening.getReps());
                                System.out.println("Gewicht: " + oefening.getGewicht());
                            }
                            System.out.println("\nWil je een van deze oefeningen toevoegen aan je favorieten? ");
                            System.out.println("(ja/nee)");
                            String antwoord = scanner.nextLine();
                            if (antwoord.equals("ja")) {
                                System.out.println("Welke oefening wil je toevoegen aan je favorieten?");
                                System.out.println("1. Squat");
                                System.out.println("2. Bench press");

                            }else{
                                break;
                            }
                            int keuze = scanner.nextInt();
                            if (keuze == 1) {
                                System.out.println("Squat is toegevoegd aan je favorieten!");
                                favorieten.voegFavorietenToe.add(oefeningNaam[0]);
                                break;
                            }
                            else if(keuze == 2){
                                System.out.println("BenchPress is toegevoegd aan je favorieten!");
                                favorieten.voegFavorietenToe.add(oefeningNaam[1]);
                                break;
                            }
                        case 4:
                            exit = true;
                            break;
                        default:
                            System.out.println("Ongeldige keuze. Probeer opnieuw.");
                            break;
                    }
        }
        System.out.println("Bedankt voor het gebruik van onze fitness applicatie!");

    }
}