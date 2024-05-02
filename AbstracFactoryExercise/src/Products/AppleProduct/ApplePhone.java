package Products.AppleProduct;

import Products.Phone;

public class ApplePhone implements Phone {

    private String model;
    private String OperativeSystem;

    public ApplePhone(String model, String operativeSystem) {
        this.model = model;
        OperativeSystem = operativeSystem;
    }

    @Override
    public void specs() {
        System.out.println("tu celular " + model + " tiene el sistema operativo " + OperativeSystem);
    }
}
