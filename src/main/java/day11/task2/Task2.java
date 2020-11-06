package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior1 = new Warrior();
        Paladin paladin1 = new Paladin();
        Magician magician1 = new Magician();
        Shaman shaman1 = new Shaman();

        warrior1.physicalAttack(paladin1);
        paladin1.physicalAttack(magician1);
        shaman1.healTeammate(magician1);
        magician1.magicalAttack(paladin1);
        shaman1.physicalAttack(warrior1);
        paladin1.healHimself();

        warrior1.physicalAttack(magician1);
        warrior1.physicalAttack(magician1);
        warrior1.physicalAttack(magician1);
        warrior1.physicalAttack(magician1);
        warrior1.physicalAttack(magician1);


//        Воин атакует Паладина
//        Паладин атакует Мага
//        Шаман лечит Мага
//        Маг атакует Паладина, тип атаки М
//        Шаман атакует Воина, тип атаки Ф
//        Паладин лечит себя
//        Воин атакует Мага 5 раз
//
//        Результат в консоли:
//        Paladin{health=85}
//        Magician{health=85}
//        Magician{health=100}
//        Paladin{health=69}
//        Warrior{health=98}
//        Paladin{health=94}
//
//        Magician{health=70}
//        Magician{health=40}
//        Magician{health=10}
//        Magician{health=0}
//        Magician{health=0}

    }
}

