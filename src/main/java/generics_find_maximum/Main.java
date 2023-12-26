package generics_find_maximum;

public class Main {
    public static void main(String[] args) {

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
    }
}