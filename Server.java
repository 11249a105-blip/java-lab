
import java.net.*;
import java.io.*;

class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5000);
            System.out.println("Server is waiting...");

            Socket s = ss.accept();
            System.out.println("Client connected");

            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                new InputStreamReader(s.getInputStream()));

            String msg = in.readLine();
            System.out.println("Client says: " + msg);

            out.println("Hello Client, message received!");

            s.close();
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
