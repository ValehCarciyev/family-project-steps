package homeworksPack.homework12;

import homeworksPack.homework12.animals.Dog;
import homeworksPack.homework12.animals.DomesticCat;
import homeworksPack.homework12.animals.Pet;
import homeworksPack.homework12.controller.FamilyController;
import homeworksPack.homework12.humans.Family;
import homeworksPack.homework12.humans.Human;
import homeworksPack.homework12.enums.DaysOfWeek;
import homeworksPack.homework12.humans.Man;
import homeworksPack.homework12.humans.Woman;

import java.util.*;

public class MainHw12 {
    public static void main(String[] args) {
        StringBuilder menu = new StringBuilder();
        menu
                .append("1. Fill with test data.\n")
                .append("2. Display the entire list of families.\n")
                .append("3. Display a list of families where the number of people is greater than the specified number.\n")
                .append("4. Display a list of families where the number of people is less than the specified number.\n")
                .append("5. Calculate the number of families with the number of members.\n")
                .append("6. Create a new family.\n")
                .append("7. Delete a family by its index in the general list.\n")
                .append("8. Edit a family by its index in the general list.\n")
                .append("9. Remove all children over the age of majority.\n")
                .append("Please enter a command: ");

        Scanner sc = new Scanner(System.in);
        FamilyController familyController = new FamilyController();
        String input = "";

        while (!input.equals("exit")) {
            System.out.print(menu.toString());
            input = sc.next();
            switch (input) {
                case "1":{
                    Map<DaysOfWeek, String> schedule = new HashMap<>();
                    schedule.put(DaysOfWeek.Sunday,"#stayAtHome");
                    schedule.put(DaysOfWeek.Monday,"#stayAtHome");
                    schedule.put(DaysOfWeek.Tuesday,"#stayAtHome");
                    schedule.put(DaysOfWeek.Wednesday,"#stayAtHome");
                    schedule.put(DaysOfWeek.Thursday,"#stayAtHome");
                    schedule.put(DaysOfWeek.Friday,"#stayAtHome");
                    schedule.put(DaysOfWeek.Saturday,"#stayAtHome");

                    Set<String> habits1 = new HashSet<>();
                    habits1.add("eat"); habits1.add("drink"); habits1.add("sleep");

                    Set<String> habits2 = new HashSet<>();
                    habits2.add("jump"); habits2.add("sleep");

                    Human human = new Human("Name","Surname","20/03/2016",1, schedule);

                    Dog dog = new Dog("Alvin",5,75,habits1);
                    Woman woman1 = new Woman("Eliza","Wolf","21/10/1978");
                    Man man1 = new Man("Alex","Martin","08/04/1980");
                    List<Human> children1 = new ArrayList<>();
                    HashSet<Pet> pets1 = new HashSet<>();
                    Human child1 = new Human("John","Mickey","20/05/2000",100);
                    Human child2 = new Human("Mike","Mickey","20/05/2000",100);
                    Human child3 = new Human("Matthew","Mickey","20/05/2000",100);
                    Family family1 = new Family(woman1, man1, children1, pets1);
                    pets1.add(dog);

                    DomesticCat cat = new DomesticCat("Kicky",2,100,habits2);
                    Woman woman2 = new Woman("Martha","Mickey","20/05/2000");
                    Man man2 = new Man("Trump","Mickey","20/05/2000");
                    List<Human> children2 = new ArrayList<>();
                    HashSet<Pet> pets2 = new HashSet<>();
                    Human child4 = new Human("Ronald","Mickey","20/05/2000",100);
                    Human child5 = new Human("Ronald","Mickey","20/05/2000",100);
                    Family family2 = new Family(woman2, man2, children2, pets2);
                    pets2.add(cat);

                    Woman woman3 = new Woman("Ronald","Mickey","20/05/2000");
                    Man man3 = new Man("Ronald","Mickey","20/05/2000");

                    Human child6 = new Human("Ronald","Mickey","20/05/2000",100);

                    familyController.familyService.familyDao.saveFamily(family1);
                    familyController.familyService.familyDao.saveFamily(family2);

                    family1.addChild(child1); family1.addChild(child2); family1.addChild(child3);
                    family2.addChild(child4); family2.addChild(child5); //family2.addChild(child6);
                    break;
                }
                case "2": {
                    System.out.println(familyController.displayAllFamilies());
                    break;
                }
                case "3": {
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    for (Family f: familyController.getFamiliesBiggerThan(num))
                        System.out.println(f.prettyFormat());
                    break;
                }
                case "4": {
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    for (Family f: familyController.getFamiliesLessThan(num))
                        System.out.println(f.prettyFormat());
                    break;
                }
                case "5": {
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    System.out.println(familyController.countFamiliesWithMemberNumber(num));
                    break;
                }
                case "6": {
                    System.out.print("Enter mother's name: ");
                    String mothersName = sc.next();

                    System.out.print("Enter mother's surname: ");
                    String mothersSurname = sc.next();

                    System.out.print("Enter mother's birthyear: ");
                    String mothersBirthYear = sc.next();

                    System.out.print("Enter mother's birthmonth: ");
                    String mothersBirthMonth = sc.next();

                    System.out.print("Enter mother's birthdate: ");
                    String mothersBirthDay = sc.next();

                    System.out.print("Enter mother's IQ: ");
                    int motherIq = Integer.parseInt(sc.next());

                    System.out.print("Enter father's name: ");
                    String fathersName = sc.next();

                    System.out.print("Enter father's surname: ");
                    String fathersSurname = sc.next();

                    System.out.print("Enter father's birthyear: ");
                    String fathersBirthYear = sc.next();

                    System.out.print("Enter father's birthmonth: ");
                    String fathersBirthMonth = sc.next();

                    System.out.print("Enter father's birthdate: ");
                    String fathersBirthDay = sc.next();

                    System.out.print("Enter father's IQ:");
                    int fathersIq = Integer.parseInt(sc.next());

                    Man father = new Man(fathersName, fathersSurname, fathersBirthDay + "/" + fathersBirthMonth + "/" + fathersBirthYear);
                    Woman mother = new Woman(mothersName, mothersSurname, mothersBirthDay + "/" + mothersBirthMonth + "/" + mothersBirthYear);
                    father.setIQ(fathersIq);
                    mother.setIQ(motherIq);

                    Set<String> habits = new HashSet<>();
                    habits.add("eat"); habits.add("drink"); habits.add("sleep");

                    Map<DaysOfWeek, String> schedule1 = new HashMap<>();
                    schedule1.put(DaysOfWeek.Sunday,"#stayAtHome");
                    schedule1.put(DaysOfWeek.Monday,"#stayAtHome");
                    schedule1.put(DaysOfWeek.Tuesday,"#stayAtHome");
                    schedule1.put(DaysOfWeek.Wednesday,"#stayAtHome");
                    schedule1.put(DaysOfWeek.Thursday,"#stayAtHome");
                    schedule1.put(DaysOfWeek.Friday,"#stayAtHome");
                    schedule1.put(DaysOfWeek.Saturday,"#stayAtHome");

                    ArrayList<Human> children = new ArrayList<>();
                    HashSet<Pet> pets = new HashSet<>();
                    Dog dog = new Dog("Johny",5,75,habits);
                    Human child = new Human("Eliza","Nielsen","20/06/1900");
                    child.setSchedule(schedule1);
                    Family family = new Family(mother, father, children);
                    family.addChild(child);
                    family.setPet(pets);
                    pets.add(dog);
                    familyController.getAllFamilies().add(family);

                    System.out.println("Family created.");
                    break;
                }
                case "7": {
                    System.out.print("Please enter family's ID: ");
                    try {
                        int familyID = sc.nextInt();
                        familyController.getAllFamilies().remove(familyID - 1);
                        System.out.println("Family deleted.");
                    } catch (Exception e) {
                        System.out.println("Wrong input!");
                    }
                    break;
                }
                case "8": {
                    System.out.print("Enter operation:\n -> 1 to give a birth\n " +
                            "-> 2 to adopt a child.\n Enter option number: ");
                    String opr = sc.next();
                    try {
                        if (opr.equals("1")) {
                            System.out.println("Enter family's ID");
                            int familyIDtoBirth = sc.nextInt();
                            if (familyController.getFamilyByID(familyIDtoBirth).countFamily() < 5) {
                                System.out.print("Enter a boy's name: ");
                                String boysName = sc.next();

                                System.out.println("Enter a girl's name: ");
                                String girlsName = sc.next();

                                familyController.bornChild(familyController.getFamilyByID(familyIDtoBirth), boysName, girlsName);
                                familyController.saveFamily(familyController.getFamilyByID(familyIDtoBirth));
                            } else throw new FamilyOverflowException("Family member's cannot bigger than 5!");
                        }
                        else if (opr.equals("2")) {
                            System.out.println("Enter family's ID: ");
                            int familyIDToAdopt = sc.nextInt();
                            if (familyController.getFamilyByID(familyIDToAdopt).countFamily() < 5) {
                                System.out.print("Enter a child's name: ");
                                String childsName = sc.next();

                                System.out.print("Enter a child's surname: ");
                                String childsSurname = sc.next();

                                System.out.print("Enter a child's birthdate like 'dd/MM/YYYY: ");
                                String childsBirthYear = sc.next();

                                System.out.print("Enter child's IQ: ");
                                int childsIQ = sc.nextInt();

                                Human childAdopted = new Human(childsName, childsSurname, childsBirthYear, childsIQ);
                                familyController.adoptChild(familyController.getFamilyByID(familyIDToAdopt), childAdopted);
                            } else throw new FamilyOverflowException("Family can not include members more than 5!");
                        }

                    } catch (FamilyOverflowException e) {
                        System.out.println(e.getMessage());
                    } catch (Exception ex) {
                        System.out.println("You entered wrong input.");
                    }

                    break;
                }
                case "9": {
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    familyController.deleteAllChildrenOlderThen(age);
                    break;
                }
                default: break;
            }
        }
    }
}
