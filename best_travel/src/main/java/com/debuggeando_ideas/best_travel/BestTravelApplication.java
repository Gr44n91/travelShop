package com.debuggeando_ideas.best_travel;

import com.debuggeando_ideas.best_travel.domain.repositories.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
@Slf4j
public class BestTravelApplication implements CommandLineRunner {

	private final FlyRepository flyRepository;
	private final HotelRepository hotelRepository;
	private final CustomerRepository customerRepository;
	private final ReservationRepository reservationRepository;
	private final TicketRepository ticketRepository;
	private final TourRepository tourRepository;

	public BestTravelApplication(FlyRepository flyRepository,
								 HotelRepository hotelRepository,
								 CustomerRepository customerRepository,
								 ReservationRepository reservationRepository,
								 TicketRepository ticketRepository,
								 TourRepository tourRepository) {
		this.flyRepository = flyRepository;
		this.hotelRepository = hotelRepository;
		this.customerRepository = customerRepository;
		this.reservationRepository = reservationRepository;
		this.ticketRepository = ticketRepository;
		this.tourRepository = tourRepository;
	}


	public static void main(String[] args) {
		SpringApplication.run(BestTravelApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//UUID uuid = UUID.fromString("12345678-1234-5678-1234-567812345678");
		var fly = flyRepository.findById(15L).get();
		var hotel = hotelRepository.findById(7L).get();
		var customer = customerRepository.findById("VIKI771012HMCRG093");
		//var reservation = reservationRepository.findById(uuid).get();
		//var ticket = ticketRepository.findById(UUID.fromString("32345678-1234-5678-4234-567812345678"));
		var ticket = ticketRepository.findById(UUID.fromString("32345678-1234-5678-4234-567812345678"));

		log.info(String.valueOf(fly));
		log.info(String.valueOf(hotel));
		log.info(String.valueOf(customer));
		//log.info(String.valueOf(reservation));
		log.info(String.valueOf(ticket));



	}
}
