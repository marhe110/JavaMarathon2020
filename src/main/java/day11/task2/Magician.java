package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack{
    private int health = 100;
    private int physAtt = 5;
    private int magicAtt = 20;
    private int phisDef = 0;//%
    private int magicDef = 15;//%


    //-------------Attack----------------
    @Override
    public void physicalAttack(Hero hero) {
        if (hero.phisDef > 0) {
            hero.health -= (physAtt * hero.phisDef) / 100;
            hero.toString();
        }
    }

    @Override
    public void magicalAttack(Hero hero) {
        if (hero.phisDef > 0) {
            hero.health -= (magicAtt * hero.magicDef) / 100;
            hero.toString();
        }
    }
    //___________________________________


    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
