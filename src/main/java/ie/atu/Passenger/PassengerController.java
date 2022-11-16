package ie.atu.Passenger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(path = "api/passenger")

public class PassengerController {
    public List<Passenger> myPassengers = List.of(
            new Passenger("Mr", "Conor", "123", "0879543461", 21),
            new Passenger("Mr", "Conor2", "456", "091098765", 24),
            new Passenger("Mr", "Conor3", "789", "087123456", 21)
    );

    @GetMapping
    public List<Passenger> getMyPassengers() {
        return myPassengers;
    }

}
