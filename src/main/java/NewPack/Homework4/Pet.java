package NewPack.Homework4;

import java.sql.SQLOutput;

public class Pet {
    String species;
    String nickname;
    int age;
    short trickLevel;
    String[] habits = new String[10];
    public void eat(){
        System.out.println("I am eating!");
    }
    public void respond(String name){
        System.out.println("Hello owner, I am " + name + ". I miss you!");
    }
    public void foul(){
        System.out.println("I need to cover it up");
    }
    public Pet(String spec, String name){
        species = spec;
        nickname = name;
    }
    public Pet(String spec, String name, int age, short trick, String[] habit){
        species = spec;
        nickname = name;
        this.age = age;
        trickLevel = trick;
        for (String s : habits = habit) {

        }
    }
    public Pet(){

    }
}
