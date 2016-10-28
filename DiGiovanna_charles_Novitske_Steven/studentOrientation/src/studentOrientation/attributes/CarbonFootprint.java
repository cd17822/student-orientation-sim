package studentOrientation.attributes;

import enums.Activities;

public class CarbonFootprint implements CarbonFootprintI {
  public double getFootprintTonnes(Activities activityIn) {
    double tonnes = 0;
    if(activityIn == Activities.mandoBooks) { tonnes = 0.02; }
    else if(activityIn == Activites.buBookStore) { tonnes = 0; }
    else if(activityIn == Activites.busRide) { tonnes = 0.1; }
    else if(activityIn == Activites.onFoot) { tonnes = 0; }
    else if(activityIn == Activites.standOutside) { tonnes = 0; }
    else if(activityIn == Activites.gamingContest) { tonnes = 0.01; }
    else if(activityIn == Activites.computerLab) { tonnes = 0.01; }
    else if(activityIn == Activites.registrar) { tonnes = 0; }

    return tonnes;
  }
}
