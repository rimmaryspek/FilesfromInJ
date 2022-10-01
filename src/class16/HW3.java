package class16;

public class HW3 {
  // Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    // Method should be available inside the class only where it was declared and executed by calling it is name.
    private String name(String word){
        return word.replaceAll("[^aiuoe]", "");
    }

    public static void main(String[] args) {
        HW3 vowel = new HW3();
        System.out.println(vowel.name("SyntaxTechnologies").toLowerCase());
    }
}
