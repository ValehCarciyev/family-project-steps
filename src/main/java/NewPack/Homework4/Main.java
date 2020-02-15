package NewPack.Homework4;

public class Main {
    private static void CallAllMethods(Human child) {
        child.GreetPet();
        child.DescribePet();
        System.out.println(child.tostring());
        child.pet.eat();
        child.pet.respond();
        child.pet.foul();
        System.out.println(child.pet.tostring());
    }
    public static void main(String[] args) {
        Human child = new Human();
        Human father = new Human();
        Human mother = new Human();
        child.surname = "Garayev";
        child.name = "Elbrus";
        child.year = 2000;
        child.iq = 100;

        father.name ="Akber";
        father.surname ="Garayev";

        mother.name = "Firuze";
        mother.surname = "Garayeva";

        child.father = father;
        child.mother = mother;

        child.pet.species = "dog";
        child.pet.nickname = "Beethoven";
        child.pet.age = 5;
        child.pet.trickLevel = 55;
        child.pet.habits = new String[]{"eat", "drink", "sleep"};

        CallAllMethods(child);
    }
}
