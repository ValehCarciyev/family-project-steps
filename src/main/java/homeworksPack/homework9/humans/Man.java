package homeworksPack.homework9.humans;

import homeworksPack.homework9.enums.Species;

public class Man extends Human {
    public Man(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void greetPet() {
        System.out.printf("I'm a man. Hello, %s!\n", Species.DOMESTICCAT);
    }

    public void repairCar() {
        System.out.println("I'm a man, I repair my car by myself\n");
    }
}
