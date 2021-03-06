package homeworksPack.homework7;

import java.util.Set;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children = new Human[0];
    private Set<Pet> pet;

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

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Set<Pet>  getPet() {
        return pet;
    }

    public void setPet(Set<Pet> pet) {
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

    public static boolean findIndex(Human[] arr, Human human) {
        if (arr == null) {
            return false;
        }
        int len = arr.length;
        int i = 0;

        while (i < len) {
            if (arr[i].equals(human)) {
                return true;
            }
            else {
                i = i + 1;
            }
        }
        return false;
    }


    public void deleteChild(Human child) {
        Human[] curChilds = this.children;
        if(findIndex(curChilds, child)){
            Human[] newChilds = new Human[curChilds.length - 1];
            int j = 0;
            for (Human curChild : curChilds) {
                if (!curChild.equals(child)) {
                    newChilds[j] = curChild;
                    j++;
                }
            }
            this.setChildren(newChilds);
        }
    }

    public void deleteChild(int index) {
        Human[] curChilds = this.children;
        if(index < this.children.length && index >= 0){
            Human[] newChilds = new Human[curChilds.length - 1];
            int j = 0;
            for (int i = 0; i < curChilds.length ; i++) {
                if (i != index) {
                    newChilds[j] = curChilds[i];
                    j++;
                }
            }
            this.setChildren(newChilds);
        }
    }

    public void addChild(Human child) {
        Human[] newChilds = new Human[this.children.length + 1];

        int newCount = 0;
        for (Human curChild : this.children) {
            newChilds[newCount++] = curChild;
        }
        newChilds[newChilds.length - 1] = child;
        this.setChildren(newChilds);
    }

    public int countFamily(){
        if(getFather() != null && getMother() != null)
            return children.length + 2;
        else if(getFather() != null || getMother() != null)
            return children.length + 1;
        else
            return children.length;
    }

    @Override
    public void finalize() {
        System.out.println("Family in the finalizer");
    }
}
