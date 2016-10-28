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
    public static void main(String[] args) {
        int debug_value = 0;
        if (args.length > 0) {
            if (Integer.parseInt(args[0]) < 0 || Integer.parseInt(args[0]) > 1) {
                System.err.println("Debug value must be 0 or 1\n");
            }else{
                debug_value = Integer.parseInt(args[0]);
            }
        }
        Logger.setDebugValue(debug_value);

        OrientationWorkshopI shop = new BUOrientationWorkshop();
        OrientationI o = new BUOrientation(BookStore.buBookStore,
                                           CampusTour.busRide,
                                           DormSelector.gamingContest,
                                           Registration.registrar);
        shop.construct(o);
        System.out.println(o.toString());
    }
}
