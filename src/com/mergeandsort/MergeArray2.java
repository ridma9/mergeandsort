package com.mergeandsort;

public class MergeArray2 {

    private  int []array1;
    private int []array2;
    private int []array3;

    public MergeArray2(int []array1,int []array2,int []array3){
        this.array1=array1;
        this.array2=array2;
        this.array3=array3;
    }

    public int[] getArray1() {
        return array1;
    }

    public void setArray1(int[] array1) {
        this.array1 = array1;
    }

    public int[] getArray2() {
        return array2;
    }

    public void setArray2(int[] array2) {
        this.array2 = array2;
    }

    public int[] getArray3() {
        return array3;
    }

    public void setArray3(int[] array3) {
        this.array3 = array3;
    }

    public int[] merge(){

        int length=this.array1.length+this.array2.length+this.array3.length;
        int [] array4=new int[length];
        int position=0;

        for(int i=0;i<this.array1.length;i++) {
            array4[position] = this.array1[i];
            position++;
        }

        for(int i=0;i<this.array2.length;i++) {
            array4[position] = this.array2[i];
            position++;
        }

        for(int i=0;i<this.array3.length;i++) {
            array4[position] = this.array3[i];
            position++;
        }

        return array4;

    }

}
