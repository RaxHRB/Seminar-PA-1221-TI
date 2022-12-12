package com.mycompany.seminar2;
//Bodolica Razvan-Gabriel  1221 B TI

public class seminar2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        double[] payments = {3.35, 12.07, 7.33, 6.04, 6.25, 3.45, 3.45, 0.52};
        
        double searchkey = 7.33;
        
        System.out.println("Search key found at: " + sequentialSearch(payments,searchkey));
    }
    public static double sequentialSearch(double[] arr, double key){
        int arraySize = arr.length;
        for(int i=0; i < arraySize; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
             
}
