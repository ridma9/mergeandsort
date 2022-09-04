import com.mergeandsort.MergeArray;
import com.mergeandsort.SortArray;

public class Main {
    public static void main(String[] args) {

        int [] array1={5,-8,3,2,1,56,34,5};
        int [] array2={9,8,7,25};
        int [] array3={15,25,13,19,11};

        MergeArray mergeAndSort=new MergeArray();
        int [] mergedarray=mergeAndSort.merge(array1,array2,array3);
        System.out.print("Merged Array : ");
        for (int num:mergedarray) {
            System.out.print("  "+num);
        }

        System.out.println();
        System.out.print("Sorted Array : ");
        SortArray newSort = new SortArray();
        int [] finalarray = newSort.newSort(mergedarray);

        for (int num:finalarray) {
            System.out.print("  "+num);
        }

    }
}