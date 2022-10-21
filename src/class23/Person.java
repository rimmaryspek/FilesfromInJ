package class23;

public interface Person {
    void eat();

    interface Employee{
        void work();
    }
interface SyntaxEmployee extends Employee,Person{
        void creatrepl();
}
class Rimma implements  SyntaxEmployee{

    @Override
    public void eat() {
        System.out.println("like to eat fish");
    }

    @Override
    public void work() {
        System.out.println("Theaches batch14");
    }

    @Override
    public void creatrepl() {
        System.out.println("Creats a repl");
    }
}

}
