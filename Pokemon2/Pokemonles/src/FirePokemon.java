class FirePokemon extends Pokemon {
    private int amountOfEyeballs;
    private int amountOfFireballs;

// Constructor //

    public FirePokemon(String name, int hp, int xp, int amountOfEyeballs, int amountOfFireballs) {
        super(name, hp, xp);
        this.amountOfEyeballs = amountOfEyeballs;
        this.amountOfFireballs = amountOfFireballs;
    }

// Methode //

    public void fireAttack() {
        if (getAmountOfFireballs() > 3){
            System.out.println("Attack is very useful");
        } else {
            System.out.println("Attack is not useful");
        }
    }

    public void rollingEyeballs(){
        if (getAmountOfEyeballs() > 2){
            System.out.println(getName() + " sees everything");
        }
        else {
            System.out.println(getName() + " cannot see very well");
        }
    }

// Override //
    @Override
    void hpPokemon(){
        System.out.println(getName() + " has " + getHp() + "hp " + "i'm need more HP because im on fire");
    }


// Getters en Setters //

    public int getAmountOfEyeballs() {
        return amountOfEyeballs;
    }

    public int setAmountOfEyeballs(int amountOfEyeballs) {
        this.amountOfEyeballs = amountOfEyeballs;
        return amountOfEyeballs;
    }

    public int getAmountOfFireballs() {
        return amountOfFireballs;
    }

    public int setAmountOfFireballs(int amountOfFireballs) {
        this.amountOfFireballs = amountOfFireballs;
        return amountOfFireballs;
    }


}
