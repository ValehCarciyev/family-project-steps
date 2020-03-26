package homeworksPack.homework13.dao;

import homeworksPack.homework13.animals.Dog;
import homeworksPack.homework13.animals.Pet;
import homeworksPack.homework13.humans.Human;
import homeworksPack.homework13.humans.Man;
import homeworksPack.homework13.humans.Woman;
import homeworksPack.homework13.humans.Family;

import java.io.*;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class CollectionFamilyDao implements FamilyDao {
    List<Family> familyList = new ArrayList<>();

    @Override
    public List<Family> getAllFamilies() {
        return familyList;
    }

    @Override
    public Family getFamilybyIndex(int index) {
        try {
            return familyList.get(index);

        }
        catch (IndexOutOfBoundsException | NullPointerException e ){
            System.out.println("Wrong Index");
            return null;
        }
    }

    @Override
    public boolean deleteFamily(int index) {
        if (index < 0 || index > familyList.size())  return false;
        familyList.remove(index); return true;
    }

    @Override
    public boolean deleteFamily(Family family) {
        return familyList.remove(family);
    }

    @Override
    public void saveFamily(Family family) {
        if (!familyList.contains(family)) {
            familyList.add(family);
        }
    }

    @Override
    public void loadData() {
        File file=new File("src/main/java/homeworksPack/homework13/data/dataFile.txt");
        try {
            new BufferedReader(new FileReader(file)).lines().collect(Collectors.toList());
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (Family family : familyList) {
                bw.write(family.showFamily());
                bw.write("\n");
            }
            bw.close();
        } catch (IOException e) {
            System.out.printf("File:'%s' not found!\n", file);
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                for (Family family : familyList) {
                    bw.write(family.showFamily());
                    bw.write("\n");
                }
                bw.close();
            } catch (Exception e1) {
                System.out.println("Error");
            }
        }

    }

    public void getData() {
        File file = new File("src/main/java/homeworksPack/homework13/data/dataFile.txt");
        List<Family> familyArrayList = new ArrayList<>();

        if(familyList.size() == 0) {
            try {
                List<String> lines = new BufferedReader(new FileReader(file)).lines().collect(Collectors.toList());
                lines.stream().map(line -> line.split("@")).forEach(splitted -> {
                    String[] mother = splitted[0].split("-");

                    long mBirth = Long.parseLong(mother[2]);
                    LocalDate date = Instant.ofEpochMilli(mBirth).atZone(ZoneId.systemDefault()).toLocalDate();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    String mFormattedBirth = date.format(formatter);

                    Woman woman = new Woman(mother[0], mother[1], mFormattedBirth, Integer.parseInt(mother[3]));

                    String[] father = splitted[1].split("-");

                    long dBirth = Long.parseLong(father[2]);
                    LocalDate date1 = Instant.ofEpochMilli(dBirth).atZone(ZoneId.systemDefault()).toLocalDate();
                    String dFormattedBirth = date1.format(formatter);

                    Man man = new Man(father[0], father[1], dFormattedBirth, Integer.parseInt(father[3]));

                    String[] children = splitted[2].split(",");
                    String[] pets = splitted[3].split("&");

                    ArrayList<Human> childrenList = new ArrayList<>();
                    HashSet<Pet> petSet = new HashSet<>();

                    for (String c : children) {
                        String[] c1 = c.split("-");
                        String name = c1[0].replaceAll("\\[", "").trim();
                        String surname = c1[1];
                        String birthDate = c1[2];
                        String IQ = c1[3].replaceAll("]", "");

                        long birth = Long.parseLong(birthDate);
                        LocalDate date2 = Instant.ofEpochMilli(birth).atZone(ZoneId.systemDefault()).toLocalDate();
                        String formattedBirth = date2.format(formatter);

                        childrenList.add(new Human(name, surname, formattedBirth, Integer.parseInt(IQ)));
                    }

                    for (String p : pets) {
                        String[] p1 = p.split("#");
                        String name = p1[1];
                        String age = p1[2];
                        String trickLevel = p1[3];
                        String habits = p1[4].replaceAll(";\\[", "").replaceAll("]", "");

                        String[] habitArray = habits.split(", ");

                        Set<String> habitSet = new HashSet<>();
                        Collections.addAll(habitSet, habitArray);

                        petSet.add(new Dog(name, Integer.parseInt(age), Integer.parseInt(trickLevel), habitSet));
                    }
                    familyArrayList.add(new Family(woman, man, childrenList, petSet));
                });
                familyList.addAll(familyArrayList);

            } catch (IOException e) {
                new FileNotFoundException();
            }
        }
    }
}
