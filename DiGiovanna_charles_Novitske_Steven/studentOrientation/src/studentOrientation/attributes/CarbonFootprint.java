package studentOrientation.attributes;

import studentOrientation.enums.Activities;

public class CarbonFootprint implements CarbonFootprintI {
  public static double getFootprintTonnes(Activities activityIn) {
    double tonnes = 0;
    if(activityIn == Activities.mandoBooks) { tonnes = 0.02; }
    else if(activityIn == Activities.buBookStore) { tonnes = 0; }
    else if(activityIn == Activities.busRide) { tonnes = 0.1; }
    else if(activityIn == Activities.onFoot) { tonnes = 0; }
    else if(activityIn == Activities.standOutside) { tonnes = 0; }
    else if(activityIn == Activities.gamingContest) { tonnes = 0.01; }
    else if(activityIn == Activities.computerLab) { tonnes = 0.01; }
    else if(activityIn == Activities.registrar) { tonnes = 0; }

    return tonnes;
  }
}
