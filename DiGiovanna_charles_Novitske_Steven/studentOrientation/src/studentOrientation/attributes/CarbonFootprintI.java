package studentOrientation.attributes;

import studentOrientation.enums.BookStore;
import studentOrientation.enums.CampusTour;
import studentOrientation.enums.DormSelector;
import studentOrientation.enums.Registration;

public interface CarbonFootprintI {
  public void addFootprintTonnes(BookStore bookStoreIn);
  public void addFootprintTonnes(CampusTour tourIn);
  public void addFootprintTonnes(DormSelector dormIn);
  public void addFootprintTonnes(Registration registrationIn);
}
