package racinggame;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import racinggame.domain.Car;
import racinggame.domain.Racing;
import racinggame.dto.CarDTO;
import racinggame.dto.RacingDTO;
import racinggame.view.InputView;
import racinggame.view.ResultView;

public class Application {
    public static void main(String[] args) {
        List<String> carNames = InputView.getCarNames();
        int tryNumber = InputView.getTryNumber();

        Racing game = Racing.fromCarNames(carNames);
        List<RacingDTO> results = new ArrayList<>();
        race(tryNumber, game, results);

        ResultView.printResult(results, game.getWinnersName());
    }

    private static void race(int tryNumber, Racing game, List<RacingDTO> results) {
        while (tryNumber > 0) {
            RacingDTO result = new RacingDTO(convertCars(game.race()));
            results.add(result);
            tryNumber--;
        }
    }

    private static List<CarDTO> convertCars(List<Car> cars) {
        return cars.stream()
            .map(CarDTO::from)
            .collect(Collectors.toList());
    }
}
