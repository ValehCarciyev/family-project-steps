package homeworksPack.homework9.dao;

import homeworksPack.homework9.Family;

import java.util.List;

public interface FamilyDao {
    List<Family> getAllFamilies();
    Family getFamilyByIndex(int index);
    boolean deleteFamily(int index);
    boolean deleteFamily(Family fam);
    void saveFamily(Family fam);
}
