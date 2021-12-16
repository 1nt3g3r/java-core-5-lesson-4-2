import java.util.Objects;

public class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Car) {
            Car another = (Car) o;
            return model.equals(another.getModel());
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota Camry");
        Car car2 = new Car("Toyota Camry");

        System.out.println(car1.equals(null));
    }
}
