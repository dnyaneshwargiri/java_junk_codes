package coding.challenge;

import java.util.Scanner;

//Player class to handle messaging logic
public class Player {
	
	 static int counter=1;
	 static String message="hello world";
	 public void sendMessage(String player){
		 //P1 is initiator
		 if(player=="P1") {
			
			 //Scanner sc=new Scanner(System.in);
			 //message=sc.next();
		 }	
		 System.out.println("At "+player+": Sending a message- ");
	 }
	 public void recieveMessage(String player){
		 System.out.println("At "+player+": Recieved message- "+message);
		 message=message+String.valueOf(counter);		 
	 }
	
}


