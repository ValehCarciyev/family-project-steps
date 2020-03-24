package homeworksPack.homework9.dao;

import java.util.List;

public interface FamilyDao<Family> {
    List<Family> getAllFamilies();
    Family getFamilyByIndex(int index);
    boolean deleteFamily(int index);
    boolean deleteFamily(Family fam);
    void saveFamily(Family fam);
}
