package student;

public enum Registration {
  registrar (Duration.registrar,
            Cost.registrar,
            CarbonFootprint.registrar,
            Effort.registrar),

  computerLab (Duration.computerLab,
              Cost.computerLab,
              CarbonFootprint.computerLab,
              Effort.computerLab);

  private final double duration;
  private final double carbonFootprint;
  private final double cost;
  private final double effort;

  Registration(double durationIn, double costIn, double footprintIn, double effortIn) {
    duration = durationIn;
    carbonFootprint = footprintIn;
    cost = costIn;
    effort = effortIn;
  }
}
}
