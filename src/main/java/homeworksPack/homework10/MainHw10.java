package homeworksPack.homework10;

import homeworksPack.homework10.animals.Dog;
import homeworksPack.homework10.animals.DomesticCat;
import homeworksPack.homework10.animals.Pet;
import homeworksPack.homework10.controller.FamilyController;
import homeworksPack.homework10.enums.DaysOfWeek;
import homeworksPack.homework10.humans.Family;
import homeworksPack.homework10.humans.Human;
import homeworksPack.homework10.humans.Man;
import homeworksPack.homework10.humans.Woman;

import java.util.*;

public class MainHw10 {
    public static void main(String[] args) {
        Map<DaysOfWeek, String> schedule = new HashMap<>();
        fillSchedule(schedule);

        Set<String> habits1 = new HashSet<>();
        habits1.add("eat");
        habits1.add("drink");
        habits1.add("sleep");

        Set<String> habits2 = new HashSet<>();
        habits2.add("jump");
        habits2.add("sleep");

        Human human = new Human("Human_Name", "Human_Surame", "01/07/1970", 1, schedule);

        Dog dog = new Dog("Beethoven", 5, 75, habits1);
        Woman woman1 = new Woman("Eliza", "Martin");
        Man man1 = new Man("John", "Martin");
        List<Human> children1 = new ArrayList<>();
        HashSet<Pet> pets1 = new HashSet<>();
        Human child1 = new Human("Kyle", "Nielson", "01/05/2000", 90);
        Human child2 = new Human("Mike", "Nielson", "19/12/2002", 91);

        Family family1 = new Family(woman1, man1, children1, pets1);
        pets1.add(dog);

        DomesticCat cat = new DomesticCat("Siri", 2, 75, habits2);
        Woman woman2 = new Woman("Mercedes", "Vahn");
        Man man2 = new Man("Trump", "Nielson");
        List<Human> children2 = new ArrayList<>();
        HashSet<Pet> pets2 = new HashSet<>();
        Human child4 = new Human("Human", "Humans", "05/05/2004", 90);
        Family family2 = new Family(woman2, man2, children2, pets2);
        pets2.add(cat);

        Human child6 = new Human("Mikkkkkkee", "Kaaaarleoneeeeee", "12/04/1976", 91);

        FamilyController familyController = new FamilyController();
        familyController.familyService.famDao.saveFamily(family1);
        familyController.familyService.famDao.saveFamily(family2);

        family1.addChild(child1);
        family1.addChild(child2);
        family1.deleteChild(1);
        family2.addChild(child4);
        family2.deleteChild(0);

        familyController.bornChild(family2, "Monica", "Nielsen");

        System.out.println(human.describeAge());
        System.out.println(human.toString());
    }

    private static void fillSchedule(Map<DaysOfWeek, String> schedule) {
        schedule.put(DaysOfWeek.Sunday, "#stayathome");
        schedule.put(DaysOfWeek.Monday, "#stayathome");
        schedule.put(DaysOfWeek.Tuesday, "#stayathome");
        schedule.put(DaysOfWeek.Wednesday, "#stayathome");
        schedule.put(DaysOfWeek.Thursday, "#stayathome");
        schedule.put(DaysOfWeek.Friday, "#stayathome");
        schedule.put(DaysOfWeek.Saturday, "#stayathome");
    }
}
