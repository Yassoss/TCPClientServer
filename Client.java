import java.net.*;
import java.io.*;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client{
	public static void main(String[] args) throws IOException{
		System.out.println("Hello World!");
		//Istanza della classe "Socket"
		Socket socket = new Socket();
		//Assegnazione dell'IP locale, della porta su cui comunicare e del timeout (in millisecondi)
   		socket.connect(new InetSocketAddress("127.0.0.1", 5001), 1000);
    		System.out.println("Connessione avvenuta con successo!");
	}
}
