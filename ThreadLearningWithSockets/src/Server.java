import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;



public class Server {
	private static ServerSocket ss;
	private static Socket socket;
	private static int port = 555;
	public static String line;
	static InputStream instream;
	static DataInputStream datainstream;
	static OutputStream outstream;
	static DataOutputStream dataoutstream;
	static int Counter =1;
	
	
		
	
	public Server() throws IOException, InterruptedException{
		SpreadConnection();
		OpenInputStream();
		OpenOutStream();
		Run1();
		
		
		
		
	}
	public static void SpreadConnection() throws IOException{
		ss = new ServerSocket(port);
		socket = ss.accept();
		System.out.println("You get connection");}
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
	public static void WriteInGui() throws IOException{
		String line = getLine();
		if(line !=null){
			GuiForServer.lbl2.setText(getLine());
			
			
		}
	}
	public static void Run1() throws IOException{
		Runnable task1 = ()->{
			while(true){
			try {
				WriteInGui();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		};
		Thread tr1 = new Thread(task1);
		tr1.start();
		
	}
	
				
				
				
				
				
	
	
		
	}
