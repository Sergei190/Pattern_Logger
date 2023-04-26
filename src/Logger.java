import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger logger = null;
    private int numOfMessage = 1;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String msg) {
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        String text = time.format(formatter);
        LocalDateTime parsedDate = LocalDateTime.parse(text, formatter);
        System.out.printf("[%s %d] %s\n", formatter.format(parsedDate), numOfMessage, msg);
        numOfMessage++;
    }
}