package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack {
    // health (здоровье)
//    physDef (процент поглощения физического урона)
//    magicDef (процент поглощения магического урона)
//    physAtt (величина физической атаки), по необходимости
//    magicAtt (величина магической атаки), по необходимости
    private int health = 100;
    private int physAtt = 15;
    private int magicAtt = 0;
    private int phisDef = 50;//%
    private int magicDef = 20;//%

    //-----------------heal------------
    @Override
    public void healHimself() {
        health += 25;
        toString();
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health += 10;
        toString();
    }

    //-------------Attack----------------
    @Override
    public void physicalAttack(Hero hero) {
        if (hero.phisDef > 0) {
            hero.health -= (physAtt * hero.phisDef) / 100;
            hero.toString();
        }
    }

    //------------------------------------
    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
