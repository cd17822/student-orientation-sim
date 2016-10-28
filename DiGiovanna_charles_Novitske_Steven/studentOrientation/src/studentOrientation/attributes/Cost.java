package studentOrientation.attributes;

import studentOrientation.enums.BookStore;
import studentOrientation.enums.CampusTour;
import studentOrientation.enums.DormSelector;
import studentOrientation.enums.Registration;

public class Cost implements CostI {
  double value;
  public Cost() {
    value = 0;
  }
  public void addCostDollars(BookStore bookStoreIn) {
    double mandoPrice = 200;
    if(activityIn == BookStore.mandoBooks) { value += mandoBooks; }
    else if(activityIn == BookStore.buBookStore) { value += mandoPrice * 1.05; }
  }
  public void addCostDollars(CampusTour tourIn) {
    if(activityIn == CampusTour.busRide) { value += 2; }
    else if(activityIn == CampusTour.onFoot) { value += 0.10; }
  }
  public void addCostDollars(DormSelector dormIn) {
    double standPrice = 10;
    if(activityIn == DormSelector.standOutside) { value += standPrice; }
    else if(activityIn == DormSelector.gamingContest) { value += standPrice * 1.02; }
  }
  public void addCostDollars(Registration registrationIn) {
    double labPrice = 150;
    if(activityIn == Registration.computerLab) { value += labPrice; }
    else if(activityIn == Registration.registrar) { value += labPrice * 0.97; }
  }
}
