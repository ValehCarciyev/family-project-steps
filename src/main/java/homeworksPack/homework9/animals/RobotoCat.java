package homeworksPack.homework9.animals;

import homeworksPack.homework9.animals.Pet;
import homeworksPack.homework9.enums.Species;

import java.util.Set;

public class RobotoCat extends Pet {
    public RobotoCat(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname,age,trickLevel,habits);
    }

    @Override
    public void respond() {
        System.out.printf("Hello, owner. I am - %s. I miss you!\n", Species.ROBOTOCAT);
    }
}
