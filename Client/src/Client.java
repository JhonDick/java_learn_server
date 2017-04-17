import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	static String adress = "192.168.100.3";
	static int port = 555;
	static Socket socket;
	static String line = "asdasd";
	static InputStream instream;
	static DataInputStream datainstream;
	static OutputStream outstream;
	static DataOutputStream dataoutstream;
	public Client() throws IOException{
		getConnetcion();
		OpenInputStream();
		OpenOutStream();
		
		
	}
	//static ServerSocket ss;
	/*public static void main(String[] args) throws IOException{
		
		
		//Socket socket = new Socket();
		/*InetAddress inAdress = InetAddress.getByName(adress);
		System.out.println("Est kto?");
		 socket = new Socket(inAdress,port);
		System.out.println("Nawelsya servak!!!!!!");
		InputStream sin = socket.getInputStream();
        OutputStream sout = socket.getOutputStream();*/

// Конвертируем потоки в другой тип, чтоб легче обрабатывать текстовые сообщения.
        //DataInputStream in = new DataInputStream(sin);
        //DataOutputStream out = new DataOutputStream(sout);

        /*String line = null;
        while(true) {
          line = in.readUTF(); // ожидаем пока клиент пришлет строку текста.
          System.out.println("The dumb client just sent me this line : " + line);
          System.out.println("I'm sending it back...");
          out.writeUTF(line); // отсылаем клиенту обратно ту самую строку текста.
          out.flush(); // заставляем поток закончить передачу данных.
          System.out.println("Waiting for the next line...");
          System.out.println();
        }*/
     
  
		
		
		
		
	
	public static void getConnetcion() throws IOException{
		InetAddress inAdress = InetAddress.getByName(adress);
		System.out.println("Est kto?");
		 socket = new Socket(inAdress,port);
		System.out.println("Nawelsya servak!!!!!!");
	}
	public static void OpenOutStream() throws IOException{
		outstream = socket.getOutputStream();
		dataoutstream = new DataOutputStream(outstream);
		
		
		
	}
	public static void OpenInputStream() throws IOException{
		instream = socket.getInputStream();
		datainstream = new DataInputStream(instream);
	}
	public static void writeLine(String line) throws IOException{
		dataoutstream.writeUTF(line);
		dataoutstream.flush();
		
	}
	public static String getLine() throws IOException{
		return datainstream.readUTF();
	}


}
