package class30EXCEPTION;

public class FixIssue {
    public static void main(String[] args) {
        try{// using TRY keyword we are trying to execute the code
            String name = null;
            System.out.println(name.length()); // line that contains issues
        }catch(Exception canBeAnyName){// catching  the error and skip that errow so thaw code can run but, we still need to fix it
            System.out.println("Back up code");
        }
        // line that contains issue
        System.out.println("some important lines of code 1");
        System.out.println("some important code line 2");
        System.out.println("some important code line 3");
        System.out.println("some important code line 4");

        System.out.println("some important code line 5");
        System.out.println("some important code line 6");
        System.out.println("some important code line 7");
        System.out.println("some important code line 8");

    }
}
