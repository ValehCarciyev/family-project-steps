package bookingProject.controller;

import bookingProject.entity.Booking;
import bookingProject.entity.Flight;
import bookingProject.entity.Passenger;
import bookingProject.io.Console;
import bookingProject.service.AppService;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AppController {
    private final Console console;
    private final AppService service;

    public AppController(Console console, AppService service) {
        this.console = console;
        this.service = service;
    }


    public void cancelBooking() {
        myBookings();
        Collection<Booking> allBookings = service.getAllBookings();
        if(!allBookings.isEmpty()){
            console.print("Enter the ID of you want cancel: ");
            String id = console.readLn();
            service.cancelBooking(Integer.parseInt(id));
            console.printLn("Booking canceled!");
        }
        else console.printLn("You don't have any bookings!");
    }

    public void myBookings() {
        Collection<Booking> allBookings = service.getAllBookings();
        Collection<Flight> allFlights = service.getAllFlightsByDaily();
        for (Booking b : allBookings) {
            for (Flight f : allFlights) {
                if (b.getFlight_id() == f.getId()) console.printLn(f.represent());
            }
        }
    }

    public void searchAndMakeBooking() {
        Collection<Flight> allFlights = service.getAllFlights();
        List<Passenger> passengers = new ArrayList<>();
        console.print("Enter the destination: ");
        String destination = console.readLn();
        console.print("Enter the date: ");
        String date = console.readLn();
        console.print("Enter the passengers' count: ");
        String passCount = console.readLn();

        int size = allFlights.size();
        for (Flight f : allFlights) {
            if (f.getCityTo().equals(destination) && f.getDate().format(DateTimeFormatter.ofPattern("YYYY-MM-dd hh:mm")).equals(date)
                    && f.getSeats() >= Integer.parseInt(passCount)) {
                console.printLn(f.represent());
            } else size--;
        }
        if (size == 0) console.printLn("No flight were found matching these criteria!");
        else {
            console.printLn("1. Book a flight\n" +
                    "2. Exit");
            String choice = console.readLn();
            switch (choice) {
                case "1":
                    for (int i = 0; i < Integer.parseInt(passCount); i++) {
                        console.print("Enter the " + i + "th passenger name and surname: ");
                        String name = console.readLn();
                        String surname = console.readLn();
                        Passenger passenger = new Passenger(name, surname);
                        passengers.add(passenger);
                    }
                    console.print("Enter the flight ID which you want book: ");
                    String id = console.readLn();
                    service.makeBooking(Integer.parseInt(id), passengers);
                    break;
                case "2":
                    System.gc();
                    break;
                default:
                    console.printLn("Wrong choice!");
            }
        }
    }

    public void showAllFlights() {
        Collection<Flight> allFlights = service.getAllFlightsByDaily();
        allFlights.forEach(f -> console.printLn(f.represent()));
    }

    public void getFlightByID() {
        console.print("Enter the flight ID: ");
        String id = console.readLn();
        console.printLn(service.getFlight(Integer.parseInt(id)).represent());
    }
}
