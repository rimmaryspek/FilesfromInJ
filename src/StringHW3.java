public class StringHW3 {
    public static void main(String[] args) {
        // *Write a program that reads two people's first name if they expecting boy or girl?
         //Based on the input suggests a name for a baby: Example Output:
         //Mom’s first name? Mary Dad’s first name? Daniel
                //Boy or Girl? boy Suggested baby name: DANRY
         //Example Output:Mom’s first name? Mary
        //Dad’s first name? Daniel
                // Boy or Girl? girl
                //Suggested baby name: MAIEL
        String motherName = "Rimma";
        String fatherName = "Azamat";
        boolean isBoy = false;

        if (isBoy) {
            String firstHalf = fatherName.substring(0, fatherName.length() / 2);
            String secondHalf = motherName.substring(motherName.length() / 2);
            System.out.println(firstHalf + secondHalf);

        } else {
            String firstHalf = motherName.substring(0, motherName.length() / 2);
            String secondHalf = fatherName.substring(fatherName.length() / 2);
            System.out.println(firstHalf + secondHalf);

        }
    }
}







