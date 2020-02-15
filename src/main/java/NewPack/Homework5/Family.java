package NewPack.Homework5;

import java.util.ArrayList;

public class Family {
    public static void main(String[] args) {
        Human mother = new Human();
        Human father = new Human();
        Human children = new Human();
        Pet pet = new Pet();
        children.setName("Elbrus");
        children.setSurname("Garayev");
        children.setYear(2000);
        children.setIq((short)100);
        children.setSchedule(new String[][]{{"Monday", "Go to sport"},{"Thursday", "Go to course"}});

        mother.setName("Firuze");
        mother.setSurname("Garayeva");

        father.setName("Akber");
        father.setSurname("Garayev");

        pet.setSpecies("dog");
        pet.setNickname("Beethoven");
        pet.setAge(5);
        pet.setTrickLevel((short)70);
        pet.setHabits(new String[]{"eat", "drink", "sleep"});

        children.setFather(father);
        children.setMother(mother);
        children.setPet(pet);



        System.out.println(children.tostring());
    }
    public void addChild(Human child){
        ArrayList<Human> childs = new ArrayList<>();
        childs.add(child);
        child.setFamily(this);
            }
    public boolean deleteChild(Human child){

        return true;
    }
}
