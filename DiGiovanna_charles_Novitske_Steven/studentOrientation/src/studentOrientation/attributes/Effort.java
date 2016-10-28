package studentOrientation.attributes;

import studentOrientation.enums.Activities;

public class Effort implements EffortI {
  public static double getEffortCalories(Activities activityIn) {
    double calories;
    if(activityIn == Activities.mandoBooks) { calories = 30; }
    else if(activityIn == Activities.buBookStore) { calories = 30; }
    else if(activityIn == Activities.busRide) { calories = 5; }
    else if(activityIn == Activities.onFoot) { calories = 250; }
    else if(activityIn == Activities.standOutside) { calories = 75; }
    else if(activityIn == Activities.gamingContest) { calories = 5; }
    else if(activityIn == Activities.computerLab) { calories = 15; }
    else if(activityIn == Activities.registrar) { calories = 25; }

    return calories;
  }
}
