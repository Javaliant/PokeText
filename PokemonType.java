/* Author: Luigi Vincent */


public enum PokemonType {
	NONE,
	FIRE,
	WATER,
	GRASS,
	ELECTRIC,
	PSYCHIC,
	ICE,
	DRAGON,
	DARK,
	FAIRY,
	FIGHTING,
	FLYING,
	POISON,
	GROUND,
	ROCK,
	BUG,
	GHOST,
	STEEL,
	NORMAL;

	@Override
	public String toString() {
		return name().charAt(0) + name().substring(1).toLowerCase();
	}
}