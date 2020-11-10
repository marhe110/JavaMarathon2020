//В методе main() этого класса необходимо создать трех пользователей.
//        Затем необходимо:
//        Отправить 2 сообщения от пользователя 1 пользователю 2
//        Отправить 3 сообщения от пользователя 2 пользователю 1
//        Отправить 3 сообщения от пользователя 3 пользователю 1
//        Отправить 3 сообщения от пользователя 1 пользователю 3
//        Отправить 1 сообщение от пользователя 3 пользователю 1
//
//        Сообщения могут быть любыми.
//        После этого, необходимо вывести диалог пользователя 1 и пользователя 3 с помощью метода showDialog().

        package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Алексей");
        User user2 = new User("Иван");
        User user3 = new User("Миша");

        user1.subscribe(user2);//подписывает user1 на user2
        user2.subscribe(user1);//подписывает user1 на user2

        user1.sendMessage(user2, "Привет! " + user2);
        user1.sendMessage(user2, "Как дела? ");
        user2.sendMessage(user1, "Привет! " + user1);

        user2.sendMessage(user1, "Все хорошо, решил все задачи марафона");
        user2.sendMessage(user1, "Весь день проскартинирую .");

        user1.sendMessage(user3, "Привет "+ user3);
        user1.sendMessage(user3, "Как дела? ");
        user1.sendMessage(user3, "А чем ты занимаешься");

        user3.sendMessage(user1, "Привет " + user1);
        user3.sendMessage(user1, "Я, весь день в работе ");
        user3.sendMessage(user1, "В марафоне отстаю, надо догонять " + user1);

        MessageDatabase.showDialog(user1, user3);
//        Отправить 2 сообщения от пользователя 1 пользователю 2
//        Отправить 3 сообщения от пользователя 2 пользователю 1
//        Отправить 3 сообщения от пользователя 3 пользователю 1

//        Отправить 3 сообщения от пользователя 1 пользователю 3
//        Отправить 1 сообщение от пользователя 3 пользователю 1
//
//        Сообщения могут быть любыми.
//        После этого, необходимо вывести диалог пользователя 1 и пользователя 3 с помощью метода showDialog().


    }
}
