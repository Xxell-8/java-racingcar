package racinggame.dto;

import racinggame.domain.Car;

public class CarDTO {

    private String name;
    private int location;

    public CarDTO(String name, int location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public int getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public static CarDTO from(Car car) {
        return new CarDTO(car.getName(), car.getLocation());
    }
}
