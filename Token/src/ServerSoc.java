import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSoc {
	
	public static void main(String args[]) throws IOException{
		
		System.out.println("server started");
		ServerSocket soc=new ServerSocket(8090);
		
		System.out.println("connected");
		Socket s=soc.accept();
		
		System.out.println("client connected");
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
	String str=	br.readLine();
		
	System.out.println("data for client"+"  "+ str);
	}

}
