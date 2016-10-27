package studentOrientation.activities;

import studentOrientation.attributes.Duration;
import studentOrientation.attributes.Cost;
import studentOrientation.attributes.CarbonFootprint;
import studentOrientation.attributes.Effort;

public interface RegisterClasses extends ActivityI {
  public enum Registration {
    registrar(DurationI.Duration.registrar,
              CostI.Cost.registrar,
              CarbonFootprintI.CarbonFootprint.registrar,
              EffortI.Effort.registrar),

    computerLab(DurationI.Duration.computerLab,
                CostI.Cost.computerLab,
                CarbonFootprintI.CarbonFootprint.computerLab,
                EffortI.Effort.computerLab);

    private final double duration;
    private final double carbonFootprint;
    private final double cost;
    private final double effort;

    public double getDuration() { return duration; }
    public double getCarbonFootprint() { return carbonFootprint; }
    public double getCost() { return cost; }
    public double getEffort() { return effort; }

    Registration(double durationIn, double costIn, double footprintIn, double effortIn) {
      duration = durationIn;
      carbonFootprint = footprintIn;
      cost = costIn;
      effort = effortIn;
    }
  }
}
