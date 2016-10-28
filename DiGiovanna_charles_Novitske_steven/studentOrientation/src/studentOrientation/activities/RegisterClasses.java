package studentOrientation.activities;

import studentOrientation.util.Logger;
import studentOrientation.activities.RegisterClassesI;
import studentOrientation.enums.Registration;
import studentOrientation.attributes.DurationI;
import studentOrientation.attributes.CostI;
import studentOrientation.attributes.CarbonFootprintI;
import studentOrientation.attributes.EffortI;

public class RegisterClasses implements RegisterClassesI {
    Registration registration;

    CostI cost;
    DurationI duration;
    CarbonFootprintI carbonFootprint;
    EffortI effort;

    public RegisterClasses(Registration registrationIn,
                      CostI costIn,
                      DurationI durationIn,
                      CarbonFootprintI carbonFootprintIn,
                      EffortI effortIn) {
        Logger.writeMessage("RegisterClasses constructed\n", Logger.DebugLevel.CONSTRUCTOR);

        registration = registrationIn;
        cost = costIn;
        duration = durationIn;
        carbonFootprint = carbonFootprintIn;
        effort = effortIn;
    }

    public String toString() {
      String name;

      switch (registration) {
        case computerLab : name = "Computer Lab"; break;
        case registrar   : name = "Registrar"; break;
        default          : name = "";
      }

      return name;
    }

    public void embark() {
      cost.addCostDollars(registration);
      effort.addEffortCalories(registration);
      carbonFootprint.addFootprintTonnes(registration);
      duration.addDurationMinutes(registration);
    }
}
