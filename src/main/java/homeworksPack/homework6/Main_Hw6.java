package homeworksPack.homework6;

public class Main_Hw6 {
    private static void fill_schedule(String[][] schedule) {
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
    }
    public static void main(String[] args) {
        String[][] schedule = new String[7][2];
        fill_schedule(schedule);
        Human[] humans = new Human[1000000];
        for (int i = 0; i < humans.length; i++) {
            humans[i]= new Human();
        }
        Human daught = new Human("Elizabeth","Nielsen",
                2011,(short) 100,schedule);
        Human son = new Human("James","Nielsen",
                2013, (short) 100,schedule);

        Pet pet = new Pet(Species.Dog, "Beethoven",10, (short) 50,new String[]{"eat", "drink", "sleep"});

        Family family = new Family(new Human("Eliza", "Nielsen", 1989, (short) 95, schedule),
                new Human("John", "Nielsen", 1988, (short) 98, schedule));



        family.addChild(daught);
        family.addChild(son);
        family.setPet(pet);

        family.deleteChild(daught);
        System.out.println(family.countFamily());
        System.out.println(family.toString());
    }
}
