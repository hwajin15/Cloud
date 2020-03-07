package generic;

public class GenericTest {
    public static void main(String[] args) {
        GenericPrinter<Power>  powerGenericPrinter = new GenericPrinter<Power>();
        Power power = new Power();
        powerGenericPrinter.setMaterial(power);
        System.out.println(powerGenericPrinter);


        GenericPrinter<Plastic>  plasticGenericPrinter = new GenericPrinter<Plastic>();
        Plastic plastic = new Plastic();
        plasticGenericPrinter.setMaterial(plastic);
        System.out.println(plasticGenericPrinter);

        plasticGenericPrinter.priting();
        powerGenericPrinter.priting();

    }
}
