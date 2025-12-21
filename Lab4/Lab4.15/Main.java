import java.util.Scanner;

class AuditRecord {
    private final String user;
    private final String[] logMessages;
    private static int maxMessages = 3;

    public AuditRecord(String user) {
        this(user, new String[0]);
    }

    public AuditRecord(String user, String[] logs) {
        this.user = user;
        int size = Math.min(logs.length, maxMessages);
        this.logMessages = new String[size];
        for (int i = 0; i < size; i++) {
            this.logMessages[i] = logs[logs.length - size + i];
        }
    }

    public static void setPolicy(int max) {
        if (max > 0) {
            maxMessages = max;
            System.out.println("Policy set to " + max);
        } else {
            System.out.println("Invalid policy.");
        }
    }

    public AuditRecord addMessage(String message) {
        if (this.logMessages.length < maxMessages) {
            String[] newLogs = new String[this.logMessages.length + 1];
            for (int i = 0; i < this.logMessages.length; i++) {
                newLogs[i] = this.logMessages[i];
            }
            newLogs[this.logMessages.length] = message;
            System.out.println(message + " added.");
            return new AuditRecord(this.user, newLogs);
        } else {
            System.out.println("Log is full.");
            return this;
        }
    }

    public void displayLog() {
        System.out.print("User: " + user + ", Logs: " + logMessages.length + " [");
        for (int i = 0; i < logMessages.length; i++) {
            System.out.print(logMessages[i] + (i == logMessages.length - 1 ? "" : ", "));
        }
        System.out.println("]");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            AuditRecord.setPolicy(sc.nextInt());
        }

        String username = sc.next();
        AuditRecord record = new AuditRecord(username);

        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                String msg = sc.next();
                record = record.addMessage(msg);
            }
        }

        record.displayLog();
        sc.close();
    }
}