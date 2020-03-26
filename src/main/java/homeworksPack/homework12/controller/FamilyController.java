package homeworksPack.homework12.controller;

import homeworksPack.homework12.animals.Pet;
import homeworksPack.homework12.humans.Family;
import homeworksPack.homework12.humans.Human;
import homeworksPack.homework12.humans.Man;
import homeworksPack.homework12.humans.Woman;
import homeworksPack.homework12.service.FamilyService;

import java.util.HashSet;
import java.util.List;

public class FamilyController {
    public FamilyService familyService = new FamilyService();

    public List<Family> getAllFamilies() {
        return familyService.getAllFamilies();
    }

    public StringBuffer displayAllFamilies() {
        return familyService.displayAllFamilies();
    }

    public List<Family> getFamiliesBiggerThan(int numMore) {
        return familyService.getFamiliesBiggerThan(numMore);
    }

    public List<Family> getFamiliesLessThan(int numLess) {
        return familyService.getFamiliesLessThan(numLess);
    }

    public int countFamiliesWithMemberNumber(int num) {
        return familyService.countFamiliesWithMemberNumber(num);
    }

    public void createNewFamily(Woman m, Man f) {
        familyService.createNewFamily(m, f);
    }

    public Family bornChild(Family f, String fem, String masc) {
        return familyService.bornChild(f, fem, masc);
    }

    public Family adoptChild(Family family, Human child) {
        return familyService.adoptChild(family, child);
    }

    public void deleteAllChildrenOlderThen(int age) {
        familyService.deleteAllChildrenOlderThen(age);
    }

    public int count() {
        return familyService.count();
    }

    public Family getFamilyByID(int index) {
        return familyService.getFamilyById(index);
    }

    public HashSet<Pet> getPets(int index) {
        return familyService.getPets(index);
    }

    public void addPet(int index, Pet p) {
        familyService.addPet(index, p);
    }

    public Family getFamilyByIndex(int index) {
        return familyService.getFamilyByIndex(index);
    }

    public boolean deleteFamily(int index) {
        return familyService.deleteFamily(index);
    }

    public boolean deleteFamily(Family fam) {
        return familyService.deleteFamily(fam);
    }

    public void saveFamily(Family fam) {
        familyService.saveFamily(fam);
    }

    public String prettyFormat() {
        return familyService.prettyFormat();
    }

}
