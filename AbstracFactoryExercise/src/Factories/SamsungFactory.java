package Factories;

import Products.Laptop;
import Products.Phone;
import Products.SamsungProducts.SamsungLaptop;
import Products.SamsungProducts.SamsungPhone;
import Products.SamsungProducts.SamsungTablet;
import Products.Tablet;

public class SamsungFactory implements ElectronicDeviceFactory{
    @Override
    public Laptop createLaptop() {
        return new SamsungLaptop("GalaxyBook","Windows");
    }

    @Override
    public Phone createPhone() {
        return new SamsungPhone("SamsungGalaxy","Android");
    }

    @Override
    public Tablet createTablet() {
        return new SamsungTablet("galaxyTap","Android");
    }
}
