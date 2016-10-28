package studentOrientation.attributes;

import studentOrientation.enums.BookStore;
import studentOrientation.enums.CampusTour;
import studentOrientation.enums.DormSelector;
import studentOrientation.enums.Registration;

public interface DurationI {
  public void addDurationMinutes(BookStore bookStoreIn);
  public void addDurationMinutes(CampusTour tourIn);
  public void addDurationMinutes(DormSelector dormIn);
  public void addDurationMinutes(Registration registrationIn);
}
