public class WaterPokemon extends Pokemon {
    private int litersOfWater;
    private boolean needsDrinks;

    public WaterPokemon(String name, int hp, int xp, int litersOfWater, boolean needsDrinks) {
    super (name, hp, xp);
    this.litersOfWater = litersOfWater;
    this.needsDrinks = needsDrinks;
    }

    public void waterAttack(){
        if(litersOfWater > 12){
            System.out.println(getName() + " splashed enough water on the boat. Your boat is sinking. GET OUT!");
        } else {
            System.out.println(getName() + " splashed water on your boat. Luckily it wasn't that much. So you could drain in out with all the towels you got on board");
        }
    }

    public void drink(){
        if(needsDrinks){
            System.out.println(getName() + " is out of water, he needs to drink before he can splash water again");
        } else {
            System.out.println(getName() + " still has enough water to use his splash, but be careful he might get thirsty after this attack");
        }
    }

    // Override //
    @Override
    void hpPokemon(){
        System.out.println(getName() + " has " + getHp() + "hp " + " but " + getName() + " does not really care. " + getName() + " is only thinking about drinking water.");
    }



    public int getLitersOfWater() {
        return litersOfWater;
    }

    public int setLitersOfWater(int litersOfWater) {
        this.litersOfWater = litersOfWater;
        return litersOfWater;
    }

    public boolean getNeedsDrinks() {
        return needsDrinks;
    }

    public boolean setNeedsDrinks(boolean needsDrinks) {
        this.needsDrinks = needsDrinks;
        return needsDrinks;
    }
}
