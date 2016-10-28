package studentOrientation.attributes;

import enums.Activities;

public class Duration implements DurationI {
  public static double getDurationMinutes(Activities activityIn) {
    double minutes;
    if(activityIn == Activities.mandoBooks) { minutes = 15; }
    else if(activityIn == Activites.buBookStore) { minutes = 25; }
    else if(activityIn == Activites.busRide) { minutes = 45; }
    else if(activityIn == Activites.onFoot) { minutes = 90; }
    else if(activityIn == Activites.standOutside) { minutes = 120; }
    else if(activityIn == Activites.gamingContest) { minutes = 45; }
    else if(activityIn == Activites.computerLab) { minutes = 15; }
    else if(activityIn == Activites.registrar) { minutes = 15; }

    return minutes;
  }
}
