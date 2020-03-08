package homeworksPack.homework7.animals;

import homeworksPack.homework7.Pet;
import homeworksPack.homework7.Species;

public class DomesticCat extends Pet {

    public DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
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
