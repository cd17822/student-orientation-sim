package studentOrientation.attributes;

import studentOrientation.enums.BookStore;
import studentOrientation.enums.CampusTour;
import studentOrientation.enums.DormSelector;
import studentOrientation.enums.Registration;

public interface EffortI {
  public void addEffortCalories(BookStore bookStoreIn);
  public void addEffortCalories(CampusTour tourIn);
  public void addEffortCalories(DormSelector dormIn);
  public void addEffortCalories(Registration registrationIn);
}
