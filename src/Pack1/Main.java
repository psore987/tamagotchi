package Pack1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nom du Tamagotchi : ");
        String nom = scanner.nextLine();

        Tamagotchi tamagotchi = new Tamagotchi(nom);

        // Menu de sélection d'actions
        boolean quitter = false;
        while (!quitter) {
            System.out.println("\nQue voulez-vous faire ?");
            System.out.println("1. Nourrir");
            System.out.println("2. Jouer");
            System.out.println("3. Dormir");
            System.out.println("4. Vérifier l'état");
            System.out.println("5. Soigner");
            System.out.println("6. Quitter");

            int choix = scanner.nextInt();
            scanner.nextLine(); // Consomme la nouvelle ligne

            switch (choix) {
                case 1:
                    tamagotchi.nourrir();
                    break;
                case 2:
                    tamagotchi.jouer();
                    break;
                case 3:
                    tamagotchi.dormir();
                    break;
                case 4:
                    tamagotchi.etat();
                    break;
                case 5:
                    tamagotchi.soigner();
                    break;
                case 6:
                    quitter = true;
                    break;
                default:
                    System.out.println("Choix invalide.");
            }

            // Pour tester la méthode tomberMalade (juste à titre d'exemple)
            if (Math.random() < 0.5) { // 50% (!) de chances de tomber malade pour test
                tamagotchi.tomberMalade();
            }
        }

        scanner.close();
    }
}
