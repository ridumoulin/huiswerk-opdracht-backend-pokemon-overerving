public abstract class Pokemon {
//    private final List<Pokemon> pokemons;
    private final int level;
    private int hp;
    private final String food;
    private final String type;
    private final String sound;
    private final String name;

    public Pokemon(String name, String type, int level, int hp, String food, String sound) {
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
        this.name = name;
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getFood() {
        return food;
    }

    public String getType() {
        return type;
    }

    public String getSound() {
        return sound;
    }

    public String getName() {
        return name;
    }
}

