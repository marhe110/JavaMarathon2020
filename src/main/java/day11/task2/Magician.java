package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {

    public Magician() {
        health = 100;
        physAtt = 5;
        magicAtt = 20;
        magicDef = 15;
    }

    //-------------Attack----------------
    @Override
    public void physicalAttack(Hero hero) {
        hero.health -= physAtt - (physAtt * hero.phisDef / 100);
        if (hero.phisDef > 0) {
        }
        System.out.println(hero.toString());

    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.health -= magicAtt - (magicAtt * hero.magicDef / 100);
        if (hero.phisDef > 0) {
        }
        System.out.println(hero.toString());
    }
    //___________________________________


    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
