package generics_find_maximum;

import java.util.Arrays;

public class GetMaximum <T extends Comparable<T>>{

    T[] arr;

    GetMaximum(T[] arr){
        this.arr = arr.clone();
    }

    void printMax(T maxElement){
        System.out.println("Maximum of the given array is: " + maxElement);
    }

    public T getMaximum(){
        T maxElement = GetMaximum.getMaximum(arr);
        printMax(maxElement);
        return maxElement;
    }

    static <T extends Comparable<T>> T getMaximum(T[] arr){
        
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

}
