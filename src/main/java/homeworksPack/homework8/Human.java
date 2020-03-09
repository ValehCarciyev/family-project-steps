package homeworksPack.homework8;

import java.util.Map;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int year;
    private short iq;
    private Human father;
    private Human mother;
    private Map<String, String> schedule;
    private Family family;
    public Human(String name, String surname, int year, short iq, Map schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    public Human() {

    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setIq(short iq) {
        this.iq = iq;
    }


    public void setFather(Human father) {
        this.father = father;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setSchedule(Map schedule) {
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public short getIq() {
        return iq;
    }


    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }

    public Map getSchedule() {
        return schedule;
    }

    public void GreetPet(){
        System.out.println("Hello, my Pet");
    }

    public String toString(){
        return String.format("Human{name='%s', surname='%s', year=%d, iq=%s, schedule=%s}"
                , name, surname, year, iq, schedule.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year &&
                iq == human.iq &&
                name.equals(human.name) &&
                surname.equals(human.surname) &&
                father.equals(human.father) &&
                mother.equals(human.mother) &&
                schedule.equals(human.schedule) &&
                family.equals(human.family);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, year, iq, father, mother, family);
        result = 31 * result + schedule.hashCode();
        return result;
    }

    @Override
    public void finalize()  {
        System.out.println("Human in the finalizer");
    }
}
