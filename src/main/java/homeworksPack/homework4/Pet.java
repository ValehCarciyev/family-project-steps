package homeworksPack.homework4;

import java.util.Arrays;

public class Pet {
    String species;
    String nickname;
    int age;
    short trickLevel;
    String[] habits = new String[10];

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
        String string = "";
        string += String.format("%s{nickname='%s', age=%d, trickLevel=%s, habits=%s}"
                , species, nickname, age, trickLevel, Arrays.toString(habits));
        return string;
    }
}
