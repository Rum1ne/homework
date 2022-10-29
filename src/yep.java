import java.util.Scanner;

/*
Может ли покемон с введёными характеристиками победить на одной из стадий эволюций
Что он скажет на второй стадии при победе/поражение
Кританёт ли он на третьей стадии вообще..

Данные для проверки кода
Pikachu 10 400 100 10000 4 Nah! 70 270
Ivi 70 1200 50 80000 8 bruh 90 190
*/
public class yep {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pokemon first = new Pokemon();
        first.setName(in.next());                                        //имя покемона
        first.setPokemonpower(in.nextInt());                             //сила покемона
        first.setPokemonhp(in.nextInt());                                //здоровье покемона
        first.setEnemypower(in.nextInt());                               //сила противника
        first.setEnemyhp(in.nextInt());                                  //здоровье противника
        NicePokemon second = new NicePokemon();
        second.name = first.name;
        second.pokemonpower = first.pokemonpower * 8;
        second.pokemonhp = first.pokemonhp * 4;
        second.enemypower = first.enemypower;
        second.enemyhp = first.enemyhp;
        second.setUlt(in.nextInt());                                      //количество атак необходимое для заряжания ульты
        BestPokemon third = new BestPokemon();
        third.name = first.name;
        third.pokemonpower = second.pokemonpower * 12;
        third.pokemonhp = second.pokemonhp * 6;
        third.enemypower = first.enemypower;
        third.enemyhp = first.enemyhp;
        third.ult = second.ult;
        third.setNoise(in.next());                                        //звук при крите покемона
        third.setCritChance(in.nextInt());                                //шанс крита
        third.setCritDamage(in.nextInt());                                //процент дополнительного урона
        first.boom();
        second.boom();
        third.boom();
    }
}