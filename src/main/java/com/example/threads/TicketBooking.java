package com.example.threads;

import lombok.AllArgsConstructor;
import lombok.Data;



@Data
@AllArgsConstructor
class TicketBookingClass {

	private Integer availbleTickets;
	
	public void bookTicket(Integer ticketsToBook, String name) {
		if (availbleTickets>=ticketsToBook) {
			
			availbleTickets-=ticketsToBook;
			System.out.println(ticketsToBook+ " booked Successfully! "+ name);
			System.out.println("tickets left "+availbleTickets);
			
		}
		else {
			System.out.println("no tickets available "+name);
			
		}
	}
	
	
}

@AllArgsConstructor
@Data
class MovieBookApp extends Thread{
	
	private String username;
	private Integer ticketsToBook;
	private TicketBookingClass ticketBooking;
	

	@Override
	public void run() {
		ticketBooking.bookTicket(ticketsToBook, username);
	}
	
}

public class TicketBooking{
	public static void main(String[] args) {
		TicketBookingClass ticketBookingClass = new TicketBookingClass(11);
		
		MovieBookApp nasser = new MovieBookApp("Nasser", 3, ticketBookingClass);
		MovieBookApp akshay = new MovieBookApp("Akshay", 3, ticketBookingClass);
		MovieBookApp sailesh = new MovieBookApp("Sailesh", 3, ticketBookingClass);
		MovieBookApp surya = new MovieBookApp("Surya", 3, ticketBookingClass);
		
		nasser.start();
		akshay.start();
		sailesh.start();
		surya.start();
	}
}
