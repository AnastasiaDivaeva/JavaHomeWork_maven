package divaeva.hw6;

public class Task1 {
    public static void main(String[] args) {
        Phone phone1 = new Phone("380668879397", 188.0, "Samsung");

        Phone phone2 = new Phone("380502152289", "iPhone");
        phone2.weight = 7.98;

        Phone phone3 = new Phone();
        phone3.number = "0999999";
        phone3.model="S12";
        phone3.weight=215;


        System.out.println("Phone1");
        System.out.println("Number: " + phone1.getNumber());
        System.out.println("Weight: " + phone1.weight);
        System.out.println("Model: " + phone1.model);

        System.out.println("Phone2");
        System.out.println("Number :" + phone2.getNumber());
        System.out.println("Weight :" + phone2.weight);
        System.out.println("Model :" + phone3.model);

        System.out.println("Phone3");
        System.out.println("Number :" + phone3.getNumber());
        System.out.println("Weight :" + phone3.weight);
        System.out.println("Model :" + phone3.model);

        phone1.receiveCall("Nastya");
        phone2.receiveCall("Kolya");
        phone3.receiveCall("Alla");


    }
}
