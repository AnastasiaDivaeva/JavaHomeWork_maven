package divaeva.hw13;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("Task2.json");
        Gson gson = new Gson();
        Box box = gson.fromJson(reader, Box.class);
        System.out.println("From: " + box.getFrom());
        System.out.println("Material: " + box.getMaterial());
        System.out.println("Color: " + box.getColor());
        System.out.println("Max Lifting Capacity: " + box.getMaxLiftingCapacity().getValue() + " " + box.getMaxLiftingCapacity().getUnit());
        System.out.println("Cargo Name: " + box.getCargo().getName());
        System.out.println("Cargo Class: " + box.getCargo().getClazz());
        System.out.println("Delivery Date: " + box.getDeliveryDate());
    }
}
