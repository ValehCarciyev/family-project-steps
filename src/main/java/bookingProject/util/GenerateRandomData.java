package bookingProject.util;

import java.time.LocalDateTime;

public class GenerateRandomData {

    private final static String[] cities = {"Baku", "Lviv", "Kharkiv",
            "Delaware", "Abu-Dabi", "Dubai", "Ankara", "New-York", "Istanbul", "Oslo",
            "London", "Brasil", "Tokio", "Paris"};


    public static String randomCityFrom() {
        return "Kiev";
    }

    public static String randomCityTo() {
        return cities[rnd(cities.length)];
    }

    private static int rnd(int max) {
        return (int) (Math.random() * max);
    }

    public static int randomSeats() {
        return rnd(20) * 10 + 10;
    }

    public static LocalDateTime randomData() {
        return LocalDateTime.of(2020 + rnd(2),
                rnd(12) + 1,
                rnd(28) + 1,
                6 + rnd(18),
                rnd(12) * 5);
    }
}
