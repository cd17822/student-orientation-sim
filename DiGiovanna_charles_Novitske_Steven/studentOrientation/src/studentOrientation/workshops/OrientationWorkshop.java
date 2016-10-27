package studentOrientation.workshops;

import studentOrientation.activities.ActivityI;
import studentOrientation.orientations.OrientationI;

public class OrientationWorkshop implements OrientationWorkshopI {
  public void construct(OrientationI o) {
    o.tourCampus();
    o.selectDorm();
    o.buyBooks();
    o.registerClasses();
  }
}
