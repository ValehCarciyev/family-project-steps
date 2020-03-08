package homeworksPack.homework7;

import java.util.Arrays;
import java.util.Objects;

public abstract class Pet {
    private Species species;
    private String nickname;
    private int age;
    private short trickLevel;
    private String[] habits;

    public Pet(String nickname, int age, short trickLevel, String[] habits){
        this.species = Species.Unknown;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTrickLevel(short trickLevel) {
        this.trickLevel = trickLevel;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public Species getSpecies() {
        return species;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public short getTrickLevel() {
        return trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void eat(){
        System.out.println("I am eating!");
    }
    public void respond(){
        System.out.println("Hello owner, I am " + nickname + ". I miss you!");
    }
    public void foul(){
        System.out.println("I need to cover it up");
    }

    public String toString(){
        return String.format("%s{nickname='%s', age=%d, trickLevel=%s, habits=%s}"
                , species, nickname, age, trickLevel, Arrays.toString(habits));
    }

    @Override
    public void finalize() {
        System.out.println("Removing " + this.toString());
        try {
            super.finalize();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
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
