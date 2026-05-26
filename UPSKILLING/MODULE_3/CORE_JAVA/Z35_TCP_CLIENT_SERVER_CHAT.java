package UPSKILLING.MODULE_3.CORE_JAVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Z35_TCP_CLIENT_SERVER_CHAT {
    public static void main(String[] args) throws Exception {
        Thread serverThread = new Thread(() -> {
            try (ServerSocket serverSocket = new ServerSocket(5001);
                 Socket clientSocket = serverSocket.accept();
                 BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                 PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {
                out.println("Hello from server");
                String message = in.readLine();
                System.out.println("Server received: " + message);
            } catch (Exception e) {
                System.out.println("Server error: " + e.getMessage());
            }
        });
        serverThread.start();
        Thread.sleep(500);
        try (Socket socket = new Socket("localhost", 5001);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {
            String greeting = in.readLine();
            System.out.println("Client received: " + greeting);
            out.println("Hello from client");
        }
        serverThread.join();
    }
}
