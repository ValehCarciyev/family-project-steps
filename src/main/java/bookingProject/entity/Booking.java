package bookingProject.entity;

import bookingProject.dao.Identifiable;

import java.io.Serializable;
import java.util.List;

public class Booking implements Identifiable, Serializable {
  private long id;
  private long flight_id;
  private List<Passenger> passengers;

  static long counter = 0;

  public static void setCounter(long counter) {
    Booking.counter = counter;
  }

  private static final long serialVersionUID = 1L;

  public Booking( long flight_id, List<Passenger> passengers) {
    this(++counter, flight_id, passengers);
  }

  public Booking(long id, long flight_id, List<Passenger> passengers) {
    this.id = id;
    this.flight_id = flight_id;
    this.passengers = passengers;
  }

  @Override
  public long getId() {
    return id;
  }

  public long getFlight_id() {
    return flight_id;
  }

  public List<Passenger> getPassengers() {
    return passengers;
  }
}
