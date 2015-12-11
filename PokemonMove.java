/* Author: Luigi Vincent */

public class PokemonMove {
	final String name;
	final int power;
	final PokemonType type;
	final MoveCategory category;

	public PokemonMove(String name, int power, PokemonType type, MoveCategory category) {
		this.name = name;
		this.power = power;
		this.type = type;
		this.category = category;
	}

	@Override
	public String toString() {
		return name;
	}
}