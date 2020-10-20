import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Application {

	static LinkedList <Pokemon> Apparition; 
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		Pokemon pokemon2 = null;
		String choix;
		
		Apparition = new LinkedList<Pokemon>();
		Apparition.add(new Carapuce());
		Apparition.add(new Carabaffe());
		Apparition.add(new Salameche());
		Apparition.add(new Reptincel());
		
		
		int tirage = rand.nextInt(4 - 0);
		Pokemon pokemon1 = Apparition.get(tirage);
		System.out.println("Le pokemon suivant vient d'apparaitre : \n" + pokemon1);
				
		PokemonPossede Deck = new PokemonPossede();
		System.out.println(Deck);
		System.out.println("Lequel voulez vous choisir pour combattre ? Entrez son nom : ");
		do {
			choix = scan.nextLine().toLowerCase();
			switch (choix) {
			case "salameche":
				pokemon2 = new Salameche();
				break;
			case "carabaffe":
				pokemon2 = new Carabaffe();
				break;
			default :
				System.out.println("Vous ne possedez pas ce pokemon.. Entrez le nom d'un pokemon disponible : ");
			}
		} while (!choix.equals("salameche") && !choix.equals("carabaffe"));
		
		System.out.println("Vous avez choisi ce pokemon : " + pokemon2 + "\nLe combat peut commencer !\n");
		System.out.println("Choississez une attaque (entrez le numero 1 ou 2) :\n1. " + pokemon2.action1().toString() + "\n2. " + pokemon2.action2().toString() + "\n");
		int choixAttaque = scan.nextInt();
		switch (choixAttaque) {
		case 1:
			pokemon1.retirerPv(pokemon2.action1());
			break;
		case 2:
			pokemon1.retirerPv(pokemon2.action2());
			break;
		default:
			pokemon1.retirerPv(pokemon2.action1());
			break;
		}
		// Affiche le pokemon ayant subi des degats, avec les pv en moins
		System.out.println(pokemon1);
		if (pokemon1 instanceof Pokemon)
		scan.close();
	}
	

}
