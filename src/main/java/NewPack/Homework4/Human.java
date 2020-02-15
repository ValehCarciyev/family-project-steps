package NewPack.Homework4;

public class Human {
    String name;
    String surname;
    int year;
    short iq;
    Pet pet = new Pet();
    Human father;
    Human mother;

    String[][] schedule = new String[7][1];

    public void GreetPet(){
        System.out.println("Hello, " + pet.nickname);
    }
    public void DescribePet(){
        System.out.print("I have a " + pet.species + ", he is " + pet.age + " years old, he is");
        if(pet.trickLevel >= 50){
            System.out.print(" very sly");
        }
        else{
            System.out.print("almost not sly");
        }
    }
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
    public String tostring(){
        String string = "";
        string += "Human{name='" + name + "', surname='" + surname + "', year=" + year
                + ", iq=" + iq + ", mother=" + mother.name + " " + mother.surname
                + ", father=" + father.name + " " + father.surname + ", pet="
                + pet.tostring() +"}";
        return string;
    }
}
