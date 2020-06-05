package pk.cui.sc.builderExample.builders;

import pk.cui.sc.builderExample.cars.Type;
import pk.cui.sc.builderExample.components.Engine;
import pk.cui.sc.builderExample.components.GPSNavigator;
import pk.cui.sc.builderExample.components.Transmission;
import pk.cui.sc.builderExample.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}