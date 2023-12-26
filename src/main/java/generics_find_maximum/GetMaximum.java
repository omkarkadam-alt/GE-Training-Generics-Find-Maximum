package generics_find_maximum;

public class GetMaximum {
    
    static Integer getMaximum(Integer num1, Integer num2, Integer num3){

        return (num1.compareTo(num2) > 0 ? (num1.compareTo(num3) > 0 ? num1: num3): (num2.compareTo(num3) > 0 ? num2: num3));
    }

}
