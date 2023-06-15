import java.lang.String;
class Mobile {
    private String manufacture,operating_system,model;
    private double cost;

    public Mobile(String manufacture, String operating_system, String model, double cost) {
        this.manufacture = manufacture;
        this.operating_system = operating_system;
        this.model = model;
        this.cost = cost;
    }

    public Mobile(String manufacture, String operating_system) {
        this.manufacture = manufacture;
        this.operating_system = operating_system;
    }

    @Override
    public String toString() {
        return "Manufacture: " + manufacture +
                "\nOperating System: " + operating_system +
                "\nModel: " + model +
                "\nCost: $" + cost;
    }
}

