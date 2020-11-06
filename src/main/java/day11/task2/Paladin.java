package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack {
    // health (здоровье)
//    physDef (процент поглощения физического урона)
//    magicDef (процент поглощения магического урона)
//    physAtt (величина физической атаки), по необходимости
//    magicAtt (величина магической атаки), по необходимости

    public Paladin(){
        health = 100;
        physAtt = 15;
        phisDef = 50;//%
        magicDef = 20;//%

    }


    //-----------------heal------------
    @Override
    public void healHimself() {
        health += 25;
        System.out.println(toString());
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health += 10;
        System.out.println(toString());
    }

    //-------------Attack----------------
    @Override
    public void physicalAttack(Hero hero) {
        hero.health -= physAtt - (physAtt * hero.phisDef / 100);
        if (hero.health < 0){
            hero.health = 0;
        }
        System.out.println(hero.toString());

    }

    //------------------------------------
    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
