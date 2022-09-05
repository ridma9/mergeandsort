package com.mergeandsort;

public class SortArray2 {
    private int []array;

    public SortArray2(int array[]){
        this.array=array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] newSort(){

        for (int i=0;i< this.array.length;i++){

            for (int j=i;j< this.array.length;j++){

                if (this.array[i]<=this.array[j]){
                    int x=this.array[i];
                    this.array[i]=this.array[j];
                    this.array[j]=x;

                }
            }
        }
        return array;
    }
}



