package action;

import model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by jesa on 09.03.2016.
 */
public class SayAlohaAction extends ActionSupport{
    private static final long serialVersionUID = 1L;
    private MessageStore messageStore;

    public String execute() throws Exception {
        messageStore = new MessageStore();
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }

    public void setMessageStore(MessageStore messageStore) {
        this.messageStore = messageStore;
    }
}
