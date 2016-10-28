package studentOrientation.attributes;

import studentOrientation.enums.BookStore;
import studentOrientation.enums.CampusTour;
import studentOrientation.enums.DormSelector;
import studentOrientation.enums.Registration;

public interface DurationI {
  public static double getDurationMinutes(BookStore bookStoreIn);
  public static double getDurationMinutes(CampusTour tourIn);
  public static double getDurationMinutes(DormSelector dormIn);
  public static double getDurationMinutes(Registration registrationIn);
}
