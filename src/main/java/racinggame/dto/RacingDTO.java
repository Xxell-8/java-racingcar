package racinggame.dto;

import java.util.List;

public class RacingDTO {
    private final List<CarDTO> cars;

    public RacingDTO(List<CarDTO> cars) {
        this.cars = cars;
    }

    public List<CarDTO> get() {
        return cars;
    }
}
