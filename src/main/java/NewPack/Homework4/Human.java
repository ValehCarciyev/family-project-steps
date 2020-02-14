package NewPack.Homework4;

public class Human {
    String name;
    String surname;
    int year;
    short iq;
    Pet pet = new Pet();
    Human mother = new Human();
    Human father = new Human();
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
    public Human(String name, String sname, int year, short iq, Human fath, Human moth){
        this.name = name;
        surname = sname;
        this.year = year;
        this.iq = iq;
        father = fath;
        mother = moth;
    }
    public Human(String name, String sname, int year){
        this.name = name;
        surname = sname;
        this.year = year;
    }
    public Human() {

    }
}
