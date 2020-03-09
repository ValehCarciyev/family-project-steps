package homeworksPack.homework8.animals;

import homeworksPack.homework8.Pet;
import homeworksPack.homework8.Species;

import java.util.Set;

public class RoboCat extends Pet {

    public RoboCat(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, (short) trickLevel, habits);
        setSpecies(Species.Cat);
    }

    @Override
    public void eat() {
        System.out.println("Life is veeery boring, but Java not! :)");
    }

    @Override
    public void foul() {
        System.out.println("Lets code!");
    }


    @Override
    public void respond() {
        System.out.println("Hello owner, I am " + super.getNickname() + ". Oh damn it! Here we go again!");
    }
}
