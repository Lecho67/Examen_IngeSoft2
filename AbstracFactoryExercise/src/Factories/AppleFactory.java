package Factories;

import Products.AppleProduct.AppleLaptop;
import Products.AppleProduct.ApplePhone;
import Products.AppleProduct.AppleTablet;
import Products.Laptop;
import Products.Phone;
import Products.Tablet;

public class AppleFactory implements ElectronicDeviceFactory{

    @Override
    public Tablet createTablet() {
        return new AppleTablet("Ipad","iOS");
    }

    @Override
    public Phone createPhone() {
        return new ApplePhone("Iphone","iOS");
    }

    @Override
    public Laptop createLaptop() {
        return new AppleLaptop("MacBook","MacOs");
    }
}
