package UseOfComparatorInterface;

import java.util.Comparator;

public class SortByName implements Comparator<StudentClass> {
    @Override
    public int compare(StudentClass student1, StudentClass student2) {
        return student1.getName().compareTo(student2.getName());
    }
}
