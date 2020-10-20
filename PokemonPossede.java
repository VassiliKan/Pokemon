import java.util.LinkedList;

public class PokemonPossede {

	LinkedList <Pokemon> Deck;  // Cette variable s'appelle ainsi en reference au nom donnee au paquet de carte dans le jeu d'origine
	
	public PokemonPossede() {
		Deck = new LinkedList<Pokemon>();
		this.Deck.add(new Salameche());
		this.Deck.add(new Carabaffe());
	}

	@Override
	public String toString() {
		String affichage = "Vous possedez " + this.Deck.size() + " Pokemon :\n";
		for (int i = 0; i < this.Deck.size(); i++ ) {
			affichage += this.Deck.get(i).toString();
		}
		return affichage;
	}
	
	

}
