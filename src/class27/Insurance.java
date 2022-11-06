package class27;

public abstract class Insurance {
    String incuranceName;
    Insurance(String incuranceName){
        this.incuranceName=incuranceName;
    }

    abstract void getQuote();
    abstract void cencelInsurance();

    @Override
    public String toString() {
        return "Insurance{" +
                "incuranceName='" + incuranceName + '\'' +
                '}';
    }
}
class Car extends Insurance{
String carModel;

    Car(String incuranceName, String carModel) {
        super(incuranceName);
        this.carModel = carModel;
    }

    Car(String incuranceName) {
        super(incuranceName);// calls the parent class constractor
    }

    @Override
    void getQuote() {
        System.out.println(incuranceName+"3% of the cal value"+carModel);
    }

    @Override
    void cencelInsurance() {
        System.out.println(incuranceName+"has been canceled");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                '}';
    }
}
class Pet extends Insurance{
    String petType;
    Pet(String incuranceName, String petType) {
        super(incuranceName);
        this.petType=petType;
        System.out.println(incuranceName+ "charger 1500USD for " +petType);
    }

    @Override
    void getQuote() {

    }

    @Override
    void cencelInsurance() {
        System.out.println(incuranceName+" has been canceled for "+ petType);

    }

    @Override
    public String toString() {
        return "Pet{" +
                "petType='" + petType + '\'' +
                '}';
    }
}
class Health extends Insurance{
    public Health(String incuranceName) {
        super(incuranceName);
    }

    @Override
    void getQuote() {
        System.out.println(incuranceName+"charges 2000USD for health");
    }

    @Override
    void cencelInsurance() {
        System.out.println(incuranceName+ "has been cancelled");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}