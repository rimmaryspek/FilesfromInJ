package class22;

public class Parent {
    public class parent {
        static void print(){
            System.out.println("Hello World");
        }


    }
    class Child extends parent {
        static void print(){
            System.out.println("Hello There");
        }


    }
    class Test
    {
        public static void main(String[] args) {
            Child.print();
        }
    }
}
