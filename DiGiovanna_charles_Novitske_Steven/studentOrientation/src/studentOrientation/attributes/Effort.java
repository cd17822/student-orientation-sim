package studentOrientation.attributes;

import studentOrientation.enums.BookStore;
import studentOrientation.enums.CampusTour;
import studentOrientation.enums.DormSelector;
import studentOrientation.enums.Registration;

public class Effort implements EffortI {
  double value;
  public Effort() {
    value = 0;
  }
  public void addEffortCalories(BookStore bookStoreIn) {
    if(activityIn == BookStore.mandoBooks) { value += 30; }
    else if(activityIn == BookStore.buBookStore) { value += 30; }
  }
  public void addEffortCalories(CampusTour tourIn) {
    if(activityIn == CampusTour.busRide) { value += 5; }
    else if(activityIn == CampusTour.onFoot) { value += 250; }
  }
  public void addEffortCalories(DormSelector dormIn) {
    if(activityIn == DormSelector.standOutside) { value += 75; }
    else if(activityIn == DormSelector.gamingContest) { value += 5; }
  }
  public void addEffortCalories(Registration registrationIn) {
    if(activityIn == Registration.computerLab) { value += 15; }
    else if(activityIn == Registration.registrar) { value += 25; }
  }
}
