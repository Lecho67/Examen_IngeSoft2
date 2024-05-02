package Products.SamsungProducts;

import Products.Phone;

public class SamsungPhone implements Phone {
    private String model;
    private String OperativeSystem;

    public SamsungPhone(String model, String operativeSystem) {
        this.model = model;
        OperativeSystem = operativeSystem;
    }

    @Override
    public void specs() {
        System.out.println("tu celular " + model + " tiene el sistema operativo " + OperativeSystem);
    }

}
