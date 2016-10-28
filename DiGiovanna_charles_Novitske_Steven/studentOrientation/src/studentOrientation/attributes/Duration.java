package studentOrientation.attributes;

import studentOrientation.enums.Activities;

public class Duration implements DurationI {
  public static double getDurationMinutes(Activities activityIn) {
    double minutes;
    if(activityIn == Activities.mandoBooks) { minutes = 15; }
    else if(activityIn == Activities.buBookStore) { minutes = 25; }
    else if(activityIn == Activities.busRide) { minutes = 45; }
    else if(activityIn == Activities.onFoot) { minutes = 90; }
    else if(activityIn == Activities.standOutside) { minutes = 120; }
    else if(activityIn == Activities.gamingContest) { minutes = 45; }
    else if(activityIn == Activities.computerLab) { minutes = 15; }
    else if(activityIn == Activities.registrar) { minutes = 15; }

    return minutes;
  }
}
