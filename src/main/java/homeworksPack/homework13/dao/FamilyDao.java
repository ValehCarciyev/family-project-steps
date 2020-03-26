package homeworksPack.homework13.dao;

import homeworksPack.homework13.humans.Family;

import java.util.List;

public interface FamilyDao {
    List<Family> getAllFamilies();

    Family getFamilybyIndex(int index);

    boolean deleteFamily(int index);

    boolean deleteFamily(Family family);

    void saveFamily(Family family);

    void loadData();
}
