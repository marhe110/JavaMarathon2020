package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String UserName;

    // В этом списке должны храниться те пользователи, на которых подписан пользователь.
    List<User> subscriptions;

    public User(String userName) {
        UserName = userName;
        this.subscriptions = new ArrayList<>();
    }

    public String getUserName() {
        return UserName;
    }

    public List<User> getSubscriptions() {
        return subscriptions;

    }

    // подписывает пользователя на пользователя user
    public void subscribe(User user) {
        subscriptions.add(user);
    }

    //        возвращает True, если пользователь
//        подписан на пользователя user и False
    public boolean isSubscribed(User user) {
        for (User u : this.getSubscriptions()) {
            if (u.equals(user)) {
                return true;
            }
        }
        return false;

    }

    //    возвращает True, если пользователь user является другом и False,
//    если пользователь user не является другом. Подумайте,
//    что такое дружба в контексте соц. сетей.
//    подписаны друг на друга
    public boolean isFriend(User user) {
        if (this.isSubscribed(user) && user.isSubscribed(this)) {
            return true;
        }
        return false;
    }

    //    public void sendMessage(User user, String text) - отправляет сообщение с текстом text пользователю user.
    //    Здесь должен использоваться статический метод из MessageDatabase.
    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return getUserName();
    }
}

