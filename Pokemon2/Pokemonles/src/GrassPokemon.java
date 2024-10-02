public class GrassPokemon extends Pokemon {
    private int grassLength;
    private String grassAttack;

// constructor //

    public GrassPokemon(String name, int hp, int xp, String grassAttack, int grassLength) {
        super(name, hp, xp);
        this.grassLength = grassLength;
        this.grassAttack = grassAttack;
    }

// Methods //

    public void canYouSeeMe(){
        if (getGrassLength() > 20){
        System.out.println("The grass is " + getGrassLength() + "cm high now you can not see " + getName());
        } else {
            System.out.println("The grass is " + getGrassLength() + "cm high now you can see " + getName());
        }
    }

    public void grassPokemonAttack(){
        if (getGrassLength() > 10){
            System.out.println(getGrassAttack() + " is very useful");
        } else
            System.out.println(getGrassAttack() + " is not very useful");

    }

// Override //
    @Override
    void hpPokemon(){
    System.out.println(getName() + " has " + getHp() + "hp " + "be careful i need some health back so i am eating grass");
}



// Getters en Setters //

    public String getGrassAttack(){
        return grassAttack;
    }
    public String setGrassAttack(){
        this.grassAttack = grassAttack;
        return grassAttack;
    }

    public int getGrassLength() {
        return grassLength;
    }

    public int setGrassLength(int grassLength) {
        this.grassLength = grassLength;
        return grassLength;

    }
}
