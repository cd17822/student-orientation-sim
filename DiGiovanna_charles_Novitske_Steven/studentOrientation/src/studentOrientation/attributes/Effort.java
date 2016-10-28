package studentOrientation.attributes;

import enums.Activities;

public class Effort implements EffortI {
  public double getEffortCalories(Activities activityIn) {
    double calories;
    if(activityIn == Activities.mandoBooks) { calories = 30; }
    else if(activityIn == Activites.buBookStore) { calories = 30; }
    else if(activityIn == Activites.busRide) { calories = 5; }
    else if(activityIn == Activites.onFoot) { calories = 250; }
    else if(activityIn == Activites.standOutside) { calories = 75; }
    else if(activityIn == Activites.gamingContest) { calories = 5; }
    else if(activityIn == Activites.computerLab) { calories = 15; }
    else if(activityIn == Activites.registrar) { calories = 25; }

    return calories;
  }
}
