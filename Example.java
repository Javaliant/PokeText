/* Author: Luigi Vincent */

public class Example {
	public static void main(String[] args) {
		Pokemon bulbasaur = new Pokemon.Builder("Bulbasaur")
			.health(45)
			.attack(49)
			.specialAttack(65)
			.defense(49)
			.specialDefense(65)
			.speed(45)
			.type(PokemonType.GRASS)
		.build();

		Pokemon charmander = new Pokemon.Builder("Charmander")
			.health(39)
			.attack(52)
			.specialAttack(60)
			.defense(43)
			.specialDefense(50)
			.speed(60)
			.type(PokemonType.FIRE)
		.build();

		Pokemon squirtle = new Pokemon.Builder("Squirtle")
			.health(44)
			.attack(48)
			.specialAttack(50)
			.defense(65)
			.specialDefense(64)
			.speed(43)
			.type(PokemonType.WATER)
		.build();

		Pokemon eevee = new Pokemon.Builder("Eevee")
			.health(55)
			.attack(55)
			.specialAttack(45)
			.defense(50)
			.specialDefense(65)
			.speed(55)
		.build();

		bulbasaur.printInfo();
		charmander.printInfo();
		squirtle.printInfo();
		// Example adding a move -- Framework unfinalized for how to add a ton of moves. - Maybe a Huge map in a class
		eevee.addMove(new PokemonMove("Tackle", 35, PokemonType.NORMAL, MoveCategory.PHYSICAL));
		eevee.printInfo();
	}
}