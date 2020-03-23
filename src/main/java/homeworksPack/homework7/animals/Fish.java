package homeworksPack.homework7.animals;

import homeworksPack.homework7.Pet;
import homeworksPack.homework7.Species;

import java.util.Set;

public class Fish extends Pet {

    public Fish(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, (short) trickLevel, habits);
        setSpecies(Species.Fish);
    }
    @Override
    public void eat() {
        System.out.println("Why fishes can't speaking?");
    }

    @Override
    public void foul() {
        System.out.println("Blop blop");
    }


    @Override
    public void respond() {
        System.out.println("Hello owner, I am " + super.getNickname());
    }
}
