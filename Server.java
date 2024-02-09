import java.net.*;
import java.io.IOException;

public class Server {
  public static void main(String[] args) throws IOException {
    //Creazione dell'istanza "socket"
    ServerSocket serverSocket = new ServerSocket(5001);
    System.out.println("In ascolto per i Client...");
    Socket clientSocket = serverSocket.accept();
    String clientSocketIP = clientSocket.getInetAddress().toString();
    int clientSocketPort = clientSocket.getPort();
    System.out.println("[IP: " + clientSocketIP + " ,Porta: " + clientSocketPort +"]  " + " Connessione al Client avvenuta con successo");
  }
}
