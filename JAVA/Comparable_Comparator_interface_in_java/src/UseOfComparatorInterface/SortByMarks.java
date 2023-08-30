package UseOfComparatorInterface;

import java.util.Comparator;

public class SortByMarks implements Comparator<StudentClass> {

    @Override
    public int compare(StudentClass student1, StudentClass student2) {
        if(student1.getMarks() == student2.getMarks()){
            return 0;
        } else if (student1.getMarks() < student2.getMarks()) {
            return 1;
        }else {
            return -1;
        }
    }
}
