package NewPack.Homework5;

public class Family {

    private Human mother;
    private Human father;
    private Human[] children = new Human[0];
    private Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
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

    public void deleteChild(Human child) {
        Human[] curChildren = this.children;
        Human[] newChildren = new Human[curChildren.length - 1];
        int newCount = 0;
        for (Human currentChild : curChildren) {
            if (!currentChild.equals(child)) {
                newChildren[newCount++] = currentChild;
            }
        }
        this.setChildren(newChildren);
    }

    public void addChild(Human child) {
        Human[] newChildren = new Human[this.children.length + 1];
        int newCount = 0;
        for (Human currentChild : this.children) {
            newChildren[newCount++] = currentChild;
        }
        newChildren[newChildren.length-1] = child;
        this.setChildren(newChildren);
    }

    public int countFamily(){

        return children.length + 2;
    }
}
