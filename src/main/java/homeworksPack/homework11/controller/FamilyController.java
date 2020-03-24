package homeworksPack.homework11.controller;

import homeworksPack.homework11.animals.Pet;
import homeworksPack.homework11.humans.Family;
import homeworksPack.homework11.humans.Human;
import homeworksPack.homework11.humans.Man;
import homeworksPack.homework11.humans.Woman;
import homeworksPack.homework11.service.FamilyService;

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
