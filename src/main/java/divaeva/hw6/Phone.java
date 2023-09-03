package divaeva.hw6;

public class Phone {
    String number;
    double weight;
    String model;

    public Phone(String number, double weight, String model) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    public void receiveCall(String name) {
        System.out.println("Calling : " + name);
    }

    public String getNumber() {
        return number;
    }
}

