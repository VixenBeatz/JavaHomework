public class Main {
    public static void main(String[] args) {
        Car commonCar = new Car().buildCar();
        Car fancyCar = new Car().setColor("Purple").setEngine("Fast engine").setWheels("Fancy wheels").buildCar();

        System.out.println("Common car specs: \n" + "name: " + commonCar.name +
                ";\ncolor: " + commonCar.color +
                ";\nengine: " + commonCar.engine +
                ";\nwheels: " + commonCar.wheels + ".");
        System.out.println("\n------------------------------\n");
        System.out.println("Fancy car specs: \n" + "name: " + fancyCar.name +
                ";\ncolor: " + fancyCar.color +
                ";\nengine: " + fancyCar.engine +
                ";\nwheels: " + fancyCar.wheels + ".");
    }
}
