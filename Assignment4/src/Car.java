public class Car implements ICarBuilder {

    public String name = "Hyundai";
    public String wheels = "Common wheels";
    public String color = "White";
    public String engine = "Common engine";

    public Car Car() {
        return this;
    }

    @Override
    public Car setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Car setWheels(String wheels) {
        this.wheels = wheels;
        return this;
    }

    @Override
    public String getWheels() {
        return this.wheels;
    }

    @Override
    public Car setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Car setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public String getEngine() {
        return this.engine;
    }

    @Override
    public Car buildCar() {
        return this;
    }
}
