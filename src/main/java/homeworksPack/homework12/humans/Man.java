package homeworksPack.homework12.humans;

import homeworksPack.homework12.enums.Species;

public class Man extends Human {
    public Man(String name, String surname, String birthdate) {
        super(name, surname, birthdate);
    }

    public Man(String name, String surname, String birthDate, int IQ) {
        super(name, surname, birthDate, IQ);
    }

    @Override
    public void greetPet() {
        System.out.printf("I'm a man. Hello, %s!\n", Species.DOMESTICCAT);
    }

    public void repairCar() {
        System.out.println("I'm a man, I repair my car by myself\n");
    }
}
