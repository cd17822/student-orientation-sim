package studentOrientation.attributes;

import studentOrientation.enums.BookStore;
import studentOrientation.enums.CampusTour;
import studentOrientation.enums.DormSelector;
import studentOrientation.enums.Registration;

public class Cost implements CostI {
  double value;
  public void addCostDollars(BookStore bookStoreIn) {
    if(activityIn == BookStore.mandoBooks) { value = 200; }
    else if(activityIn == BookStore.buBookStore) {
      value = addCostDollars(BookStore.mandoBooks) * 1.05; }
    return value;
  }
  public void addCostDollars(CampusTour tourIn) {
    if(activityIn == CampusTour.busRide) { value = 2; }
    else if(activityIn == CampusTour.onFoot) { value = 0.10; }
    return value;
  }
  public void addCostDollars(DormSelector dormIn) {
    if(activityIn == DormSelector.standOutside) { value = 10; }
    else if(activityIn == DormSelector.gamingContest) {
      value = addCostDollars(DormSelector.standOutside) * 1.02; }
    return value;
  }
  public void addCostDollars(Registration registrationIn) {
    if(activityIn == Registration.computerLab) { value = 150; }
    else if(activityIn == Registration.registrar) {
      value = addCostDollars(Registration.computerLab) * 0.97; }
    return value;
  }
}
