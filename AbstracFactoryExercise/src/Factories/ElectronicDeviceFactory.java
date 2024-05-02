package Factories;

import Products.Laptop;
import Products.Phone;
import Products.Tablet;

public interface ElectronicDeviceFactory {
    public Laptop createLaptop();
    public Phone createPhone();
    public Tablet createTablet();


}
