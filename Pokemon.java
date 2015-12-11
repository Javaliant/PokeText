/* Author: Luigi Vincent */

public class Pokemon {
	private final String name;
	private int health;
	private final int maxHealth;
	private final int attack;
	private final int specialAttack;
	private final int defense;
	private final int specialDefense;
	private final int speed;

	private double attackMultiplier = 1.0;
	private double specialAttackMultiplier = 1.0;
	private double defenseMultiplier = 1.0;
	private double specialDefenseMultiplier = 1.0;
	private double speedMultiplier = 1.0;

	private final PokemonType[] type;
	static int totalPokemon = 0;
	private PokemonMove[] moves = new PokemonMove[4];
	private int moveAmount = 0;
	private final int MOVE_LIMIT = 4;

	Pokemon(Builder builder) {
		name = builder.name;
		health = builder.health;
		maxHealth = builder.health;
		attack = builder.attack;
		specialAttack = builder.specialAttack;
		defense = builder.defense;
		specialDefense = builder.specialDefense;
		speed = builder.speed;
		type = builder.type;
		totalPokemon++;
	}

	public void printInfo() {
		System.out.println(
			"\n\t\t***" + name + " stats***"
			+ "\n\t\t\tHP: " + health + "/" + maxHealth
			+ "\n\t\t\tAtk: " + attack
			+ "\n\t\t\tSpAtk: " + specialAttack
			+ "\n\t\t\tDef: " + defense
			+ "\n\t\t\tSpDef: " + specialDefense
			+ "\n\t\t\tSpeed: " + speed
			+ "\n\t\t\tType: " + getType()
			+ "\n\t\t\tKnows: " + getMoves()
		);
	}

	public String getMoves() {
		StringBuilder moveBuilder = new StringBuilder();
		for (PokemonMove move : moves) {
			if (move != null) {
				moveBuilder.append(", ").append(move.toString());
			}
		}
		return moveBuilder.length() > 0 ? moveBuilder.substring(2) : "no moves";
	}

	public void addMove(PokemonMove move) {
		if (moveAmount + 1 <= MOVE_LIMIT) {
			moves[moveAmount++] = move;
		} else {
			throw new ExceededMoveLimitException(move.toString() + " could not be added.\n" + name + " already has " + MOVE_LIMIT + " moves.");
		}
	}

	public void addMoves(PokemonMove... moves) {
		for (PokemonMove move : moves) {
			addMove(move);
		}
	}

	public void attack(Pokemon target) {
		//TO USE in battle
	}

	public void restore(int value) {
		health = Math.min(health + value, maxHealth);
	}

	public void fullRestore() {
		health = maxHealth;
	}

	public String getType() {
		return type[1].equals(PokemonType.NONE) ? type[0].toString() : type[0].toString() + ", " + type[1].toString();
	}

	public static void battle(Pokemon alpha, Pokemon beta) {
		// TODO: make this A.I. or actually player vs player??
		// will implement when I decide.
		// Also have to consider whether using actual pokemon damage formulas or implementing own
	}

	static class Builder {
		String name;
		int health;
		int attack;
		int specialAttack;
		int defense;
		int specialDefense;
		int speed;
		PokemonType[] type = { PokemonType.NORMAL, PokemonType.NONE };

		Builder(String name) {
			this.name = name;
		}

		public Builder attack(int val) {
			attack = val;
			return this;
		}
		public Builder health(int val) {
			health = val;
			return this;
		}
		public Builder specialAttack(int val) {
			specialAttack = val;
			return this;
		}
		public Builder defense(int val) {
			defense = val;
			return this;
		}
		public Builder specialDefense(int val) {
			specialDefense = val;
			return this;
		}
		public Builder speed(int val) {
			speed = val;
			return this;
		}
		public Builder type(PokemonType type1) {
			type[0] = type1;
			return this;
		}
		public Builder types(PokemonType type1, PokemonType type2) {
			type[0] = type1;
			type[1] = type2;
			return this;
		}

		public Pokemon build() {
			return new Pokemon(this);
		}
	}
}