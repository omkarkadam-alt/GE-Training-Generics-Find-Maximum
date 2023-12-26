package generics_find_maximum;

public class GetMaximum {
    
    static Integer getMaximum(Integer num1, Integer num2, Integer num3){

        return (num1.compareTo(num2) > 0 ? (num1.compareTo(num3) > 0 ? num1: num3): (num2.compareTo(num3) > 0 ? num2: num3));
    }

    static Float getMaximum(Float float1, Float float2, Float float3){
       
        return (float1.compareTo(float2) > 0 ? (float1.compareTo(float3) > 0 ? float1: float3): (float2.compareTo(float3) > 0 ? float2: float3));
    }

    static String getMaximum(String string1, String string2, String string3){

        return (string1.compareTo(string2) > 0 ? (string1.compareTo(string3) > 0 ? string1: string3): (string2.compareTo(string3) > 0 ? string2: string3));
    }

}
