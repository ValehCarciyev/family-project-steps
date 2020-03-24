package homeworksPack.homework6;

import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int year;
    private short iq;
    private Pet pet = new Pet();
    private Human father;
    private Human mother;
    private String[][] schedule;
    private Family family;

    public Human(String name, String surname, int year, short iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    public Human() {

    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
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

    public void setyear(int year) {
        this.year = year;
    }

    public void setIq(short iq) {
        this.iq = iq;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getyear() {
        return year;
    }

    public short getIq() {
        return iq;
    }

    public Pet getPet() {
        return pet;
    }

    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void greetPet(){
        System.out.println("Hello, " + pet.getNickname());
    }

    public String toString(){
        return String.format("Human{name='%s', surname='%s', year=%d, iq=%s, schedule=%s}"
                , name, surname, year, iq, Arrays.deepToString(schedule));
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
                pet.equals(human.pet) &&
                father.equals(human.father) &&
                mother.equals(human.mother) &&
                Arrays.equals(schedule, human.schedule) &&
                family.equals(human.family);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, year, iq, pet, father, mother, family);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
    }

    @Override
    public void finalize() {
        System.out.println("Human in the finalizer");
    }
}
