public class ElectricPokemon extends Pokemon {
    private boolean needsSleep;
    private int amountOfShocks;

// Constructor //

    public ElectricPokemon(String name, int hp, int xp, boolean needsSleep, int amountOfShocks) {
        super(name, hp, xp);
        this.needsSleep = needsSleep;
        this.amountOfShocks = amountOfShocks;
    }

// Methode //

    public void isSleepy(){
        if(needsSleep){
            System.out.println(getName() + " has enough sleep is not sleepy anymore");
        }
        else {
            System.out.println(getName() + " is tired needs some sleep");
        }
    }

    public void shocksNeededToKill() {
        if(getAmountOfShocks() > 20 ){
            System.out.println(getName() + " has enough shocks to kill the enemy");
        } else if (getAmountOfShocks() > 10) {
            System.out.println(getName() + " has enough shocks to almost kill the enemy");
        } else {
            System.out.println(getName() + " did not use enough shocks, enemy felt nothing");
        }
    }

    // Override //
    @Override
    void hpPokemon(){
        System.out.println(getName() + " has " + getHp() + "hp " + " but needs more because his shocks are too electric");
    }


// Getter en Setters //

    public boolean getNeedsSleep() {
        return needsSleep;
    }

    public boolean setNeedsSleep(boolean needsSleep) {
        this.needsSleep = needsSleep;
        return true;
    }

    public int getAmountOfShocks() {
        return amountOfShocks;
    }

    public int setAmountOfShocks(int amountOfShocks) {
        this.amountOfShocks = amountOfShocks;
        return amountOfShocks;
    }
}
