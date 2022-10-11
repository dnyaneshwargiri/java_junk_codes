package coding.challenge;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class P1 {
    private static Socket          socket   = null;
    private static ServerSocket    ss   = null;
    private static DataInputStream in       =  null;
    private static DataOutputStream out     = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Running P1 java process...");
        try
        {
            ServerSocket ss = new ServerSocket(4444);
            socket = ss.accept();
            in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            out    = new DataOutputStream(socket.getOutputStream());
            String line = "";
            int counter=0;
			while (counter<10)
            {
            		line = in.readUTF(); 
                    System.out.println("At P1 reciedved- "+line);
                    line=line+"e";
                    out.writeUTF(line);
            }
            System.out.println("Closing connection");
            socket.close();
            in.close();
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
	}
}
