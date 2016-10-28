package studentOrientation.attributes;

import studentOrientation.enums.BookStore;
import studentOrientation.enums.CampusTour;
import studentOrientation.enums.DormSelector;
import studentOrientation.enums.Registration;

public class CarbonFootprint implements CarbonFootprintI {
  double value;
  public CarbonFootprint() {
    value = 0;
  }

  public String toStringTonnes() {
    return value + " CO2 tonnes";
  }

  public void addFootprintTonnes(BookStore bookStoreIn) {
    if(bookStoreIn == BookStore.mandoBooks) { value += 0.02; }
    else if(bookStoreIn == BookStore.buBookStore) { value += 0; }
  }
  public void addFootprintTonnes(CampusTour tourIn) {
    if(tourIn == CampusTour.busRide) { value += 0.1; }
    else if(tourIn == CampusTour.onFoot) { value += 0; }
  }
  public void addFootprintTonnes(DormSelector dormIn) {
    if(dormIn == DormSelector.standOutside) { value += 0; }
    else if(dormIn == DormSelector.gamingContest) { value += 0.01; }
  }
  public void addFootprintTonnes(Registration registrationIn) {
    if(registrationIn == Registration.computerLab) { value += 0.01; }
    else if(registrationIn == Registration.registrar) { value += 0; }
  }
}
