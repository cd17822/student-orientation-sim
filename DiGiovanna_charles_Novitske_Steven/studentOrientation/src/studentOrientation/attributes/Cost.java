package studentOrientation.attributes;

public class Cost implements CostI {
  public double getCostDollars(Activities activityIn) {
    double dollars = 0;
    if(activityIn == Activities.mandoBooks) { dollars = 200; }
    else if(activityIn == Activites.buBookStore) {
      dollars = getCostDollars(Activities.mandoBooks) * 1.05; }
    else if(activityIn == Activites.busRide) { dollars = 2; }
    else if(activityIn == Activites.onFoot) { dollars = 0.10; }
    else if(activityIn == Activites.standOutside) { dollars = 10; }
    else if(activityIn == Activites.gamingContest) {
      dollars = getCostDollars(Activites.standOutside * 1.02); }
    else if(activityIn == Activites.computerLab) { dollars = 150; }
    else if(activityIn == Activites.registrar) {
      dollars = getCostDollars(Activites.computerLab * 0.97); }

    return dollars;
  }
}
