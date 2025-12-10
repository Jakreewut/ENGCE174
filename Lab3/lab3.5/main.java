import java.util.Scanner;

class DatabaseConnection {
    private String connectionString;
    
    private boolean connected;

    public DatabaseConnection(String connectionString) {
        this.connectionString = connectionString;
        this.connected = false; 
    }

    public boolean isConnected() {
        return this.connected;
    }

    public void connect() {
        if (!this.connected) { 
            this.connected = true; 
            System.out.println("Connected to [" + this.connectionString + "]"); 
        } else { 
            System.out.println("Already connected."); 
        }
    }


    public void disconnect() {
        if (this.connected) { 
            this.connected = false; 
            System.out.println("Disconnected."); 
        } else { 
            System.out.println("Already disconnected."); 
        }
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter name server (Connection String): ");
        String connectionString = scan.nextLine();

        DatabaseConnection db = new DatabaseConnection(connectionString);

        scan.close();
        
        db.connect();

        db.disconnect();

        db.disconnect();

        System.out.println(db.isConnected());
    }
}