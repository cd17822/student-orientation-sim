package studentOrientation.attributes;

import studentOrientation.enums.BookStore;
import studentOrientation.enums.CampusTour;
import studentOrientation.enums.DormSelector;
import studentOrientation.enums.Registration;

public interface CostI {
  public static double getCostDollars(BookStore bookStoreIn);
  public static double getCostDollars(CampusTour tourIn);
  public static double getCostDollars(DormSelector dormIn);
  public static double getCostDollars(Registration registrationIn);
}
