package assignment1;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int ticketPrice=400;
   int noOfTicket=11;
   int total=0;
   if(noOfTicket<=10) {
	   total=400*noOfTicket;
   }
   else {
	 total = (400*noOfTicket)-(400*noOfTicket*(10)/100); 
   }
   System.out.println(total);
	}
	
}
