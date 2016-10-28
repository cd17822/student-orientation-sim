package studentOrientation.orientations;

import studentOrientation.util.Logger;
import studentOrientation.enums.BookStore;
import studentOrientation.enums.CampusTour;
import studentOrientation.enums.DormSelector;
import studentOrientation.enums.Registration;
import studentOrientation.activities.BuyBooks;
import studentOrientation.activities.TourCampus;
import studentOrientation.activities.SelectDorm;
import studentOrientation.activities.RegisterClasses;
import studentOrientation.attributes.CarbonFootprint;
import studentOrientation.attributes.Cost;
import studentOrientation.attributes.Duration;
import studentOrientation.attributes.Effort;
import studentOrientation.activities.BuyBooksI;
import studentOrientation.activities.TourCampusI;
import studentOrientation.activities.SelectDormI;
import studentOrientation.activities.RegisterClassesI;
import studentOrientation.attributes.CarbonFootprintI;
import studentOrientation.attributes.CostI;
import studentOrientation.attributes.DurationI;
import studentOrientation.attributes.EffortI;

public class BUOrientation implements OrientationI {
    private BuyBooksI booksActivity;
    private TourCampusI tourActivity;
    private SelectDormI dormActivity;
    private RegisterClassesI registrationActivity;

    private DurationI duration = new Duration();
    private CarbonFootprintI carbonFootprint = new CarbonFootprint();
    private CostI cost = new Cost();
    private EffortI effort = new Effort();

    public BUOrientation(BookStore storeIn,
                         CampusTour tourIn,
                         DormSelector dormIn,
                         Registration regIn) {
        Logger.writeMessage("BUOrientation constructed\n", Logger.DebugLevel.CONSTRUCTOR);

        booksActivity = new BuyBooks(storeIn, cost, duration, carbonFootprint, effort);
        tourActivity = new TourCampus(tourIn, cost, duration, carbonFootprint, effort);
        dormActivity = new SelectDorm(dormIn, cost, duration, carbonFootprint, effort);
        registrationActivity = new RegisterClasses(regIn, cost, duration, carbonFootprint, effort);
    }

    // Should also have list of activities
    public String toString() {
        String s = "BUOrientation with activities:" +
                   "\n    campus tour: " + tourActivity.toString() +
                   "\n    dorm selection method: " + dormActivity.toString() +
                   "\n    books from: " + booksActivity.toString() +
                   "\n    registration via: " + registrationActivity.toString() +
                   "\n  LEADING TO" +
                   "\n    duration: " + duration.toStringMinutes() +
                   "\n    carbon footprint: " + carbonFootprint.toStringTonnes() +
                   "\n    cost: " + cost.toStringDollars() +
                   "\n    effort: " + effort.toStringCalories();
        return s;
    }

    public void tourCampus() {
        tourActivity.embark();
    }

    public void selectDorm() {
        dormActivity.embark();
    }

    public void buyBooks() {
        booksActivity.embark();
    }

    public void registerClasses() {
        registrationActivity.embark();
    }
}
