package studentOrientation.activities;

import studentOrientation.attributes.DurationI;
import studentOrientation.attributes.CostI;
import studentOrientation.attributes.CarbonFootprintI;
import studentOrientation.attributes.EffortI;

public interface SelectDorm extends ActivityI {
    public enum DormSelector {
        standOutside(DurationI.Duration.standOutside,
                     CostI.Cost.standOutside,
                     CarbonFootprintI.CarbonFootprint.standOutside,
                     EffortI.Effort.standOutside),

        gamingContest(DurationI.Duration.gamingContest,
                      CostI.Cost.gamingContest,
                      CarbonFootprintI.CarbonFootprint.gamingContest,
                      EffortI.Effort.gamingContest);

        private final double duration;
        private final double carbonFootprint;
        private final double cost;
        private final double effort;

        public double getDuration() { return duration; }
        public double getCarbonFootprint() { return carbonFootprint; }
        public double getCost() { return cost; }
        public double getEffort() { return effort; }

        // Constructor
        DormSelector(double durationIn,
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