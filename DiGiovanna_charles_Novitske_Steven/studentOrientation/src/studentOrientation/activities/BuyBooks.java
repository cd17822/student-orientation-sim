package studentOrientation.activities;

import studentOrientation.attributes.DurationI;
import studentOrientation.attributes.CostI;
import studentOrientation.attributes.CarbonFootprintI;
import studentOrientation.attributes.EffortI;

public interface BuyBooks extends ActivityI {
    public enum BookStore {
        mandoBooks (DurationI.Duration.mandoBooks,
                    CostI.Cost.mandoBooks,
                    CarbonFootprintI.CarbonFootprint.mandoBooks,
                    EffortI.Effort.mandoBooks),

        buBookStore(DurationI.Duration.buBookStore,
                    CostI.Cost.buBookStore,
                    CarbonFootprintI.CarbonFootprint.buBookStore,
                    EffortI.Effort.buBookStore);

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
}