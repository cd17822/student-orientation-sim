package studentOrientation.enums;

import studentOrientation.enums.CampusTour;
import studentOrientation.enums.DormSelector;
import studentOrientation.enums.BookStore;
import studentOrientation.enums.Registration;

public enum DormSelector {
    standOutside(Duration.standOutside,
                 Cost.standOutside,
                 CarbonFootprint.standOutside,
                 Effort.standOutside),

    gamingContest(Duration.gamingContest,
                  Cost.gamingContest,
                  CarbonFootprint.gamingContest,
                  Effort.gamingContest);

    public final double duration;
    public final double cost;
    public final double carbonFootprint;
    public final double effort;

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