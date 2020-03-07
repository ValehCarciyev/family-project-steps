package homeworksPack.homework4;

public class Main {
    private static void callAllMethods(Human child) {
        child.greetPet();
        child.describePet();
        System.out.println(child.toString());
        child.pet.eat();
        child.pet.respond();
        child.pet.foul();
        System.out.println(child.pet.toString());
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

        callAllMethods(child);
    }
}
