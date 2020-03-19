package bookingProject.service;

import bookingProject.Database;
import bookingProject.entity.Booking;
import bookingProject.entity.Flight;
import bookingProject.entity.Passenger;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class AppService {

  private final Database db;

  public AppService(Database db) {
    this.db = db;
  }

  public Collection<Flight> getAllFlightsByDaily() {
    return db.flights.getAllBy(f -> LocalDateTime.now().plusDays(10).isAfter(f.getDate()));
  }

  public Collection<Flight> getAllFlights() {
    return db.flights.getAll();
  }

  public Flight getFlight(int id) {
    Collection<Flight> allFlights = getAllFlights();
    Flight flight = null;
    for (Flight flights: allFlights) {
      if(flights.getId() == id) flight = flights;
    }
    return flight;
  }

  public void makeBooking(int flightId, List<Passenger> passengers){
    Booking booking = new Booking(flightId, passengers);
    db.bookings.create(booking);
  }

  public Collection<Booking> getAllBookings() {
    return db.bookings.getAll();
  }

  public void cancelBooking(int id){
    db.bookings.delete(id);
  }


}
