package day11.task2;

public class Warrior extends Hero implements PhysAttack {
// health (здоровье)
//    physDef (процент поглощения физического урона)
//    magicDef (процент поглощения магического урона)
//    physAtt (величина физической атаки), по необходимости
//    magicAtt (величина магической атаки), по необходимости

    private int health = 100;
    private int physAtt = 30;
    //private int magicAtt = 0;
    private int phisDef = 80;
    //private int magicDef = 0;

    public int getHealth() {
        return health;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public int getPhisDef() {
        return phisDef;
    }

    @Override
    public void physicalAttack(Hero hero) {
        if (hero.phisDef > 0) {
            hero.health -= (physAtt * hero.phisDef) / 100;
            System.out.println(hero.toString());
        }
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}



