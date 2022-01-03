package task;

import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Message {
    String importantMessage;

    public static ConcurrentLinkedDeque<String> messages = new ConcurrentLinkedDeque<>();
    public String getImportantMessage() {
        return importantMessage;
    }

    public void setImportantMessage(String importantMessage) {
        this.importantMessage = importantMessage;
    }
}
