package studentOrientation.enums;

import studentOrientation.attributes.Duration;
import studentOrientation.attributes.Cost;
import studentOrientation.attributes.CarbonFootprint;
import studentOrientation.attributes.Effort;

public enum Registration {
  registrar(Duration.registrar,
            Cost.registrar,
            CarbonFootprint.registrar,
            Effort.registrar),

  computerLab(Duration.computerLab,
              Cost.computerLab,
              CarbonFootprint.computerLab,
              Effort.computerLab);

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