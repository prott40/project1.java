
/**
 * <Proj1.java>
 * < Student Name / Section: 02B/ Day: Thursday/ Time: 3:30-5:20pm>
 * "EXTRA CREDIT INCLUEDED"
 * <The program is designed to take the users input of shirts and tickets.
 *  Then it multiplies the inputs by the set constant. 
 *  Then it adds the ticket fee and multiplies the entire sum by tax. 
 *  Finally it compare the cost of what you want to how much money you have saved and tells you whether you can afford it or not.">
 */


import java.util.Scanner;
public class Proj1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

double PRICETICKET = 948.00;// price of a ticket
double PRICETSHIRT = 49.00;//  price of a T-shirt
double TICKETFEE   = 29.99;//  price of ticket fee
double TAXRATE     = 9.20;//   tax rate 
double amountSaved;//          amount of money saved by user
int buyShirt;//                number of shirts wanting to purchase
int buyTicket;//               number of tickets wanting to purchase
double totalCost;
double taxCost;
Scanner scnr = new Scanner(System.in);
System.out.println("This program calculates the total price to attend a Taylor Swift concert");
System.out.println("and determines if an individual has enough money saved to attend.");
System.out.println();
System.out.println("It makes the following assumptions:");
System.out.printf("        Adult ticket cost:%.2f", PRICETICKET );
System.out.println();
System.out.printf("        Concert shirt cost:%.2f", PRICETSHIRT );
System.out.println();
System.out.printf("        Ticket Fee :%.2f", TICKETFEE  );
System.out.println();
System.out.printf("        Sales tax rate:%.2f%%", TAXRATE );
System.out.println();
System.out.print("How many tickets are you purchasing?");
buyTicket = scnr.nextInt();
System.out.print("How mant T-shirts are you planning to purchase?");
buyShirt = scnr.nextInt();
System.out.print("Enter in how much money you have saved: $");
amountSaved = scnr.nextDouble();
System.out.println();

totalCost = ((PRICETICKET * buyTicket)+(PRICETSHIRT * buyShirt)+ TICKETFEE );
TAXRATE = TAXRATE / 100.00;
taxCost = (totalCost * TAXRATE);

System.out.printf("Total cost before tax:$%.2f",totalCost);
System.out.println();
System.out.printf("Total tax:$%.2f", taxCost);
System.out.println();
totalCost = (totalCost + taxCost);
System.out.printf("Overall cost after tax:$%.2f",totalCost);
System.out.println();
System.out.println();
amountSaved = (amountSaved - totalCost);
System.out.printf("Amount left after all costs:$%.2f", amountSaved);
System.out.println();
if(amountSaved >= 0) {
	System.out.print("You have enough money! Have Fun!");
}
else {
	System.out.print("You do not have enough money!");
}

scnr.close();
}


	}
	

