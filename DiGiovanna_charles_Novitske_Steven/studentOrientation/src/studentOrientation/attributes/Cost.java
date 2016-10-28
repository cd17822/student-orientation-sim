package studentOrientation.attributes;

import studentOrientation.enums.BookStore;
import studentOrientation.enums.CampusTour;
import studentOrientation.enums.DormSelector;
import studentOrientation.enums.Registration;

public class Cost implements CostI {
  double value;
  public static double getCostDollars(BookStore bookStoreIn) {
    if(activityIn == Activities.mandoBooks) { value = 200; }
    else if(activityIn == Activities.buBookStore) {
      value = getCostDollars(Activities.mandoBooks) * 1.05; }
    return value;
  }
  public static double getCostDollars(CampusTour tourIn) {
    if(activityIn == Activities.busRide) { value = 2; }
    else if(activityIn == Activities.onFoot) { value = 0.10; }
    return value;
  }
  public static double getCostDollars(DormSelector dormIn) {
    if(activityIn == Activities.standOutside) { value = 10; }
    else if(activityIn == Activities.gamingContest) {
      value = getCostDollars(Activities.standOutside * 1.02); }
    return value;
  }
  public static double getCostDollars(Registration registrationIn) {
    if(activityIn == Activities.computerLab) { value = 150; }
    else if(activityIn == Activities.registrar) {
      value = getCostDollars(Activities.computerLab * 0.97); }
    return value;
  }
}
