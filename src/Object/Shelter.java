package Object;

public class Shelter {
    public static void main(String[] args) {
        Dog.breed="husky";
        Dog dog1 =new Dog();
        dog1.name="bobby";
        dog1.weight=5;

        Dog do2 =new Dog();
        System.out.println(do2.name);
        do2.name="tommy";
        do2.weight=10;
    }
}
