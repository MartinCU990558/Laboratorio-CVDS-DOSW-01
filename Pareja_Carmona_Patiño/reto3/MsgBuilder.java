package reto3;

import java.util.stream.IntStream;

public class MsgBuilder {
    public static String buildMessage(String msg) {
        StringBuilder sb = new StringBuilder();

        IntStream.range(0, 3)
                .forEach(i -> {
                    sb.append(msg);
                    if (i < 2) {
                        sb.append(" ");
                    }
                });

        return sb.toString();
    }
    public static String reverseMessage(String msg) {
        StringBuffer sb = new StringBuffer(msg);
        return sb.reverse().toString();
    }

    public static String combineFunctions(String msg) {
        String repeatedMessage = buildMessage(msg);
        String invertedMessage = reverseMessage(repeatedMessage);
        return invertedMessage;
    }
}