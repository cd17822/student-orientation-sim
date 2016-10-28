package studentOrientation.attributes;

import studentOrientation.enums.BookStore;
import studentOrientation.enums.CampusTour;
import studentOrientation.enums.DormSelector;
import studentOrientation.enums.Registration;

public class Duration implements DurationI {
  double value;
  public Duration() {
    value = 0;
  }
  public void addDurationMinutes(BookStore bookStoreIn) {
    if(activityIn == BookStore.mandoBooks) { value += 15; }
    else if(activityIn == BookStore.buBookStore) { value += 25; }
  }
  public void addDurationMinutes(CampusTour tourIn) {
    if(activityIn == CampusTour.busRide) { value += 45; }
    else if(activityIn == CampusTour.onFoot) { value += 90; }
  }
  public void addDurationMinutes(DormSelector dormIn) {
    if(activityIn == DormSelector.standOutside) { value += 120; }
    else if(activityIn == DormSelector.gamingContest) { value += 45; }
  }
  public void addDurationMinutes(Registration registrationIn) {
    if(activityIn == Registration.computerLab) { value += 15; }
    else if(activityIn == Registration.registrar) { value += 15; }
  }
}
