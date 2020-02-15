package NewPack.Homework5;

import java.util.Arrays;

public class Human {
    private String name;
    private String surname;
    private int year;
    private short iq;
    private Pet pet = new Pet();
    private Human father;
    private Human mother;
    private String[][] schedule;
    private Family family = new Family();

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

    public int getYear() {
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

    public void GreetPet(){
        System.out.println("Hello, " + pet.getNickname());
    }
    /*public void DescribePet(){
        System.out.print("I have a " + pet.getNickname() + ", he is " + pet.getAge() + " years old, he is");
        if(pet.getTrickLevel() >= 50){
            System.out.print(" very sly");
        }
        else{
            System.out.print("almost not sly");
        }
    }*/
    public Human(String name, String surname, int year, short iq, Human father, Human mother){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet.setNickname(pet.getNickname());
        this.pet.setSpecies(pet.getSpecies());
        this.pet.setAge(pet.getAge());
        this.pet.setTrickLevel(pet.getTrickLevel());
        this.pet.setHabits(pet.getHabits());
        this.father = father;
        this.mother = mother;
    }
    /*public Human(String name, String surname, int year, Human father, Human mother){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.father = father;
        this.mother= mother;
    }
    public Human(String name, String surname, int year){
        this.name = name;
        this.surname = surname;
        this.year = year;
    }
    public Human() {
    }*/
    public String tostring(){
        String string = "";
        string += String.format("Human{name='%s', surname='%s', year=%d, iq=%s, schedule=%s}"
                , name, surname, year, iq, Arrays.deepToString(schedule));
        return string;
    }

}

