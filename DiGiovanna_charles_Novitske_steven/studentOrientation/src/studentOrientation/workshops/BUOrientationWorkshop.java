package studentOrientation.workshops;

import studentOrientation.util.Logger;
import studentOrientation.orientations.OrientationI;

public class BUOrientationWorkshop implements OrientationWorkshopI {
  /**
   * BUOrientationWorkshop constructor
   */
  public BUOrientationWorkshop() {
    Logger.writeMessage("BUOrientationWorkshop constructed\n", Logger.DebugLevel.CONSTRUCTOR);
  }

  public void construct(OrientationI o) {
    o.tourCampus();
    o.selectDorm();
    o.buyBooks();
    o.registerClasses();
  }
}
