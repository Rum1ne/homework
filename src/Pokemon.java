public class Pokemon {
    String name;

    public void setName(String Name) {
        name = Name;
    }

    int pokemonpower;
    int pokemonhp;

    public void setPokemonpower(int Pokemonpower) {
        if (Pokemonpower <= 0) {
            pokemonpower = 10;
        } else pokemonpower = Pokemonpower;
    }

    public void setPokemonhp(int Pokemonhp) {
        if (Pokemonhp <= 0) {
            pokemonhp = 100;
        } else pokemonhp = Pokemonhp;
    }

    int enemypower;
    int enemyhp;

    public void setEnemypower(int Enemypower) {
        if (Enemypower <= 0) {
            enemypower = 10;
        } else enemypower = Enemypower;
    }

    public void setEnemyhp(int Enemyhp) {
        if (Enemyhp <= 0) {
            enemyhp = 100;
        } else enemyhp = Enemyhp;
    }

    public void boom() {
        for (int i = 0; i < enemyhp || i < pokemonhp; ++i) {
            enemyhp -= pokemonpower;
            pokemonhp -= enemypower;
            if (pokemonhp <= 0 || enemyhp <= 0) {
                System.out.println(enemyhp <= 0 ? name + " WON!!" : name + " DEFEATED :c");
                break;
            }
        }
    }
}
