package generics_find_maximum;

public class Main {
    public static void main(String[] args) {

        // Test Case - 1
        Integer int1 = 100;
        Integer int2 = 2;
        Integer int3 = 5;
        System.out.println("Maximum of (" + Integer.valueOf(int1) + " " + Integer.valueOf(int2) + " " + Integer.valueOf(int3) + ") is " + GetMaximum.getMaximum(int1, int2, int3));

        // Test Case - 2
        Integer int4 = 10;
        Integer int5 = 20;
        Integer int6 = 5;
        System.out.println("Maximum of (" + Integer.valueOf(int4) + " " + Integer.valueOf(int5) + " " + Integer.valueOf(int6) + ") is " + GetMaximum.getMaximum(int4, int5, int6));

        // Test Case - 3
        Integer int7 = 10;
        Integer int8 = 20;
        Integer int9 = 50;
        System.out.println("Maximum of (" + Integer.valueOf(int7) + " " + Integer.valueOf(int8) + " " + Integer.valueOf(int9) + ") is " + GetMaximum.getMaximum(int7, int8, int9));
        
        System.out.println();

        // Test Case - 1
        Float float1 = (float) 20.82;
        Float float2 = (float) 1.24;
        Float float3 = (float) 10.65;
        System.out.println("Maximum of (" + Float.valueOf(float1) + " " + Float.valueOf(float2) + " " + Float.valueOf(float3) + ") is " + GetMaximum.getMaximum(float1, float2, float3));

        // Test Case - 2
        Float float4 = (float) 20.82;
        Float float5 = (float) 100.24;
        Float float6 = (float) 10.65;
        System.out.println("Maximum of (" + Float.valueOf(float4) + " " + Float.valueOf(float5) + " " + Float.valueOf(float6) + ") is " + GetMaximum.getMaximum(float4, float5, float6));

        // Test Case - 3
        Float float7 = (float) 2.82;
        Float float8 = (float) 1.24;
        Float float9 = (float) 10.65;
        System.out.println("Maximum of (" + Float.valueOf(float7) + " " + Float.valueOf(float8) + " " + Float.valueOf(float9) + ") is " + GetMaximum.getMaximum(float7, float8, float9));
        System.out.println();

        // Test Case - 1
        String string1 = "Orange";
        String string2 = "Apple";
        String string3 = "Banana";
        System.out.println("Maximum of (" + String.valueOf(string1) + " " + String.valueOf(string2) + " " + String.valueOf(string3) + ") is " + GetMaximum.getMaximum(string1, string2, string3));

        // Test Case - 2
        String string4 = "Apple";
        String string5 = "Cherry";
        String string6 = "Banana";
        System.out.println("Maximum of (" + String.valueOf(string4) + " " + String.valueOf(string5) + " " + String.valueOf(string6) + ") is " + GetMaximum.getMaximum(string4, string5, string6));

        // Test Case - 3
        String string7 = "Apple";
        String string8 = "Banana";
        String string9 = "Peach";
        System.out.println("Maximum of (" + String.valueOf(string7) + " " + String.valueOf(string8) + " " + String.valueOf(string9) + ") is " + GetMaximum.getMaximum(string7, string8, string9));
        System.out.println();
    }
}