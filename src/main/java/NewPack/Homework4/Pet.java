package NewPack.Homework4;

import java.util.Arrays;
import java.util.Objects;

public class Pet {
    String species;
    String nickname;
    int age;
    short trickLevel;
    String[] habits = new String[10];
    public void eat(){
        System.out.println("I am eating!");
    }
    public void respond(){
        System.out.println("Hello owner, I am " + nickname + ". I miss you!");
    }
    public void foul(){
        System.out.println("I need to cover it up");
    }
    public Pet(String species, String nickname){
        this.species = species;
        this.nickname = nickname;
    }
    public Pet(String species, String nickname, int age, short trickLevel, String[] habits){
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }
    public Pet(){

    }
    public String tostring(){
        String string = "";
        string += String.format("%s{nickname='%s', age=%d, trickLevel=%s, habits=%s}"
                , species, nickname, age, trickLevel, Arrays.toString(habits));
        return string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age &&
                trickLevel == pet.trickLevel &&
                species.equals(pet.species) &&
                nickname.equals(pet.nickname) &&
                Arrays.equals(habits, pet.habits);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(species, nickname, age, trickLevel);
        result = 31 * result + Arrays.hashCode(habits);
        return result;
    }
}
