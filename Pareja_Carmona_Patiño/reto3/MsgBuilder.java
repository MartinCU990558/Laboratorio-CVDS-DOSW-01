package reto3;

public class MsgBuilder {
    public static StringBuilder buildMessage(String msg) {
        StringBuilder newMessage = new StringBuilder(msg);
        newMessage.append(" " + msg);
        newMessage.append(" " + msg);
        newMessage.append(" " + msg);
        return  newMessage;
    }

}
