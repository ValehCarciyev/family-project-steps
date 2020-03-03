package homework6;

import NewPack.homework6.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Hw6_Test {

    private Family family;
    Human daught;
    Human son;
    Human son1;
    public void FillValue() {
        String[][] schedule = new String[7][2];
        schedule[0][0] = DayOfWeek.Sunday.name();
        schedule[0][1] = "do home work.";
        schedule[1][0] = DayOfWeek.Monday.name();
        schedule[1][1] = "Damn it! Here we go again :|";
        schedule[2][0] = DayOfWeek.Tuesday.name();
        schedule[2][1] = "do more home work.";
        schedule[3][0] = DayOfWeek.Wednesday.name();
        schedule[3][1] = "go to IBA.";
        schedule[4][0] = DayOfWeek.Thursday.name();
        schedule[4][1] = "Go to Codex";
        schedule[5][0] = DayOfWeek.Friday.name();
        schedule[5][1] = "go to IBA.";
        schedule[6][0] = DayOfWeek.Saturday.name();
        schedule[6][1] = "do home work.";
        daught = new Human("Elizabeth", "Nielsen",
                2011, (short) 100, schedule);
        son = new Human("James", "Nielsen",
                2013, (short) 100, schedule);
        son1 = new Human("Johnie","Nielsen",
                2015, (short) 100,schedule);
        Pet pet = new Pet(Species.Dog, "Beethoven", 10, (short) 50, new String[]{"eat", "drink", "sleep"});

        family = new Family(new Human("Eliza", "Nielsen", 1989, (short) 95, schedule),
                new Human("John", "Nielsen", 1988, (short) 98, schedule));
        family.addChild(daught);
        family.addChild(son);
        family.setPet(pet);
    }
    @BeforeEach
    public void initialize() {
        this.family = new Family();
    }

    @Test
    public void test1() {
        FillValue();
        String expected = "Family{\n" +
                "mother=Human{name='Eliza', surname='Nielsen', year=1989, iq=95, schedule=[[Sunday, do home work.], [Monday, Damn it! Here we go again :|], [Tuesday, do more home work.], [Wednesday, go to IBA.], [Thursday, Go to Codex], [Friday, go to IBA.], [Saturday, do home work.]]},\n" +
                " father=Human{name='John', surname='Nielsen', year=1988, iq=98, schedule=[[Sunday, do home work.], [Monday, Damn it! Here we go again :|], [Tuesday, do more home work.], [Wednesday, go to IBA.], [Thursday, Go to Codex], [Friday, go to IBA.], [Saturday, do home work.]]},\n" +
                " children=Human{name='Elizabeth', surname='Nielsen', year=2011, iq=100, schedule=[[Sunday, do home work.], [Monday, Damn it! Here we go again :|], [Tuesday, do more home work.], [Wednesday, go to IBA.], [Thursday, Go to Codex], [Friday, go to IBA.], [Saturday, do home work.]]}Human{name='James', surname='Nielsen', year=2013, iq=100, schedule=[[Sunday, do home work.], [Monday, Damn it! Here we go again :|], [Tuesday, do more home work.], [Wednesday, go to IBA.], [Thursday, Go to Codex], [Friday, go to IBA.], [Saturday, do home work.]]},\n" +
                " pet=Dog{nickname='Beethoven', age=10, trickLevel=50, habits=[eat, drink, sleep]}}";
        String actual = family.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        FillValue();
        family.deleteChild(daught);
        String expected = "Family{\n" +
                "mother=Human{name='Eliza', surname='Nielsen', year=1989, iq=95, schedule=[[Sunday, do home work.], [Monday, Damn it! Here we go again :|], [Tuesday, do more home work.], [Wednesday, go to IBA.], [Thursday, Go to Codex], [Friday, go to IBA.], [Saturday, do home work.]]},\n" +
                " father=Human{name='John', surname='Nielsen', year=1988, iq=98, schedule=[[Sunday, do home work.], [Monday, Damn it! Here we go again :|], [Tuesday, do more home work.], [Wednesday, go to IBA.], [Thursday, Go to Codex], [Friday, go to IBA.], [Saturday, do home work.]]},\n" +
                " children=Human{name='James', surname='Nielsen', year=2013, iq=100, schedule=[[Sunday, do home work.], [Monday, Damn it! Here we go again :|], [Tuesday, do more home work.], [Wednesday, go to IBA.], [Thursday, Go to Codex], [Friday, go to IBA.], [Saturday, do home work.]]},\n" +
                " pet=Dog{nickname='Beethoven', age=10, trickLevel=50, habits=[eat, drink, sleep]}}";
        String actual = family.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        FillValue();
        family.deleteChild(son1);
        String expected = "Family{\n" +
                "mother=Human{name='Eliza', surname='Nielsen', year=1989, iq=95, schedule=[[Sunday, do home work.], [Monday, Damn it! Here we go again :|], [Tuesday, do more home work.], [Wednesday, go to IBA.], [Thursday, Go to Codex], [Friday, go to IBA.], [Saturday, do home work.]]},\n" +
                " father=Human{name='John', surname='Nielsen', year=1988, iq=98, schedule=[[Sunday, do home work.], [Monday, Damn it! Here we go again :|], [Tuesday, do more home work.], [Wednesday, go to IBA.], [Thursday, Go to Codex], [Friday, go to IBA.], [Saturday, do home work.]]},\n" +
                " children=Human{name='Elizabeth', surname='Nielsen', year=2011, iq=100, schedule=[[Sunday, do home work.], [Monday, Damn it! Here we go again :|], [Tuesday, do more home work.], [Wednesday, go to IBA.], [Thursday, Go to Codex], [Friday, go to IBA.], [Saturday, do home work.]]}Human{name='James', surname='Nielsen', year=2013, iq=100, schedule=[[Sunday, do home work.], [Monday, Damn it! Here we go again :|], [Tuesday, do more home work.], [Wednesday, go to IBA.], [Thursday, Go to Codex], [Friday, go to IBA.], [Saturday, do home work.]]},\n" +
                " pet=Dog{nickname='Beethoven', age=10, trickLevel=50, habits=[eat, drink, sleep]}}";
        String actual = family.toString();
        assertEquals(expected, actual);
    }

    //deleteChild with index
    @Test
    public void test4() {
        FillValue();
        family.deleteChild(1);
        String expected = "Family{\n" +
                "mother=Human{name='Eliza', surname='Nielsen', year=1989, iq=95, schedule=[[Sunday, do home work.], [Monday, Damn it! Here we go again :|], [Tuesday, do more home work.], [Wednesday, go to IBA.], [Thursday, Go to Codex], [Friday, go to IBA.], [Saturday, do home work.]]},\n" +
                " father=Human{name='John', surname='Nielsen', year=1988, iq=98, schedule=[[Sunday, do home work.], [Monday, Damn it! Here we go again :|], [Tuesday, do more home work.], [Wednesday, go to IBA.], [Thursday, Go to Codex], [Friday, go to IBA.], [Saturday, do home work.]]},\n" +
                " children=Human{name='Elizabeth', surname='Nielsen', year=2011, iq=100, schedule=[[Sunday, do home work.], [Monday, Damn it! Here we go again :|], [Tuesday, do more home work.], [Wednesday, go to IBA.], [Thursday, Go to Codex], [Friday, go to IBA.], [Saturday, do home work.]]},\n" +
                " pet=Dog{nickname='Beethoven', age=10, trickLevel=50, habits=[eat, drink, sleep]}}";
        String actual = family.toString();
        assertEquals(expected, actual);
    }

    //deleteChild with index (unchanged)
    @Test
    public void test5() {
        FillValue();
        family.deleteChild(7);
        family.deleteChild(-1);
        String expected = "Family{\n" +
                "mother=Human{name='Eliza', surname='Nielsen', year=1989, iq=95, schedule=[[Sunday, do home work.], [Monday, Damn it! Here we go again :|], [Tuesday, do more home work.], [Wednesday, go to IBA.], [Thursday, Go to Codex], [Friday, go to IBA.], [Saturday, do home work.]]},\n" +
                " father=Human{name='John', surname='Nielsen', year=1988, iq=98, schedule=[[Sunday, do home work.], [Monday, Damn it! Here we go again :|], [Tuesday, do more home work.], [Wednesday, go to IBA.], [Thursday, Go to Codex], [Friday, go to IBA.], [Saturday, do home work.]]},\n" +
                " children=Human{name='Elizabeth', surname='Nielsen', year=2011, iq=100, schedule=[[Sunday, do home work.], [Monday, Damn it! Here we go again :|], [Tuesday, do more home work.], [Wednesday, go to IBA.], [Thursday, Go to Codex], [Friday, go to IBA.], [Saturday, do home work.]]}Human{name='James', surname='Nielsen', year=2013, iq=100, schedule=[[Sunday, do home work.], [Monday, Damn it! Here we go again :|], [Tuesday, do more home work.], [Wednesday, go to IBA.], [Thursday, Go to Codex], [Friday, go to IBA.], [Saturday, do home work.]]},\n" +
                " pet=Dog{nickname='Beethoven', age=10, trickLevel=50, habits=[eat, drink, sleep]}}";
        String actual = family.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        FillValue();
        family.deleteChild(1);
        int expected = 3;
        int actual = family.countFamily();
        assertEquals(expected, actual);
    }

    @Test
    public void test7() {
        FillValue();
        int expected = 4;
        int actual = family.countFamily();
        assertEquals(expected, actual);
    }

    @Test
    public void test8() {
        int expected = 0;
        int actual = family.countFamily();
        assertEquals(expected, actual);
    }

    @Test
    public void test9() {
        int expected = family.countFamily() + 1;
        Human daught = new Human("Eliza","Nielsen",
                2019,(short) 100,new String[][]{{"Monday", "Drink coffe"},{"Thursday","Sleep"}});
        family.addChild(daught);
        int actual = family.countFamily();
        assertEquals(expected, actual);
    }
}
