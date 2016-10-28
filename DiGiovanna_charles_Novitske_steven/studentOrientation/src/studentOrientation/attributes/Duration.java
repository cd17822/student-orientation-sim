package studentOrientation.attributes;

import studentOrientation.util.Logger;
import studentOrientation.enums.BookStore;
import studentOrientation.enums.CampusTour;
import studentOrientation.enums.DormSelector;
import studentOrientation.enums.Registration;

public class Duration implements DurationI {
  double value = 0;

  public Duration() {
    Logger.writeMessage("Duration constructed\n", Logger.DebugLevel.CONSTRUCTOR);
  }

  public String toStringMinutes() {
    return value + " minutes";
  }

  public void addDurationMinutes(BookStore bookStoreIn) {
    if(bookStoreIn == BookStore.mandoBooks) { value += 15; }
    else if(bookStoreIn == BookStore.buBookStore) { value += 25; }
  }
  public void addDurationMinutes(CampusTour tourIn) {
    if(tourIn == CampusTour.busRide) { value += 45; }
    else if(tourIn == CampusTour.onFoot) { value += 90; }
  }
  public void addDurationMinutes(DormSelector dormIn) {
    if(dormIn == DormSelector.standOutside) { value += 120; }
    else if(dormIn == DormSelector.gamingContest) { value += 45; }
  }
  public void addDurationMinutes(Registration registrationIn) {
    if(registrationIn == Registration.computerLab) { value += 15; }
    else if(registrationIn == Registration.registrar) { value += 15; }
  }
}
