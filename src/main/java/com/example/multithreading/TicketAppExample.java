package com.example.multithreading;

import lombok.AllArgsConstructor;

class TicketApp{
	
	 int availableTickets;
	
	public void bookTicket(String customerName,int ticketsToBook) {
		if (availableTickets>=ticketsToBook) {
			availableTickets-=ticketsToBook;
			System.out.println(customerName+" , "+ticketsToBook + " tickets booked succesfully");
			System.out.println("Tickets left : "+availableTickets);
		}
		else {
			System.out.println("sorry "+customerName+" tickets not available");
		}
	}
}


@AllArgsConstructor
class BookingThread extends Thread{
	
	private TicketApp ticketApp;
	private String name;
	private int ticketsToBook;
	
	@Override
	public void run() {
		ticketApp.bookTicket(name, ticketsToBook);
	}
	
	
	
}

public class TicketAppExample {

	public static void main(String[] args) {
		TicketApp ticketApp = new TicketApp();
		ticketApp.availableTickets = 10;
		
		BookingThread Nasser = new BookingThread(ticketApp, "Nasser", 7);
		BookingThread Akshay = new BookingThread(ticketApp, "Akshay", 6);
//		BookingThread Mohit = new BookingThread(ticketApp, "Mohit", 3);
//		BookingThread Ayush = new BookingThread(ticketApp, "Ayush", 3);
		
		Nasser.start();
		Akshay.start();
//		Mohit.start();
//		Ayush.start();
		
	}
}
