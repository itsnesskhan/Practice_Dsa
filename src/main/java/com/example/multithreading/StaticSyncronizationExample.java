package com.example.multithreading;

import lombok.AllArgsConstructor;

class TicketApp2{
	
	 static int availableTickets;
	
	public static synchronized void bookTicket(String customerName,int ticketsToBook) {
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
class BookingThread2 extends Thread{
	
	private TicketApp2 ticketApp;
	private String name;
	private int ticketsToBook;
	
	@Override
	public void run() {
		ticketApp.bookTicket(name, ticketsToBook);
	}
	
	
	
}

public class StaticSyncronizationExample {

	public static void main(String[] args) {
		TicketApp2 ticketApp = new TicketApp2();
		ticketApp.availableTickets = 10;
		
		BookingThread2 Nasser = new BookingThread2(ticketApp, "Nasser", 7);
		BookingThread2 Akshay = new BookingThread2(ticketApp, "Akshay", 6);
		
		TicketApp2 ticketApp2 = new TicketApp2();
		ticketApp2.availableTickets = 10;
		
		BookingThread2 Mohit = new BookingThread2(ticketApp2, "Mohit", 6);
		BookingThread2 Ayush = new BookingThread2(ticketApp2, "Ayush", 5);
		
		Nasser.start();
		Akshay.start();
		Mohit.start();
		Ayush.start();
		
	}
}
