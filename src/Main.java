import com.mergeandsort.MergeArray;
import com.mergeandsort.MergeArray2;
import com.mergeandsort.SortArray;
import com.mergeandsort.SortArray2;

public class Main {
    public static void main(String[] args) {

        int [] array1={5,-8,3,2,1,56,34,5};
        int [] array2={9,8,7,25};
        int [] array3={15,25,13,19,11};

        MergeArray2 mergeAndSort=new MergeArray2(array1,array2,array3);
        int [] mergedarray=mergeAndSort.merge();
        System.out.print("Merged Array : ");
        for (int num:mergedarray) {
            System.out.print("  "+num);
        }

        System.out.println();
        System.out.print("Sorted Array : ");
        SortArray2 newSort = new SortArray2(mergedarray);
        int [] finalarray = newSort.newSort();

        for (int num:finalarray) {
            System.out.print("  "+num);
        }

    }
}