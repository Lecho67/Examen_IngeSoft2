package Products.SamsungProducts;

import Products.Laptop;

public class SamsungLaptop implements Laptop {
    private String model;
    private String OperativeSystem;

    public SamsungLaptop(String model, String operativeSystem) {
        this.model = model;
        OperativeSystem = operativeSystem;
    }

    @Override
    public void specs() {
        System.out.println("tu laptop " + model + " tiene el sistema operativo " + OperativeSystem);
    }
}
