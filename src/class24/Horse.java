package class24;

public class Horse {
  private   String name;
   private String breed;
  private   int age;
  private   double weight;

    public Horse(String name, String breed, int age, double weight) {
        setName(name);
        setAge(age);
        setBreed(breed);
        setWeight(weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>10){
            System.out.println("Name can not be more then 11 letters");
        }else if(name.isEmpty()){
            System.out.println("Name can not be empty");
        }else{
            this.name = name;
        }
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (breed.isEmpty()){
            System.out.println("Breed can not be ampty");
        } else if (breed.length()>15) {
            System.out.println("Breed can not be mote then 15 letters");
        }else{
            this.breed = breed;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            System.out.println("age con not be negative");
        }else{
            this.age = age;
        }
    }
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static void main(String[] args) {
        Horse h = new Horse("Ak","German",10,130);
        System.out.println(h.getName());
        System.out.println(h.getBreed());
        System.out.println(h.getAge());
        System.out.println(h.getWeight());

    }
}
