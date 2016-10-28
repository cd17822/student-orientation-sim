package studentOrientation.attributes;

import studentOrientation.util.Logger;
import studentOrientation.enums.BookStore;
import studentOrientation.enums.CampusTour;
import studentOrientation.enums.DormSelector;
import studentOrientation.enums.Registration;

public class Cost implements CostI {
  double value = 0;
  /**
   * Cost constructor
   */
  public Cost() {
    Logger.writeMessage("Cost constructed\n", Logger.DebugLevel.CONSTRUCTOR);
  }
  /**
   * @return Cost data as a String
   */
  public String toStringDollars() {
    return String.format("$%.2f", value) + " USD";
  }

  public void addCostDollars(BookStore bookStoreIn) {
    double mandoPrice = 200;
    if(bookStoreIn == BookStore.mandoBooks) { value += mandoPrice; }
    else if(bookStoreIn == BookStore.buBookStore) { value += mandoPrice * 1.05; }
  }
  public void addCostDollars(CampusTour tourIn) {
    if(tourIn == CampusTour.busRide) { value += 2; }
    else if(tourIn == CampusTour.onFoot) { value += 0.10; }
  }
  public void addCostDollars(DormSelector dormIn) {
    double standPrice = 10;
    if(dormIn == DormSelector.standOutside) { value += standPrice; }
    else if(dormIn == DormSelector.gamingContest) { value += standPrice * 1.02; }
  }
  public void addCostDollars(Registration registrationIn) {
    double labPrice = 150;
    if(registrationIn == Registration.computerLab) { value += labPrice; }
    else if(registrationIn == Registration.registrar) { value += labPrice * 0.97; }
  }
}
