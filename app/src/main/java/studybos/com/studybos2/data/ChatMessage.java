package studybos.com.studybos2.data;

import java.io.Serializable;

/**
 * Created by 机械革命 on 2018/10/17.
 */

public class ChatMessage implements Serializable {

    private String sender;
    private String getter;
    private String mess;
    private String date;


    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getSender() {
        return sender;
    }
    public void setSender(String sender) {
        this.sender = sender;
    }
    public String getGetter() {
        return getter;
    }
    public void setGetter(String getter) {
        this.getter = getter;
    }
    public String getMess() {
        return mess;
    }
    public void setMess(String mess) {
        this.mess = mess;
    }
}
