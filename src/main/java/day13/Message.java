package day13;

import java.util.Date;

public class Message {
     private User sender;
     private User receiver;
     private String text;
     private Date date;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date();
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

//    public void setDate(String date) {
//        Date = date;
//    }

    @Override
    public String toString() {
        return  "FROM: " + sender +
                ", TO: " + receiver +
                ", ON: '" + date + '\'' +
                text + '\'';
//        FROM: 'Имя отправителя'
//        TO: 'Имя получателя'
//        ON: Sun Aug 30 19:07:34 MSK 2020
//        'Текст сообщения'
//
    }
}