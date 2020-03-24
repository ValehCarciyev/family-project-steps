package homeworksPack.homework10.dao;

import homeworksPack.homework10.humans.Family;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements FamilyDao {
    List<Family> familyList = new ArrayList<>();

    @Override
    public List<Family> getAllFamilies() {
        return familyList;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        return familyList.get(index);
    }

    @Override
    public boolean deleteFamily(int index) {
        if (index < 0 || index > familyList.size())  return false;
        familyList.remove(index); return true;
    }

    @Override
    public boolean deleteFamily(Family family) {
        familyList.remove(familyList.get(familyList.indexOf(family)));
        familyList.remove(family);
        return true;
    }

    @Override
    public void saveFamily(Family family) {
        if (!familyList.contains(family))
            familyList.add(family);
    }
}
