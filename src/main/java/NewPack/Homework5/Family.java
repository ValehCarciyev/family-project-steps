package NewPack.Homework5;

import java.util.ArrayList;

public class Family {
    public static void main(String[] args) {
        ArrayList<Human> childs = new ArrayList<>();
        Human mother = new Human();
        mother.setName("Elizabeth");
        mother.setSurname("Nielson");
        Human father = new Human();
        father.setName("James");
        father.setSurname("Nielson");

        Pet pet = new Pet("dog","Beethoven",5, (short) 55,
                new String[]{"eat", "drink", "sleep"});

        Human children = new Human("Fred","Nielson",2000, (short) 100,
                new String[][]{{"Monday", "Go to sport"},{"Thursday",
                        "Go to course"}},father,mother,pet);

        children.setFather(father);
        children.setMother(mother);
        children.setPet(pet);

        addChild(children,childs);
        System.out.println(children.tostring());
        deleteChild(children, childs);
        System.out.println(childs.toString());
    }
    public static void addChild(Human child, ArrayList<Human> childs){
        childs.add(child);
        child.setFamily(child.getFamily());
            }
    public static boolean deleteChild(Human child, ArrayList<Human> childs){
        if(childs.indexOf(child)!=-1){
            childs.remove(child);
            return true;
        }
        else
            return false;
    }
}
