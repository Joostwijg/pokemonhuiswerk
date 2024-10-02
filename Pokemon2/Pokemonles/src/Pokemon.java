class Pokemon {
    private String name;
    private int hp;
    private int xp;


//Constructor 1 //

    public Pokemon(String name, int hp, int xp) {
        this.name = name;
        this.hp = hp;
        this.xp = xp;
    }

//Methodes //

    void namePokomen(){
        System.out.println(name);
    }

    void hpPokemon(){
        System.out.println(name + " has " + hp + "hp");
    }

    void  xpPokemon(){
        System.out.println(name + " has now " + xp + "xp");
    }
    
// Getter and Setter //

    public String getName(){
        return name;
    }

    public String setName(String name){
        this.name = name;
        return name;
    }

    public int getHp(){
        return hp;
    };

    public int setHp(int hp){
        this.hp = hp;
        return hp;
    }

    public int getXp() {
        return xp;
    }

    public int setXp(int xp){
        this.xp = xp;
        return xp;
    }

}

