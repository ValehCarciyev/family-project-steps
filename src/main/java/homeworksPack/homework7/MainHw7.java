package homeworksPack.homework7;

import homeworksPack.homework7.animals.Dog;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class MainHw7 {

    private static void fill_schedule(String[][] schedule) {
        schedule[0][0] = DayOfWeek.SUNDAY.name();
        schedule[0][1] = "do home work.";
        schedule[1][0] = DayOfWeek.MONDAY.name();
        schedule[1][1] = "Damn it! Here we go again :|";
        schedule[2][0] = DayOfWeek.TUESDAY.name();
        schedule[2][1] = "do more home work.";
        schedule[3][0] = DayOfWeek.WEDNESDAY.name();
        schedule[3][1] = "go to IBA.";
        schedule[4][0] = DayOfWeek.THURSDAY.name();
        schedule[4][1] = "Go to Codex";
        schedule[5][0] = DayOfWeek.FRIDAY.name();
        schedule[5][1] = "go to IBA.";
        schedule[6][0] = DayOfWeek.SATURDAY.name();
        schedule[6][1] = "do home work.";
    }
    public static void main(String[] args) {
        String[][] schedule = new String[7][2];
        fill_schedule(schedule);
//        Human[] humans = new Human[100000000];
//        for (int i = 0; i < humans.length; i++) {
//            humans[i]= new Human();
//        }
        Human daught = new Human("Elizabeth","Nielsen",
                2011,(short) 100,schedule);
        Human son = new Human("James","Nielsen",
                2013, (short) 100,schedule);

        Family family = new Family(new Human("Eliza", "Nielsen", 1989, (short) 95, schedule),
                new Human("John", "Nielsen", 1988, (short) 98, schedule));

        Dog dog = new Dog("Bob", 15, (short) 50, new HashSet<>(Arrays.asList("eat","drink","sleep")));

        family.addChild(daught);
        family.addChild(son);
        family.setPet(Collections.singleton(dog));

        family.deleteChild(daught);
        System.out.println(family.countFamily());
        System.out.println(family.toString());
    }
}
