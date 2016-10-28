package studentOrientation.activities;

import studentOrientation.activities.SelectDormI;
import studentOrientation.enums.DormSelector;
import studentOrientation.attributes.DurationI;
import studentOrientation.attributes.CostI;
import studentOrientation.attributes.CarbonFootprintI;
import studentOrientation.attributes.EffortI;

public class SelectDorm implements SelectDormI {
    DormSelector dormSelector;

    CostI cost;
    DurationI duration;
    CarbonFootprintI carbonFootprint;
    EffortI effort;

    public SelectDorm(DormSelector dormSelectorIn,
                      CostI costIn,
                      DurationI durationIn,
                      CarbonFootprintI carbonFootprintIn,
                      EffortI effortIn) {
        dormSelector = dormSelectorIn;
        cost = costIn;
        duration = durationIn;
        carbonFootprint = carbonFootprintIn;
        effort = effortIn;
    }

    public String toString() {
      String name;

      switch (dormSelector) {
        case standOutside  : name = "Stand Outside";
        case gamingContest : name = "Gaming Contest";
        default            : name = "";
      }

      return name;
    }

    public void embark() {
      cost.addCostDollars(dormSelector);
      effort.addEffortCalories(dormSelector);
      carbonFootprint.addFootprintTonnes(dormSelector);
      duration.addDurationMinutes(dormSelector);
    }
}
