package homeworksPack.homework10.animals;

import homeworksPack.homework10.enums.Species;

import java.util.Set;

public class Fish extends Pet {
    public Fish(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname,age,trickLevel,habits);
    }

    @Override
    public void eat() {
        System.out.println("I can eat!");
    }

    @Override
    public void respond() {
        System.out.printf("Hello, owner. I am - %s. I miss you!\n", Species.FISH);
    }
}
