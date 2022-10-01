package class17;

public class Person {
    String name;
    String calar;
    String country;
    int age;
    double weight;
    String haircolor;
    String eyecolor;
    double height;
    char gender;
    public Person(){

    }
    public Person(String perName){
        name=perName;
    }
    public Person(String name, String calar, String country, int age, double weight, String haircolor, String eyecolor, double height, char gender) {
        this.name = name;
        this.calar = calar;
        this.country = country;
        this.age = age;
        this.weight = weight;
        this.haircolor = haircolor;
        this.eyecolor = eyecolor;
        this.height = height;
        this.gender = gender;
    }


    public static void main(String[] args) {
Person person=new Person();
Person person1 = new Person("asma");


    }
}