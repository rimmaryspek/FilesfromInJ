package class24;

public class Doggy {
    private String name;
    private String breed;
    private int age;
    private double weight;
    private String color;

    public Doggy(String name, String breed, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.color=color;
    }
void setName(String name){
        if (name.length()>30) {
            System.out.println("Name can't be more than 30 letters. Please try again");
        } else if (name.isEmpty()) {
            System.out.println("Name can't be empty Please try again");
        }else {
            this.name=name;
        }
}

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }
    public static void main(String[] args) {
        Doggy d = new Doggy("Tommy","German",15,120);
        System.out.println(d.getAge());
        System.out.println(d.getName());
        System.out.println(d.getBreed());
        System.out.println(d.getWeight());

    }
}

