package generics_find_maximum;

public class GetMaximum <T extends Comparable<T>>{

    T element1;
    T element2;
    T element3;

    GetMaximum(T element1, T element2, T element3){
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
    }

    public T getMaximum(){
        return GetMaximum.getMaximum(element1, element2, element3);
    }

    static <T extends Comparable<T>> T getMaximum(T element1, T element2, T element3){
        
        return (element1.compareTo(element2) > 0 ? (element1.compareTo(element3) > 0 ? element1: element3): (element2.compareTo(element3) > 0 ? element2: element3));
    }

}
