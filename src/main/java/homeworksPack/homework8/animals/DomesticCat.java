package homeworksPack.homework8.animals;

import homeworksPack.homework8.Pet;
import homeworksPack.homework8.Species;

import java.util.Set;

public class DomesticCat extends Pet {

    public DomesticCat(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, (short) trickLevel, habits);
        setSpecies(Species.Cat);
    }
    @Override
    public void eat() {
        System.out.println("What you want?");
    }


    @Override
    public void foul() {
        System.out.println("Miauuuuu!");
    }

    @Override
    public void respond() {
        System.out.println("Hello owner, I am " + super.getNickname() + ". I hate you!");
    }
}
