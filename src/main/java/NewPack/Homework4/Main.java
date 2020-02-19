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
        Human father = new Human();
        father.name ="James";
        father.surname ="Nielson";

        Human mother = new Human();
        mother.name = "Violet";
        mother.surname = "Nielson";

        Pet pet = new Pet("dog","Beethoven",5, (short) 55, new String[]{"eat", "drink", "sleep"});

        Human child = new Human("Fred", "Nielson",2000, (short) 100, mother,father,pet);

        child.father = father;
        child.mother = mother;

        CallAllMethods(child);
    }
}
