package coding.challenge;

	//Driver class
	 public class Main{
	 	public static void main(String[] args) {
	 		// TODO Auto-generated method stub
	 		System.out.println("=================================\nBelow is single java process example of coding task.\n=================================\n");
	 		Player p1 =new Player();
	 		Player p2 =new Player();
	 		System.out.println("Created 2 instances of Player class.\nP1\tP2");
	 		System.out.println("P1 is initiator instance.\n");
	 		System.out.println("Below is first initiating message sent by P1.\nMessage= "+Player.message+"\n");
	 		while(true) {
	 			if(Player.counter<=10) {	
	 				p1.sendMessage("P1");
	 				p2.recieveMessage("P2");
	 				p2.sendMessage("P2");
	 				p1.recieveMessage("P1");				
	 				Player.counter++;
	 			}
	 			else {
	 				System.out.println("\nInitiator sent "+(Player.counter-1)+" messages and recieved "+(Player.counter-1)+" messages.\nTerminating the program.\nExited.");	
	 				break;
	 			}	
	 		}
	 		System.out.println("=================================\nBelow is different java processes example of coding task.\n=================================\n");

	 	}
	 }