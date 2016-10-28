package studentOrientation.attributes;

import studentOrientation.enums.BookStore;
import studentOrientation.enums.CampusTour;
import studentOrientation.enums.DormSelector;
import studentOrientation.enums.Registration;

public class Effort implements EffortI {
  double value;
  public void addEffortCalories(BookStore bookStoreIn) {
    if(activityIn == BookStore.mandoBooks) { calories = 30; }
    else if(activityIn == BookStore.buBookStore) { calories = 30; }
    return value;
  }
  public void addEffortCalories(CampusTour tourIn) {
    if(activityIn == CampusTour.busRide) { calories = 5; }
    else if(activityIn == CampusTour.onFoot) { calories = 250; }
    return value;
  }
  public void addEffortCalories(DormSelector dormIn) {
    if(activityIn == DormSelector.standOutside) { calories = 75; }
    else if(activityIn == DormSelector.gamingContest) { calories = 5; }
    return value;
  }
  public void addEffortCalories(Registration registrationIn) {
    if(activityIn == Registration.computerLab) { calories = 15; }
    else if(activityIn == Registration.registrar) { calories = 25; }
    return calories;
  }
}
