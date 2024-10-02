public class Main {
    public static void main(String[] args) {
        FirePokemon firePokemon = new FirePokemon("Pickachu", 200, 20, 5, 6);
        firePokemon.namePokomen();
        firePokemon.hpPokemon();
        firePokemon.xpPokemon();
        firePokemon.fireAttack();

        GrassPokemon grassPokemon = new GrassPokemon("Grassy", 50, 20, "scratch", 28);
        grassPokemon.namePokomen();
        grassPokemon.hpPokemon();
        grassPokemon.xpPokemon();
        grassPokemon.canYouSeeMe();
        grassPokemon.grassPokemonAttack();

        ElectricPokemon electricPokemon = new ElectricPokemon("electric", 20, 30, true, 15);
        electricPokemon.namePokomen();
        electricPokemon.hpPokemon();
        electricPokemon.xpPokemon();
        electricPokemon.isSleepy();
        electricPokemon.shocksNeededToKill();

        WaterPokemon waterPokemon = new WaterPokemon("Bubble", 200, 10, 200, false);
        waterPokemon.namePokomen();
        waterPokemon.hpPokemon();
        waterPokemon.xpPokemon();
        waterPokemon.waterAttack();
        waterPokemon.drink();

    }
}