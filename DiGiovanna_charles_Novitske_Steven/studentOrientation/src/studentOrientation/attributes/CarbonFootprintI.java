package studentOrientation.attributes;

import studentOrientation.enums.BookStore;
import studentOrientation.enums.CampusTour;
import studentOrientation.enums.DormSelector;
import studentOrientation.enums.Registration;

public interface CarbonFootprintI {
  public static double getFootprintTonnes(BookStore bookStoreIn);
  public static double getFootprintTonnes(CampusTour tourIn);
  public static double getFootprintTonnes(DormSelector dormIn);
  public static double getFootprintTonnes(Registration registrationIn);
}
