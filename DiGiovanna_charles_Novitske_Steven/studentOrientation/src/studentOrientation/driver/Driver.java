package studentOrientation.driver;

import studentOrientation.util.Logger;
import studentOrientation.workshops.OrientationWorkshopI;
import studentOrientation.workshops.BUOrientationWorkshop;
import studentOrientation.orientations.OrientationI;
import studentOrientation.orientations.BUOrientation;
import studentOrientation.enums.BookStore;
import studentOrientation.enums.CampusTour;
import studentOrientation.enums.DormSelector;
import studentOrientation.enums.Registration;

public class Driver{
    public static int DEBUG_VALUE;

    public static void main(String[] args) {
        OrientationWorkshopI shop = new BUOrientationWorkshop();
        OrientationI o = new BUOrientation(BookStore.mandoBooks,
                                           CampusTour.onFoot,
                                           DormSelector.standOutside,
                                           Registration.computerLab);
        shop.construct(o);
        System.out.println(o.toString());
    }
}
