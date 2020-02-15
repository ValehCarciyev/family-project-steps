package NewPack.Homework4;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.surname = "Garayev";
        human.name = "Elbrus";
        human.year = 2000;
        human.iq = 100;
        Human human2 = new Human();
        human2.name ="ekber";
        human2.surname ="ekberli";
        Human human1 = new Human();
        human1.name = "Firuze";
        human1.surname = "Garayeva";

        human.pet.species = "dog";
        human.pet.nickname = "Beethoven";
        human.pet.age = 5;
        human.pet.trickLevel = 55;
        human.pet.habits = new String[]{"eat", "drink", "sleep"};

        human.father = human2;
        human.mother = human1;

        System.out.println(human.tostring());
    }
}
