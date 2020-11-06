package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack, PhysAttack{

    private int health = 100;
    private int physAtt = 10;
    private int magicAtt = 15;
    private int phisDef = 20;//%
    private int magicDef = 20;//%

    //-----------------heal------------
    @Override
    public void healHimself() {
        health += 50;
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health += 30;
        toString();
    }
    //-------------Attack----------------
    @Override
    public void physicalAttack(Hero hero) {
        if (hero.phisDef > 0) {
            hero.health -= (physAtt * hero.phisDef) / 100;
            toString();
        }
    }

    @Override
    public void magicalAttack(Hero hero) {
        if (hero.magicDef > 0) {
            hero.health -= (magicAtt * hero.magicDef) / 100;
            hero.toString();
        }
    }
    //-----------------------------------

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
