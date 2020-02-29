package NewPack.Homework5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Family {

    private Human mother;
    private Human father;
    private ArrayList<Human> children = new ArrayList<>();
    private Pet pet;

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

    public ArrayList<Human> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Human> children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Human h: children) {
            s.append(h.tostring());
        }
        return "Family{" +
                "\nmother=" + mother.tostring() +
                ",\n father=" + father.tostring() +
                ",\n children=" + s +
                ",\n pet=" + pet.tostring() +
                '}';
    }

    public Family(Human mother, Human father, ArrayList<Human> children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void deleteChild(Human child) {
        ArrayList<Human> curChild = this.children;
        ArrayList<Human> newchilds = new ArrayList<>();
        int newCount = 0;
        for (Human currentChild : curChild) {
            if (!currentChild.equals(child)) {
                newchilds.add(currentChild);
            }
        }
        this.setChildren(newchilds);
    }

    public void addChild(Human child) {
        int newCount = 0;
        ArrayList<Human> newchild = new ArrayList<>(this.children);
        newchild.add(child);
        this.setChildren(newchild);
    }
}
