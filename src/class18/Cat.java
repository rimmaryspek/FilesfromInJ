package class18;

public class Cat {
    private String name;
    private String breed;
    private int age;
    private double weight;

public Cat(String catName, String catBreed){
    name = catName;
    breed = catBreed;
}
    public Cat(String catname, String catbreed, int catage, double catweight) {
        name = catname;
        breed = catbreed;
        age = catage;
        weight = catweight;

    }

    public void printinfo() {
        System.out.println("name " + name + "breed " + breed + "age " + age + " Weight " + weight);
    }
}



