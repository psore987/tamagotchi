package Pack1;
import java.util.Scanner;

public class Tamagotchi {
    private String nom;
    private int faim;
    private int humeur;
 	private int energie;
    private boolean malade;

    public Tamagotchi(String nom) {
        this.nom = nom;
        this.faim = 50;
        this.humeur = 50;
        this.energie = 50;
        this.malade = false; // Initialement, le Tamagotchi n'est pas malade
    }

    // Nouvelle méthode pour soigner le Tamagotchi
    public void soigner() {
        if (malade) {
            malade = false;
            System.out.println(nom + " a été soigné et est maintenant en bonne santé !");
            humeur += 10; // Soigner améliore aussi l'humeur
        } else {
            System.out.println(nom + " est en pleine forme, il n'a pas besoin de soins.");
        }
    }
	
	 // Nouvelle méthode pour rendre le Tamagotchi malade
    public void tomberMalade() {
        malade = true;
        System.out.println(nom + " est tombé malade !");
        humeur -= 10; // Il perd un peu de sa bonne humeur !
    }

    // Méthode pour nourrir le Tamagotchi
    public void nourrir() {
        if (faim > 0) {
            faim -= 20;
            humeur += 10;
            System.out.println(nom + " a été nourri. Faim: " + faim + ", Humeur: " + humeur);
	        } else {
            System.out.println(nom + " n'a pas faim.");
        }
    }

    // Méthode pour jouer avec le Tamagotchi
    public void jouer() {
        if (energie > 20) {
            energie -= 20;
            faim += 20;
            humeur += 20;
            System.out.println("Vous jouez avec " + nom + ". Énergie: " + energie + ", Faim: " + faim + ", Humeur: " + humeur);
        } else {
            System.out.println(nom + " est trop fatigué pour jouer.");
        }
    }

    // Méthode pour faire dormir le Tamagotchi
    public void dormir() {
        energie = 100;
        humeur -= 10;
        faim += 10;
        System.out.println(nom + " a dormi. Énergie: " + energie + ", Humeur: " + humeur + ", Faim: " + faim);
    }

    // Méthode pour afficher l'état du Tamagotchi
    public void etat() {
        System.out.println("Nom: " + nom);
        System.out.println("Énergie: " + energie);
        System.out.println("Faim: " + faim);
        System.out.println("Humeur: " + humeur);
		if (malade) {
			System.out.println(nom + " est malade ! Il faut le soigner !");
		 } else {
			System.out.println(nom + " est en pleine forme !");
		}
	}
}
