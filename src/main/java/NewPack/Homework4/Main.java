package NewPack.Homework4;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.surname = "Garayev";
        human.name = "Elbrus";
        human.year = 2000;
        human.iq = 100;

        human.pet.species = "dog";
        human.pet.nickname = "Beethoven";
        human.pet.age = 5;
        human.pet.trickLevel = 55;
        human.pet.habits = new String[]{"eat", "drink", "sleep"};

        human.father.name = "Akber";
        human.father.surname = "Garayev";
        human.father.year = 1970;
        human.father.iq = 100;
        human.father.pet.species = "dog";
        human.father.pet.nickname = "Beethoven";
        human.father.pet.age = 5;
        human.father.pet.trickLevel = 55;
        human.father.pet.habits = new String[]{"eat", "drink", "sleep"};

        human.mother.name = "Firuze";
        human.mother.surname = "Garayeva";
        human.mother.year = 1970;
        human.mother.iq = 100;
        human.mother.pet.species = "dog";
        human.mother.pet.nickname = "Beethoven";
        human.mother.pet.age = 5;
        human.mother.pet.trickLevel = 55;
        human.mother.pet.habits = new String[]{"eat", "drink", "sleep"};

        System.out.println(human.tostring());
    }
}
