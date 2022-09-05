package com.mergeandsort;

public class SortArray {

    public int[] newSort(int array[]){

        for (int i=0;i< array.length;i++){

            for (int j=i;j< array.length;j++){

                if (array[i]<=array[j]){
                    int x=array[i];
                    array[i]=array[j];
                    array[j]=x;

                }
            }
        }
        return array;
    }
}



