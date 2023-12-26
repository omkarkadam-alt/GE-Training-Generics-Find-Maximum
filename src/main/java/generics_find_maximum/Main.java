package generics_find_maximum;

public class Main {
    public static void main(String[] args) {

                // Test Case - 1
                Integer int1 = 100;
                Integer int2 = 2;
                Integer int3 = 5;
                GetMaximum<Integer> intTC = new GetMaximum<Integer>(int1, int2, int3);

                System.out.println("Maximum of (" + Integer.valueOf(int1) + " " + Integer.valueOf(int2) + " " + Integer.valueOf(int3) + ") is " + intTC.getMaximum());
        
                System.out.println();
        
                // Test Case - 2
                Float float1 = (float) 20.82;
                Float float2 = (float) 100.24;
                Float float3 = (float) 10.65;
                GetMaximum<Float> floatTC = new GetMaximum<Float>(float1, float2, float3);
                
                System.out.println("Maximum of (" + Float.valueOf(float1) + " " + Float.valueOf(float2) + " " + Float.valueOf(float3) + ") is " + floatTC.getMaximum());
        
                System.out.println();
        
                // Test Case - 3
                String string1 = "Apple";
                String string2 = "Banana";
                String string3 = "Peach";
                GetMaximum<String> stringTC = new GetMaximum<String>(string1, string2, string3);

                System.out.println("Maximum of (" + String.valueOf(string1) + " " + String.valueOf(string2) + " " + String.valueOf(string3) + ") is " + stringTC.getMaximum());
                System.out.println();
        

    }
}