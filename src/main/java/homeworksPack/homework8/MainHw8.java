package homeworksPack.homework8;

import homeworksPack.homework8.animals.Dog;

import java.util.*;

public class MainHw8 {

    private static void fill_schedule(Map<String, String> schedule) {
        schedule.put(DayOfWeek.SUNDAY.name(), "do home work.");
        schedule.put(DayOfWeek.MONDAY.name(), "Damn it! Here we go again :|");
        schedule.put(DayOfWeek.TUESDAY.name(), "do more home work.");
        schedule.put(DayOfWeek.WEDNESDAY.name(), "go to IBA.");
        schedule.put(DayOfWeek.THURSDAY.name(), "Go to Codex");
        schedule.put(DayOfWeek.FRIDAY.name(), "go to IBA.");
        schedule.put(DayOfWeek.SATURDAY.name(), "do home work.");
    }
    public static void main(String[] args) {
        Map<String, String> schedule = new HashMap<>();
        fill_schedule(schedule);

        Human daught = new Human("Elizabeth","Nielsen",
                2011,(short) 100,schedule);
        Human son = new Human("James","Nielsen",
                2013, (short) 100,schedule);

        Family family = new Family(new Human("Eliza", "Nielsen", 1989, (short) 95, schedule),
                new Human("John", "Nielsen", 1988, (short) 98, schedule));

        Dog dog = new Dog("Bob", 15, (short) 50, new HashSet<>(Arrays.asList("eat", "drink", "sleep")));

        //System.out.println(daught.toString());

        family.addChild(daught);
        family.addChild(son);
        family.setPet(dog);

        family.deleteChild(daught);
        System.out.println(family.countFamily());
        System.out.println(family.toString());
    }
}
