import java.net.*;
import java.io.*;

public class Client 
{
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

	public static void main(String args[])
	{
		clientSocket = new Socket("127.0.0.1", 333);
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		out.println("Hello Server");
        String resp = in.readLine();
		in.close();
        out.close();
        clientSocket.close();
	}
}