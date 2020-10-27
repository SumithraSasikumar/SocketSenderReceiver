import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketExample {
	
	
	public static void main(String args[]) throws UnknownHostException, IOException{
		
		
		String ip="localhost";
		int port=8090;
		Socket socket=new Socket(ip,port);
		
		String str="hi";
		OutputStreamWriter writer=new OutputStreamWriter(socket.getOutputStream());
		PrintWriter wr=new PrintWriter(str);
		writer.write(str);
		
		writer.flush();
		
	}

}
