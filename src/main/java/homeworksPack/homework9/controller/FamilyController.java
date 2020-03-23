package homeworksPack.homework9.controller;

import homeworksPack.homework9.*;
import homeworksPack.homework9.humans.Human;
import homeworksPack.homework9.humans.Man;
import homeworksPack.homework9.humans.Woman;
import homeworksPack.homework9.service.FamilyService;

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

    public Family getFamilyById(int index) {
        return familyService.getFamilyById(index);
    }

    public HashSet<Pet> getPets(int index) {
        return familyService.getPets(index);
    }

    public void addPet(int index, Pet p) {
        familyService.addPet(index, p);
    }

}
