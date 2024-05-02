package Products.SamsungProducts;

import Products.Tablet;

public class SamsungTablet implements Tablet {

    private String model;
    private String OperativeSystem;

    public SamsungTablet(String model, String operativeSystem) {
        this.model = model;
        OperativeSystem = operativeSystem;
    }

    @Override
    public void specs() {
        System.out.println("tu tablet " + model + " tiene el sistema operativo " + OperativeSystem);
    }
}
