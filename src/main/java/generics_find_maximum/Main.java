package generics_find_maximum;

public class Main {
    public static void main(String[] args) {

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
    }
}