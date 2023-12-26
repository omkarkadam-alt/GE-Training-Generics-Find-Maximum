package generics_find_maximum;

import java.util.Arrays;

public class GetMaximum <T extends Comparable<T>>{

    T[] arr;

    GetMaximum(T[] arr){
        this.arr = arr.clone();
    }

    public T getMaximum(){
        return GetMaximum.getMaximum(arr);
    }

    static <T extends Comparable<T>> T getMaximum(T[] arr){
        
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

}
