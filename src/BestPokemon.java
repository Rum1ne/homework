public class BestPokemon extends NicePokemon {
    String noise;

    public void setNoise(String Noise) {
        noise = Noise;
    }

    int critcnance;
    double critdamage;

    public void setCritChance(int CritChance) {
        if (CritChance > 0 && CritChance < 100) critcnance = CritChance;
        else critcnance = 5;
    }

    public void setCritDamage(int CritDamage) {
        if (CritDamage > 50 && CritDamage < 300) critdamage = CritDamage;
        else critdamage = 180;
    }

    @Override
    public void boom() {
        for (int i = 1; i < enemyhp || i < pokemonhp; ++i) {
            if (i % ult == 0) {
                if (Math.random() * 100 < critcnance) {
                    enemyhp -= pokemonpower * 10 * (1 + critdamage / 100);
                    System.out.print(noise + " ");
                } else {
                    enemyhp -= pokemonpower * 10;
                }
            } else {
                if (Math.random() * 100 < critcnance) {
                    enemyhp -= pokemonpower * (1 + critdamage / 100);
                    System.out.print(noise + " ");
                } else {
                    enemyhp -= pokemonpower;
                }
            }
            pokemonhp -= enemypower;
            if (pokemonhp <= 0) {
                System.out.println(name + " DEFEATED :c");
                if (i % ult == 0) System.out.println("My best attack didn't work...");
                else System.out.println("How can i lose...");
                break;
            }
            if (enemyhp <= 0) {
                System.out.println(name + " WON!!");
                if (i % ult == 0) System.out.println("My best attack works as well as always ;)");
                else System.out.println("Nice fight!!");
                break;
            }
        }
    }
}
