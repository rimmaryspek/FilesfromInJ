package class18;

public class Cat extends Animal{

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



