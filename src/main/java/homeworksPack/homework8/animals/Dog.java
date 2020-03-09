package homeworksPack.homework8.animals;

import homeworksPack.homework8.Pet;
import homeworksPack.homework8.Species;

import java.util.Set;

public class Dog extends Pet {
    Species spec = Species.Dog;

    public Dog(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, (short) trickLevel, habits);
        setSpecies(Species.Dog);
    }


    @Override
    public void eat() {
        System.out.println("I like eating :)");
    }

    @Override
    public void foul() {
        System.out.println("Wuf Wuf!");
    }

    @Override
    public void respond() {
        System.out.println("Hello owner, I am " + super.getNickname() + ". I love you!");
    }
}
