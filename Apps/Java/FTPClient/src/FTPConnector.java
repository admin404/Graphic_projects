import java.util.Scanner;
import java.io.Console;

//import java.io.IOException;
//import org.apache.commons.net.ftp.FTPClient;
//import org.apache.commons.net.ftp.FTPReply;

public class FTPConnector {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
        Console console = System.console();
        System.out.println("Enter Server Address");
//        String server =scan.nextLine();
        String server = console.readLine();

        System.out.println("Enter port to connect");
//        int port = scan.nextInt();
        int port = Integer.parseInt(console.readLine());

        System.out.println(server + ":" + port);

        System.out.println("Enter user name");
//        String user = scan.nextLine();
        String user = console.readLine();

        System.out.println("Enter password");
//        String passwd = scan.nextLine();
        String pass = console.readLine();

        System.out.println("User Name:\t"+user+"\nPassword:\t"+pass);
    }
}
