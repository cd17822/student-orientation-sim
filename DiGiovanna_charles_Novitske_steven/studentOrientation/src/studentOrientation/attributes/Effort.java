package studentOrientation.attributes;

import studentOrientation.util.Logger;
import studentOrientation.enums.BookStore;
import studentOrientation.enums.CampusTour;
import studentOrientation.enums.DormSelector;
import studentOrientation.enums.Registration;

public class Effort implements EffortI {
  double value = 0;

  public Effort() {
    Logger.writeMessage("Effort constructed\n", Logger.DebugLevel.CONSTRUCTOR);
  }

  public String toStringCalories() {
    return value + " calories";
  }

  public void addEffortCalories(BookStore bookStoreIn) {
    if(bookStoreIn == BookStore.mandoBooks) { value += 30; }
    else if(bookStoreIn == BookStore.buBookStore) { value += 30; }
  }
  public void addEffortCalories(CampusTour tourIn) {
    if(tourIn == CampusTour.busRide) { value += 5; }
    else if(tourIn == CampusTour.onFoot) { value += 250; }
  }
  public void addEffortCalories(DormSelector dormIn) {
    if(dormIn == DormSelector.standOutside) { value += 75; }
    else if(dormIn == DormSelector.gamingContest) { value += 5; }
  }
  public void addEffortCalories(Registration registrationIn) {
    if(registrationIn == Registration.computerLab) { value += 15; }
    else if(registrationIn == Registration.registrar) { value += 25; }
  }
}
