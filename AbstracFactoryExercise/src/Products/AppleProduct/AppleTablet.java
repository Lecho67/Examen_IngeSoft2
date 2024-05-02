package Products.AppleProduct;

import Products.Tablet;

public class AppleTablet implements Tablet {
    private String model;
    private String OperativeSystem;

    public AppleTablet(String model, String operativeSystem) {
        this.model = model;
        OperativeSystem = operativeSystem;
    }

    @Override
    public void specs() {
        System.out.println("tu tablet " + model + " tiene el sistema operativo " + OperativeSystem);
    }
}
