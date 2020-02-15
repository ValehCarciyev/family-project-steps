package NewPack.Homework5;

public class Family {
    public static void main(String[] args) {
        Human mother = new Human();
        Human father = new Human();
        Human children = new Human();
        Pet pet = new Pet();
        Family family = new Family();
        children.setName("Elbrus");
        children.setSurname("Garayev");
        children.setYear(2000);
        children.setIq((short)100);
        children.setSchedule(new String[][]{{"Monday", "Thursday"},{"Go to sport", "Go to course"}});

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
    public void deleteChild(Human child){

    }
}
