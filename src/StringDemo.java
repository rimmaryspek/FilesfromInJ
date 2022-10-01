public class StringDemo {
    public static void main (String[]args){
        String str = new String("Java"); // is proper way
        // Counts the number of characters in a string including the space
        System.out.println(str.length());
   String name="Rimma Kenzhetaeva";// easier way and only work with the Wrapper classes
        System.out.println(name.length()); // length means counts the size of characters and size one be one
      if(name.length()>15){
          System.out.println("name cants be more that 15");
      }
    }
}
