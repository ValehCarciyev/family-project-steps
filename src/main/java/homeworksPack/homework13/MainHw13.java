package homeworksPack.homework13;

import homeworksPack.homework13.animals.Dog;
import homeworksPack.homework13.animals.Pet;
import homeworksPack.homework13.controller.FamilyController;
import homeworksPack.homework13.humans.Family;
import homeworksPack.homework13.humans.Human;
import homeworksPack.homework13.humans.Man;
import homeworksPack.homework13.humans.Woman;

import java.util.*;

public class MainHw13 {
    public static void main(String[] args) {
        StringBuilder inputs = new StringBuilder();
        inputs
                .append("1. Fill with test data.\n")
                .append("2. Display the entire list of families.\n")
                .append("3. Display a list of families where the number of people is greater than the specified number.\n")
                .append("4. Display a list of families where the number of people is less than the specified number.\n")
                .append("5. Calculate the number of families with the number of members.\n")
                .append("6. Create a new family.\n")
                .append("7. Delete a family by its index in the general list.\n")
                .append("8. Edit a family by its index in the general list.\n")
                .append("9. Remove all children over the age of majority.\n")
                .append("10. Save data.\n\n")
                .append("Please enter a command: ");

        Scanner sc = new Scanner(System.in);
        FamilyController familyController = new FamilyController();
        String input = "";

        while (!input.equals("exit")) {
            System.out.print(inputs.toString());
            input = sc.next();
            switch (input) {
                case "1":{
                    familyController.getData();
                    System.out.println("Data loaded.");
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
                    String mName = sc.next();

                    System.out.print("Enter mother's surname: ");
                    String mSurname = sc.next();

                    System.out.print("Enter mother's birthyear: ");
                    String mBirthYear = sc.next();

                    System.out.print("Enter mother's birthmonth: ");
                    String mBirthMonth = sc.next();

                    System.out.print("Enter mother's birthday: ");
                    String mBirthDay = sc.next();

                    System.out.print("Enter mother's IQ: ");
                    int mIQ = Integer.parseInt(sc.next());

                    System.out.print("Enter father's name: ");
                    String fName = sc.next();

                    System.out.print("Enter father's surname: ");
                    String fSurname = sc.next();

                    System.out.print("Enter father's birthyear: ");
                    String fBirthYear = sc.next();

                    System.out.print("Enter father's birthmonth: ");
                    String fBirthMonth = sc.next();

                    System.out.print("Enter father's birthday: ");
                    String fBirthDay = sc.next();

                    System.out.print("Enter father's IQ: ");
                    int fIQ = Integer.parseInt(sc.next());

                    Man father = new Man(fName, fSurname, fBirthDay + "/" + fBirthMonth + "/" + fBirthYear);
                    Woman mother = new Woman(mName, mSurname, mBirthDay + "/" + mBirthMonth + "/" + mBirthYear);
                    father.setIQ(fIQ);
                    mother.setIQ(mIQ);

                    Set<String> habits = new HashSet<>();
                    habits.add("eat"); habits.add("drink"); habits.add("sleep");

                    ArrayList<Human> children = new ArrayList<>();
                    HashSet<Pet> pets = new HashSet<>();
                    Dog dog = new Dog("Dog",5,75, habits);
                    Family family = new Family(mother, father, children);
                    family.setPet(pets);
                    pets.add(dog);
                    familyController.getAllFamilies().add(family);

                    System.out.println("Family created.");
                    break;
                }
                case "7": {
                    System.out.println("Enter family's ID: ");
                    try {
                        int familyID = sc.nextInt();
                        familyController.getAllFamilies().remove(familyID - 1);
                        System.out.print("Family deleted.");
                    } catch (Exception e) {
                        System.out.print("Wrong input!");
                    }
                    break;
                }
                case "8": {
                    System.out.print("Enter operation:\n -> 1 to give a birth\n -> 2 to adopt a child\n Enter operation: ");
                    String opr = sc.next();
                    try {
                        if (opr.equals("1")) {
                            System.out.print("Enter family's ID: ");
                            int familyIDToB = sc.nextInt();

                            if (familyController.getFamilyByID(familyIDToB).countFamily() < 4) {
                                System.out.print("Enter boy's name: ");
                                String bName = sc.next();

                                System.out.print("Enter girl's name: ");
                                String gName = sc.next();

                                familyController.bornChild(familyController.getFamilyByID(familyIDToB), bName, gName);
                                familyController.saveFamily(familyController.getFamilyByID(familyIDToB));
                            } else throw new FamilyOverflowException("Family member's cannot bigger than 4!");
                        }
                        else if (opr.equals("2")) {
                            System.out.print("Enter family's ID: ");
                            int familyIDToA = sc.nextInt();

                            if (familyController.getFamilyByID(familyIDToA).countFamily() < 4) {
                                System.out.print("Enter child's name: ");
                                String cName = sc.next();

                                System.out.print("Enter child's surname: ");
                                String cSurname = sc.next();

                                System.out.print("Enter child's birthdate like 'dd/MM/YYYY: ");
                                String cBirthYear = sc.next();

                                System.out.print("Enter child's IQ: ");
                                int cIQ = sc.nextInt();

                                Human cAdopted = new Human(cName, cSurname, cBirthYear, cIQ);
                                familyController.adoptChild(familyController.getFamilyByID(familyIDToA), cAdopted);
                            } else throw new FamilyOverflowException("Family can not include members more than 4!");
                        }

                    } catch (FamilyOverflowException e) {
                        System.out.println(e.getMessage());
                    } catch (Exception ex) {
                        System.out.print("You entered wrong input.");
                    }
                    break;
                }
                case "9": {
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    familyController.deleteAllChildrenOlderThen(age);
                    break;
                }
                case "10": {
                    familyController.loadData();
                    System.out.println("Data saved!");
                    break;
                }
                default: break;
            }
        }
    }
}
