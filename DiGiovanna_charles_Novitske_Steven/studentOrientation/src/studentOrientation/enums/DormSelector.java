package studentOrientation.enums;

import studentOrientation.attributes.Duration;
import studentOrientation.attributes.Cost;
import studentOrientation.attributes.CarbonFootprint;
import studentOrientation.attributes.Effort;

public enum DormSelector {
    standOutside(Duration.standOutside,
                 Cost.standOutside,
                 CarbonFootprint.standOutside,
                 Effort.standOutside),

    gamingContest(Duration.gamingContest,
                  Cost.gamingContest,
                  CarbonFootprint.gamingContest,
                  Effort.gamingContest);

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