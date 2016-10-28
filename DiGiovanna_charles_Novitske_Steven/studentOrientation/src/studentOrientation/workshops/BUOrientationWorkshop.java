package studentOrientation.workshops;

import studentOrientation.orientations.OrientationI;

public class BUOrientationWorkshop implements OrientationWorkshopI {
  public void construct(OrientationI o) {
    o.tourCampus();
    o.selectDorm();
    o.buyBooks();
    o.registerClasses();
  }
}
