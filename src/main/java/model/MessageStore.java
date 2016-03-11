package model;

/**
 * Created by jesa on 10.03.2016.
 */

public class MessageStore {
    private String message;

    public MessageStore(){
        setMessage("Aloha_is_here");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}