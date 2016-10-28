package studentOrientation.activities;

import studentOrientation.util.Logger;
import studentOrientation.activities.TourCampusI;
import studentOrientation.enums.CampusTour;
import studentOrientation.attributes.DurationI;
import studentOrientation.attributes.CostI;
import studentOrientation.attributes.CarbonFootprintI;
import studentOrientation.attributes.EffortI;

public class TourCampus implements TourCampusI {
    CampusTour campusTour;

    CostI cost;
    DurationI duration;
    CarbonFootprintI carbonFootprint;
    EffortI effort;

    public TourCampus(CampusTour campusTourIn,
                      CostI costIn,
                      DurationI durationIn,
                      CarbonFootprintI carbonFootprintIn,
                      EffortI effortIn) {
        Logger.writeMessage("TourCampus constructed\n", Logger.DebugLevel.CONSTRUCTOR);

        campusTour = campusTourIn;
        cost = costIn;
        duration = durationIn;
        carbonFootprint = carbonFootprintIn;
        effort = effortIn;
    }

    public String toString() {
      String name;

      switch (campusTour) {
        case busRide : name = "Bus Ride"; break;
        case onFoot  : name = "On Foot"; break;
        default      : name = "";
      }

      return name;
    }

    public void embark() {
      cost.addCostDollars(campusTour);
      effort.addEffortCalories(campusTour);
      carbonFootprint.addFootprintTonnes(campusTour);
      duration.addDurationMinutes(campusTour);
    }
}
