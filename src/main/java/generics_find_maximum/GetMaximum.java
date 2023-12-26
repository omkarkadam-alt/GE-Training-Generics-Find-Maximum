package generics_find_maximum;

public class GetMaximum {

    static <T extends Comparable<T>> T getMaximum(T element1, T element2, T element3){
        
        return (element1.compareTo(element2) > 0 ? (element1.compareTo(element3) > 0 ? element1: element3): (element2.compareTo(element3) > 0 ? element2: element3));
    }

}
