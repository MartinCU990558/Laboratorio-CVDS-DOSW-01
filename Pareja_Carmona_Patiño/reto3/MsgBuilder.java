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
}