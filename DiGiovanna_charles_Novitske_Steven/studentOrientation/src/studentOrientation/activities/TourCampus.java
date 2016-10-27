package studentOrientation.activities;

import studentOrientation.attributes.DurationI;
import studentOrientation.attributes.CostI;
import studentOrientation.attributes.CarbonFootprintI;
import studentOrientation.attributes.EffortI;

public interface TourCampus extends ActivityI {
  public enum CampusTour {
    busRide (DurationI.Duration.busRide,
            CostI.Cost.busRide,
            CarbonFootprintI.CarbonFootprint.busRide,
            EffortI.Effort.busRide),

    onFoot (DurationI.Duration.onFoot,
            CostI.Cost.onFoot,
            CarbonFootprintI.CarbonFootprint.onFoot,
            EffortI.Effort.onFoot);

    private final double duration;
    private final double carbonFootprint;
    private final double cost;
    private final double effort;

    public double getDuration() { return duration; }
    public double getCarbonFootprint() { return carbonFootprint; }
    public double getCost() { return cost; }
    public double getEffort() { return effort; }

    CampusTour(double durationIn, double costIn, double footprintIn, double effortIn) {
      duration = durationIn;
      carbonFootprint = footprintIn;
      cost = costIn;
      effort = effortIn;
    }
  }
}
