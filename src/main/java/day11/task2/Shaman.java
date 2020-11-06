package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack, PhysAttack {

    public Shaman() {
        health = 100;
        physAtt = 10;
        magicAtt = 15;
        phisDef = 20;//%
        magicDef = 20;//%
    }

    //-----------------heal------------
    @Override
    public void healHimself() {
        health += 50;
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health += 30;
        if (hero.health > 100) {
            hero.health = 100;
        }
        System.out.println(hero.toString());

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
    //-----------------------------------

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
