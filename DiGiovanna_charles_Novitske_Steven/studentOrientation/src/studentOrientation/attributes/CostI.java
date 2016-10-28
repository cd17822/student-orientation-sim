package studentOrientation.attributes;

import studentOrientation.enums.BookStore;
import studentOrientation.enums.CampusTour;
import studentOrientation.enums.DormSelector;
import studentOrientation.enums.Registration;

public interface CostI {
  public void addCostDollars(BookStore bookStoreIn);
  public void addCostDollars(CampusTour tourIn);
  public void addCostDollars(DormSelector dormIn);
  public void addCostDollars(Registration registrationIn);
}
