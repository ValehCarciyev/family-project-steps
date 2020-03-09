package homeworksPack.homework8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Family {
    private Human mother;
    private Human father;
    private List<Human> children = new ArrayList<>();
    private Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Family() {

    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public List getChildren() {
        return children;
    }

    public void setChildren(List children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Human h: children) s.append(h.toString());
        return "Family{" +
                "\nmother=" + mother.toString() +
                ",\n father=" + father.toString() +
                ",\n children=" + s +
                ",\n pet=" + pet.toString() +
                '}';
    }

    public static boolean findIndex(List arr, Human human) {
        if (arr == null) {
            return false;
        }
        int len = arr.size();
        int i = 0;

        while (i < len) {
            if (arr.get(i) == human) {
                return true;
            }
            else {
                i = i + 1;
            }
        }
        return false;
    }


    public void deleteChild(Human child) {
        children.remove(child);
        this.setChildren(children);
    }

    public void deleteChild(int index) {
        children.remove(index);
        this.setChildren(children);
    }

    public void addChild(Human child) {

        children.add(child);
        this.setChildren(children);
    }

    public int countFamily(){
        if(getFather() != null && getMother() != null)
            return children.size() + 2;
        else if(getFather() != null || getMother() != null)
            return children.size() + 1;
        else
            return children.size();
    }

    @Override
    public void finalize() {
        System.out.println("Family in the finalizer");
    }
}
