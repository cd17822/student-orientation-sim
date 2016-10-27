package studentOrientation.driver;

import studentOrientation.util.Logger;
import studentOrientation.workshops.OrientationWorkshopI;
import studentOrientation.workshops.OrientationWorkshop;
import studentOrientation.orientations.OrientationI;
import studentOrientation.orientations.BUOrientation;
import studentOrientation.activities.TourCampus;
import studentOrientation.activities.SelectDorm;
import studentOrientation.activities.BuyBooks;
import studentOrientation.activities.RegisterClasses;

public class Driver{
    public static int DEBUG_VALUE;

    public static void main(String[] args) {
        OrientationWorkshopI shop = new OrientationWorkshop();
        OrientationI o = new BUOrientation(BuyBooks.BookStore.mandoBooks,
                                           TourCampus.CampusTour.onFoot,
                                           SelectDorm.DormSelector.standOutside,
                                           RegisterClasses.Registration.computerLab);
        shop.construct(o);
        System.out.println(o.toString());
    }
}
