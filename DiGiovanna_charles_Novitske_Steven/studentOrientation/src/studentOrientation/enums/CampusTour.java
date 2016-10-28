package studentOrientation.enums;

import studentOrientation.attributes.Duration;
import studentOrientation.attributes.Cost;
import studentOrientation.attributes.CarbonFootprint;
import studentOrientation.attributes.Effort;

public enum CampusTour {
  busRide (Duration.busRide,
          Cost.busRide,
          CarbonFootprint.busRide,
          Effort.busRide),

  onFoot (Duration.onFoot,
          Cost.onFoot,
          CarbonFootprint.onFoot,
          Effort.onFoot);

  //private final String name;
  private final double duration;
  private final double carbonFootprint;
  private final double cost;
  private final double effort;

  //public String getName() { return name; }
  public double getDuration() { return duration; }
  public double getCarbonFootprint() { return carbonFootprint; }
  public double getCost() { return cost; }
  public double getEffort() { return effort; }

  CampusTour(double durationIn, double costIn, double footprintIn, double effortIn) {
    // name = nameIn;
    duration = durationIn;
    carbonFootprint = footprintIn;
    cost = costIn;
    effort = effortIn;
  }
}