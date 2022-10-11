package coding.challenge;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Running P2 java process...");
		Socket s;
		try {
			s=new Socket("127.0.0.1",4444);
			String message;
			DataInputStream din=new DataInputStream(s.getInputStream());
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			while(true)
			{
				message=din.readUTF();
				dout.writeUTF(message+"1");			
			}
				
				
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
