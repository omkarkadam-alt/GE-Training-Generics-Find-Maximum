package generics_find_maximum;

public class Main {
    public static void main(String[] args) {

        // Test Case - 1
        Integer int1 = 20;
        Integer int2 = 1;
        Integer int3 = 10;
        System.out.println("Maximum of (" + Integer.valueOf(int1) + " " + Integer.valueOf(int2) + " " + Integer.valueOf(int3) + ") is " + GetMaximum.getMaximum(int1, int2, int3));

        // Test Case - 2
        Integer int4 = 20;
        Integer int5 = 100;
        Integer int6 = 10;
        System.out.println("Maximum of (" + Integer.valueOf(int4) + " " + Integer.valueOf(int5) + " " + Integer.valueOf(int6) + ") is " + GetMaximum.getMaximum(int4, int5, int6));

        // Test Case - 3
        Integer int7 = 2;
        Integer int8 = 1;
        Integer int9 = 10;
        System.out.println("Maximum of (" + Integer.valueOf(int7) + " " + Integer.valueOf(int8) + " " + Integer.valueOf(int9) + ") is " + GetMaximum.getMaximum(int7, int8, int9));
    }
}