package studentOrientation.enums;

import studentOrientation.attributes.Duration;
import studentOrientation.attributes.Cost;
import studentOrientation.attributes.CarbonFootprint;
import studentOrientation.attributes.Effort;

public enum BookStore {
    mandoBooks (Duration.mandoBooks,
                Cost.mandoBooks,
                CarbonFootprint.mandoBooks,
                Effort.mandoBooks),

    buBookStore(Duration.buBookStore,
                Cost.buBookStore,
                CarbonFootprint.buBookStore,
                Effort.buBookStore);

    private final double duration;
    private final double carbonFootprint;
    private final double cost;
    private final double effort;

    public double getDuration() { return duration; }
    public double getCarbonFootprint() { return carbonFootprint; }
    public double getCost() { return cost; }
    public double getEffort() { return effort; }

    // Constructor
    BookStore(double durationIn,
                   double costIn,
                   double carbonFootprintIn,
                   double effortIn) {
        duration = durationIn;
        cost = costIn;
        carbonFootprint = carbonFootprintIn;
        effort = effortIn;
    }
}
