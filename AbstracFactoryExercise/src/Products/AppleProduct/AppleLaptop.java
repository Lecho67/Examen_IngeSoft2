package Products.AppleProduct;

import Products.Laptop;

public class AppleLaptop implements Laptop {
    private String model;
    private String OperativeSystem;

    public AppleLaptop(String model, String operativeSystem) {
        this.model = model;
        OperativeSystem = operativeSystem;
    }

    @Override
    public void specs() {
        System.out.println("tu laptop " + model + " tiene el sistema operativo " + OperativeSystem);
    }
}
