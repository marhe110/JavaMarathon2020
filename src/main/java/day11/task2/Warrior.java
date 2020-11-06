package day11.task2;

public class Warrior extends Hero implements PhysAttack {
// health (здоровье)
//    physDef (процент поглощения физического урона)
//    magicDef (процент поглощения магического урона)
//    physAtt (величина физической атаки), по необходимости
//    magicAtt (величина магической атаки), по необходимости

    public Warrior(){
        health = 100;
        physAtt = 30;
        phisDef = 80;
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.health -= physAtt - (physAtt * hero.phisDef / 100);
        if (hero.health < 0) {
            hero.health = 0;
        }
        System.out.println(hero.toString());

    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}



