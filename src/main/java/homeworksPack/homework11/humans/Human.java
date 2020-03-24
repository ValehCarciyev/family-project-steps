package homeworksPack.homework11.humans;

import homeworksPack.homework11.enums.DaysOfWeek;
import homeworksPack.homework11.enums.Species;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Map;
import java.util.Objects;

public class Human {

    private String name;
    private String surname;
    private long birthdate;
    private int IQ;
    private Map<DaysOfWeek, String> schedule;


    public LocalDate getAge(){
        return Instant.ofEpochMilli(birthdate).atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public Human(String name, String surname, String birthDate, int IQ, Map<DaysOfWeek,String> schedule) {
        this.name = name;
        this.surname = surname;
        DateFormat format = new SimpleDateFormat("dd/MM/YYYY");
        try {
            Date date = format.parse(birthDate);
            this.birthdate = date.getTime();
        } catch (Exception e){
            System.out.println("Wrong date format");
        }
        this.IQ = IQ;
        this.schedule = schedule;
    }

    public Human(String name, String surname, String birthdate, int IQ) {
        this.name = name;
        this.surname = surname;
        DateFormat format = new SimpleDateFormat("dd/MM/YYYY");
        try {
            Date date = format.parse(birthdate);
            this.birthdate = date.getTime();
        } catch (Exception e){
            System.out.println("Wrong date format");
        }
        this.IQ = IQ;
    }

    public Human(String name, String surname, String birthdate) {
        this.name = name;
        this.surname = surname;
        DateFormat format = new SimpleDateFormat("dd/MM/YYYY");
        try {
            Date date = format.parse(birthdate);
            this.birthdate = date.getTime();
        } catch (Exception e){
            System.out.println("Wrong date format");
        }
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Human() { }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }
    public long getbirthdate() { return birthdate; }
    public void setbirthdate(int birthdate) { this.birthdate = birthdate; }
    public Map<DaysOfWeek,String> getSchedule() { return schedule; }
    public void setSchedule(Map<DaysOfWeek,String> schedule) { this.schedule = schedule; }

    public void greetPet() {
        System.out.printf("Hello, %s!", Species.UNKNOWN);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return birthdate == human.birthdate &&
                IQ == human.IQ &&
                name.equals(human.name) &&
                surname.equals(human.surname) &&
                schedule.equals(human.schedule);
    }

    public String describeAge() {
        return "Years: " + Period.between(getAge(), LocalDate.now()).getYears() +
                ", month: " + Period.between(getAge(), LocalDate.now()).getMonths() +
                ", days: " + Period.between(getAge(), LocalDate.now()).getDays();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthdate, IQ, schedule);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", year of birth: " + DateTimeFormatter.ofPattern("dd/MM/YYYY").format(getAge()) +
                ", schedule=" + getSchedule() +
                '}';
    }
}
