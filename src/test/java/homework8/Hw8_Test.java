package homework8;

import homeworksPack.homework8.*;
import homeworksPack.homework8.animals.Dog;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class Hw8_Test {

    private Family family;
    Human daught;
    Human son;
    Human son1;
    public void FillValue() {
        Map<String, String> schedule = new HashMap<>();
        schedule.put(DayOfWeek.SUNDAY.name(), "do home work.");
        schedule.put(DayOfWeek.MONDAY.name(), "Damn it! Here we go again :|");
        schedule.put(DayOfWeek.TUESDAY.name(), "do more home work.");
        schedule.put(DayOfWeek.WEDNESDAY.name(), "go to IBA.");
        schedule.put(DayOfWeek.THURSDAY.name(), "Go to Codex");
        schedule.put(DayOfWeek.FRIDAY.name(), "go to IBA.");
        schedule.put(DayOfWeek.SATURDAY.name(), "do home work.");
        daught = new Human("Elizabeth", "Nielsen",
                2011, (short) 100, schedule);
        son = new Human("James", "Nielsen",
                2013, (short) 100, schedule);
        son1 = new Human("Johnie","Nielsen",
                2015, (short) 100,schedule);
        Dog dog = new Dog("Bob", 15, (short) 50, new HashSet<>(Arrays.asList("eat", "drink", "sleep")));

        family = new Family(new Human("Eliza", "Nielsen", 1989, (short) 95, schedule),
                new Human("John", "Nielsen", 1988, (short) 98, schedule));
        family.addChild(daught);
        family.addChild(son);
        family.setPet(dog);
    }
    @BeforeEach
    public void initialize() {
        this.family = new Family();
    }

    @Test
    public void test1() {
        FillValue();
        String expected = "Family{\n" +
                "mother=Human{name='Eliza', surname='Nielsen', year=1989, iq=95, schedule={WEDNESDAY=go to IBA., MONDAY=Damn it! Here we go again :|, THURSDAY=Go to Codex, SUNDAY=do home work., TUESDAY=do more home work., FRIDAY=go to IBA., SATURDAY=do home work.}},\n" +
                " father=Human{name='John', surname='Nielsen', year=1988, iq=98, schedule={WEDNESDAY=go to IBA., MONDAY=Damn it! Here we go again :|, THURSDAY=Go to Codex, SUNDAY=do home work., TUESDAY=do more home work., FRIDAY=go to IBA., SATURDAY=do home work.}},\n" +
                " children=Human{name='Elizabeth', surname='Nielsen', year=2011, iq=100, schedule={WEDNESDAY=go to IBA., MONDAY=Damn it! Here we go again :|, THURSDAY=Go to Codex, SUNDAY=do home work., TUESDAY=do more home work., FRIDAY=go to IBA., SATURDAY=do home work.}}Human{name='James', surname='Nielsen', year=2013, iq=100, schedule={WEDNESDAY=go to IBA., MONDAY=Damn it! Here we go again :|, THURSDAY=Go to Codex, SUNDAY=do home work., TUESDAY=do more home work., FRIDAY=go to IBA., SATURDAY=do home work.}},\n" +
                " pet=Dog{nickname='Bob', age=15, trickLevel=50, habits=[sleep, eat, drink]}}";
        String actual = family.toString();
        assertEquals(expected, actual);
    }
}

