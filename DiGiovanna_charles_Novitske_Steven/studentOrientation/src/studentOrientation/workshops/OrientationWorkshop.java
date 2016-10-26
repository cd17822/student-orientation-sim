package studentOrientation.workshops;

import studentOrientation.activites.Activity;

public class OrientationWorkshop implements OrientationWorkshopI {
  public void construct(Orientation o) {
    o.tourCampus();
    o.selectDorm();
    o.buyBooks();
    o.registerClasses();
  }
}
