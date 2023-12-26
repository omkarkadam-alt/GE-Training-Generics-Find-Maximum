package generics_find_maximum;

public class Main {
    public static void main(String[] args) {

                // Test Case - 1
                Integer intArr[] = {100, 2, 5, 98, 64};
                GetMaximum<Integer> intTC = new GetMaximum<Integer>(intArr);

                System.out.println("Maximum of the array is: " + intTC.getMaximum());
        
                System.out.println();

                // Test Case - 2
                Float floatArr[] = {(float)20.82, (float)100.24, (float)10.65, (float)13.48, (float)7.82};
                GetMaximum<Float> floatTC = new GetMaximum<Float>(floatArr);

                System.out.println("Maximum of the array is: " + floatTC.getMaximum());
        
                System.out.println();

                
                // Test Case - 3
                String stringArr[] = {"Apple", "Peach", "Bananas", "Cherry", "Orange"};
                GetMaximum<String> stringTC = new GetMaximum<String>(stringArr);

                System.out.println("Maximum of the array is: " + stringTC.getMaximum());
        
                System.out.println();
    }
}