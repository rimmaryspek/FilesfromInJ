package class16;

public class Task1Tester {
    public static void main(String[] args) {
        SyntaxEmployee syntaxEmployee =new SyntaxEmployee();
        syntaxEmployee.empId="123";
        syntaxEmployee.salary=10000;

        SyntaxEmployee.CEO="Asel";// chaging to Asel
        System.out.println(SyntaxEmployee.CEO);

        SyntaxEmployee rimmaEmployee =new SyntaxEmployee();
        rimmaEmployee .empId="123";
        rimmaEmployee .salary=10000;

        System.out.println(rimmaEmployee.CEO);

    }
}
