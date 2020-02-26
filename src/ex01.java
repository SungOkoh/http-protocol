import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ex01 {

	public static void main(String[] args) throws IOException {
			ServerSocket serversocket = new ServerSocket(80);
			
			Socket socket = serversocket.accept();
			
			OutputStream out = socket.getOutputStream();

			out.write(new String("Hello World").getBytes());
			
			socket.close();
		
	}
}
