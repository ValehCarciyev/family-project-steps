package homeworksPack.homework13.service;

import homeworksPack.homework13.animals.Pet;
import homeworksPack.homework13.dao.CollectionFamilyDao;
import homeworksPack.homework13.dao.FamilyDao;
import homeworksPack.homework13.humans.Family;
import homeworksPack.homework13.humans.Human;
import homeworksPack.homework13.humans.Man;
import homeworksPack.homework13.humans.Woman;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FamilyService {
    public CollectionFamilyDao familyDao = new CollectionFamilyDao();
    public List<Family> familyList = familyDao.getAllFamilies();

    public List<Family> getAllFamilies() {
        return familyList;
    }

    public StringBuffer displayAllFamilies() {
        StringBuffer s = new StringBuffer();
        for (Family fam :familyDao.getAllFamilies()){
            s.append(fam);
            s.append("\n");
        }
        return s;
    }

    public List<Family> getFamiliesBiggerThan(int numMore) {
        return familyList.stream().filter(f -> f.countFamily() > numMore).collect(Collectors.toList());
    }

    public List<Family> getFamiliesLessThan(int numLess) {
        return familyList.stream().filter(f -> f.countFamily() < numLess).collect(Collectors.toList());
    }

    public int countFamiliesWithMemberNumber(int num) {
        return (int) familyList.stream().filter(f -> f.countFamily() == num).count();
    }

    public void createNewFamily(Woman mother, Man father) {
        List<Human> children = new ArrayList<>();
        HashSet<Pet> pets = new HashSet<>();
        Family family = new Family(mother, father, children);
        family.setPet(pets);
        familyList.add(family);
    }

    public Family bornChild(Family family, String fem, String masc) {
        int rand = (int) (Math.random() * 2);
        String childName;
        if (rand == 0) childName = fem;
        else childName = masc;
        Human child = new Human();
        child.setName(childName);
        child.setSurname(family.getMan().getSurname());
        family.addChild(child);
        return family;
    }

    public Family adoptChild(Family family, Human child) {
        if (child != null)
            child.setSurname(family.getMan().getSurname());
        if (family != null)
            family.addChild(child);
        return family;
    }

    public void deleteAllChildrenOlderThen(int age) {
        familyList.forEach(f -> {
            int year = LocalDate.now().getYear();
            f.getChildren().removeIf(c -> age < (year - c.getBirthdate()));
        });
    }

    public int count(){
        return familyList.size();
    }

    public Family getFamilyById(int index) {
        return familyDao.getFamilybyIndex(index);
    }

    public HashSet<Pet> getPets(int index) {
        return familyList.get(index).getPet();
    }

    public void addPet(int index, Pet p) {
        familyList.get(index).getPet().add(p);
        familyDao.saveFamily(familyList.get(index));
    }

    public String prettyFormat() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < familyList.size(); i++)
            sb.append("family[").append(i+1).append("]:\n").append(familyList.get(i).prettyFormat()).append("\n\n");
        return sb.toString();
    }

    public Family getFamilyByIndex(int index) {
        return familyDao.getFamilybyIndex(index);
    }

    public boolean deleteFamily(int index) {
        return familyDao.deleteFamily(index);
    }

    public boolean deleteFamily(Family fam) {
        return familyDao.deleteFamily(fam);
    }

    public void saveFamily(Family fam) {
        familyDao.saveFamily(fam);
    }

    public void loadData() {
        familyDao.loadData();
    }

    public void getData() {
        familyDao.getData();
    }
}
