package studentOrientation.attributes;

import studentOrientation.enums.Activities;

public class Cost implements CostI {
  public static double getCostDollars(Activities activityIn) {
    double dollars = 0;
    if(activityIn == Activities.mandoBooks) { dollars = 200; }
    else if(activityIn == Activities.buBookStore) {
      dollars = getCostDollars(Activities.mandoBooks) * 1.05; }
    else if(activityIn == Activities.busRide) { dollars = 2; }
    else if(activityIn == Activities.onFoot) { dollars = 0.10; }
    else if(activityIn == Activities.standOutside) { dollars = 10; }
    else if(activityIn == Activities.gamingContest) {
      dollars = getCostDollars(Activities.standOutside * 1.02); }
    else if(activityIn == Activities.computerLab) { dollars = 150; }
    else if(activityIn == Activities.registrar) {
      dollars = getCostDollars(Activities.computerLab * 0.97); }

    return dollars;
  }
}
