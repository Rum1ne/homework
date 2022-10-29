public class NicePokemon extends Pokemon {

    int ult;

    public void setUlt(int Ult) {
        if (Ult > 0) ult = Ult;
        else ult = 5;
    }

    @Override
    public void boom() {
        for (int i = 1; i < enemyhp || i < pokemonhp; ++i) {
            if (i % ult == 0) {
                enemyhp -= pokemonpower*10;
            } else {
                enemyhp -= pokemonpower;
            }
            pokemonhp -= enemypower;
            if (pokemonhp <= 0) {
                System.out.println(name + " DEFEATED :c");
                if (i%ult==0) System.out.println("My best attack didn't work...");
                else System.out.println("How can i lose...");
                break;
            }
            if (enemyhp <= 0) {
                System.out.println(name + " WON!!");
                if (i%ult==0) System.out.println("My best attack works as well as always ;)");
                else System.out.println("Nice fight!!");
                break;
            }
        }
    }
}
