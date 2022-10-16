package class21;

public class Main {
        public static void main(String[] args) {

        }
        class A {

            A(String word){

            }

            A(){
                System.out.println("I");
            }
        }
        class B extends A{
            B(){
                super();
                System.out.println("am");
            }
        }
        class C extends B {
            C(){
                super();
                System.out.println("a tester");
            }

        }

    }

