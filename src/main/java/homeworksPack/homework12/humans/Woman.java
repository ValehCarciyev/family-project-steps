package homeworksPack.homework12.humans;

import homeworksPack.homework12.enums.Species;

public class Woman extends Human {
    public Woman(String name, String surname, String birthdate) {
        super(name, surname, birthdate);
    }

    public Woman(String name, String surname, String birthDate, int IQ) {
        super(name, surname, birthDate, IQ);
    }

    @Override
    public void greetPet() {
        System.out.printf("I'm a woman. Hello, %s!\n", Species.DOG);
    }

    public void makeup() {
        System.out.println("I'm a woman, I'm spending 1 hour doing makeup every day\n");
    }
}
