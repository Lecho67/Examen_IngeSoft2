import Factories.AppleFactory;
import Factories.ElectronicDeviceFactory;
import Factories.SamsungFactory;
import Products.Laptop;
import Products.Phone;
import Products.Tablet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ElectronicDeviceFactory samsungFactory = new SamsungFactory();
        ElectronicDeviceFactory appleFactory = new AppleFactory();

        // Creacion de dispositivos samsung
        Laptop samsungLaptop = samsungFactory.createLaptop();
        Phone samsungPhone = samsungFactory.createPhone();
        Tablet samsungTablet = samsungFactory.createTablet();

        samsungLaptop.specs();
        samsungPhone.specs();
        samsungTablet.specs();

        System.out.println("\n");
        // Creacion productos apple
        Laptop appleLaptop = appleFactory.createLaptop();
        Phone applePhone = appleFactory.createPhone();
        Tablet appleTablet = appleFactory.createTablet();

        applePhone.specs();
        appleLaptop.specs();
        appleTablet.specs();


    }
}