package homeworksPack.homework5;

public class MainHw5 {
    public static void main(String[] args) {
        Human daught = new Human("Elizabeth","Nielson",
                2011,(short) 100,new String[][]{{"Monday", "Go to sport"},{"Thursday", "Go to course"}});
        Human son = new Human("James","Nielson",
                2013, (short) 100,new String[][]{{"Monday", "Go to sport"},{"Thursday", "Go to course"}});
        Pet pet = new Pet("Dog", "Beethoven",10, (short) 50,new String[]{"eat", "drink", "sleep"});

        Family family = new Family(new Human("Eliza", "Nielson",
                1989, (short) 95, new String[][]{{"Monday", "Go to sport"},
                {"Thursday", "Go to course"}}),
                new Human("John", "Nielson", 1988, (short) 98,
                        new String[][]{{"Monday", "Go to sport"},{"Thursday", "Go to course"}}));

        family.addChild(daught);
        family.addChild(son);
        System.out.println(family.getMother().toString());
        family.deleteChild(daught);
        family.deleteChild(2);
        family.setPet(pet);
        System.out.println(family.getFather().toString());
        System.out.println(family.toString());
    }
}
