package com.mergeandsort;

public class MergeArray {

    public int[] merge(int array1[], int array2[], int array3[]){

        int length=array1.length+array2.length+array3.length;
        int [] array4=new int[length];
        int position=0;

        for(int i=0;i<array1.length;i++) {
            array4[position] = array1[i];
            position++;
        }

        for(int i=0;i<array2.length;i++) {
            array4[position] = array2[i];
            position++;
        }

        for(int i=0;i<array3.length;i++) {
            array4[position] = array3[i];
            position++;
        }

        return array4;

    }

}
