package homeworksPack.homework4;

public class Human {
    String name;
    String surname;
    int year;
    short iq;
    Pet pet = new Pet();
    Human father;
    Human mother;
    String[][] schedule = new String[7][1];

    public Human(String name, String surname, int year, short iq, Human father, Human mother, Pet pet){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet.nickname = pet.nickname;
        this.pet.species = pet.species;
        this.pet.age = pet.age;
        this.pet.trickLevel = pet.trickLevel;
        this.pet.habits = pet.habits;
        this.father = father;
        this.mother = mother;
    }
    public Human(String name, String surname, int year, Human father, Human mother){
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
    }

    public void greetPet(){
        System.out.println("Hello, " + pet.nickname);
    }
    public void describePet(){
        System.out.printf("I have a %s, he is %d years old, he is", pet.species, pet.age);
        if(pet.trickLevel >= 50){
            System.out.print(" very sly\n");
        }
        else{
            System.out.print("almost not sly\n");
        }
    }

    @Override
    public String toString(){

        return String.format("Human{name='%s', surname='%s', year=%d, iq=%s, mother=%s %s, father=%s %s, pet=%s}"
                , name, surname, year, iq, mother.name, mother.surname, father.name, father.surname, pet.toString());
    }
}
