public interface ICarBuilder {
    Car setName(String name);

    String getName();

    Car setWheels(String wheels);

    String getWheels();

    Car setColor(String color);

    String getColor();

    Car setEngine(String engine);

    String getEngine();

    Car buildCar();
}
