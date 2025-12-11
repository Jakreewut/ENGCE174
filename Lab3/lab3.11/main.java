import java.util.Scanner;

class SystemConfig {
    private static SystemConfig instance;

    private String serverUrl;
    private int maxConnections;

    private SystemConfig() {
        this.serverUrl = "default.server.com";
        this.maxConnections = 10;
    }

    public static SystemConfig getInstance() {
        if (instance == null) {
            instance = new SystemConfig();
        }
        return instance;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String url) {
        this.serverUrl = url;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(int count) {
        if (count > 0) {
            this.maxConnections = count;
            System.out.println("Max connections set.");
        } else {
            System.out.println("Invalid count.");
        }
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextLine()) return;
        int N = Integer.parseInt(scanner.nextLine()); 

        for (int i = 0; i < N; i++) {
            if (!scanner.hasNextLine()) break;
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("SET_URL")) {
                if (!scanner.hasNextLine()) break;
                String newUrl = scanner.nextLine();
                
                SystemConfig config = SystemConfig.getInstance();
                config.setServerUrl(newUrl);

            } else if (command.equalsIgnoreCase("SET_MAX")) {
                if (!scanner.hasNextLine()) break;
                int maxCount = Integer.parseInt(scanner.nextLine());
                
                SystemConfig config = SystemConfig.getInstance();
                config.setMaxConnections(maxCount);

            } else if (command.equalsIgnoreCase("SHOW")) {
                SystemConfig config = SystemConfig.getInstance();
                
                System.out.println("URL: " + config.getServerUrl());
                System.out.println("MAX: " + config.getMaxConnections());
            }
        }
        
        scanner.close();
    }
}