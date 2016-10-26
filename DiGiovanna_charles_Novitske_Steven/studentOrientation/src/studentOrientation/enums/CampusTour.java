package student;

public enum CampusTour {
  busRide (Duration.busRide,
          Cost.busRide,
          CarbonFootprint.busRide,
          Effort.busRide),

  onFoot (Duration.onFoot,
          Cost.onFoot,
          CarbonFootprint.onFoot,
          Effort.onFoot);

  private final double duration;
  private final double carbonFootprint;
  private final double cost;
  private final double effort;

  CampusTour(double durationIn, double costIn, double footprintIn, double effortIn) {
    duration = durationIn;
    carbonFootprint = footprintIn;
    cost = costIn;
    effort = effortIn;
  }
}
