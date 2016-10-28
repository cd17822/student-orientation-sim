package studentOrientation.orientations;

import studentOrientation.enums.BookStore;
import studentOrientation.enums.CampusTour;
import studentOrientation.enums.DormSelector;
import studentOrientation.enums.Registration;

public class BUOrientation implements OrientationI {
    private CampusTour campusTour;
    private DormSelector dormSelector;
    private BookStore bookStore;
    private Registration registration;

    private double duration;
    private double carbonFootprint;
    private double cost;
    private double effort;

    public BUOrientation(BookStore storeIn,
                         CampusTour tourIn,
                         DormSelector dormIn,
                         Registration regIn) {
       campusTour = tourIn;
       dormSelector = dormIn;
       bookStore = storeIn;
       registration = regIn;
       //Use choose_____() here instead to assign values
    }

    // Should also have list of activities
    public String toString() {
        String s = "BUOrientation with activities:" +
                   "\ncampus tour: " + campusTour.toString() +
                   "\ndorm selection: " + dormSelector.toString() +
                   "\nbooks from: " + bookStore.toString() +
                   "\nregistration via: " + registration.toString() +
                   "\nLEADING TO" +
                   "\nduration: " + duration +
                   " minutes,\ncarbon footprint: " + carbonFootprint +
                   " CO2 tons,\ncost: $" + String.format("%.2f", cost) +
                   " USD,\neffort: " + effort +
                   " calories.";
        return s;
    }

    public void tourCampus() {
        duration += campusTour.getDuration();
        carbonFootprint += campusTour.getCarbonFootprint();
        cost += campusTour.getCost();
        effort += campusTour.getEffort();
    }

    public void selectDorm() {
        duration += dormSelector.getDuration();
        carbonFootprint += dormSelector.getCarbonFootprint();
        cost += dormSelector.getCost();
        effort += dormSelector.getEffort();
    }

    public void buyBooks() {
        duration += bookStore.getDuration();
        carbonFootprint += bookStore.getCarbonFootprint();
        cost += bookStore.getCost();
        effort += bookStore.getEffort();
    }

    public void registerClasses() {
        duration += registration.getDuration();
        carbonFootprint += registration.getCarbonFootprint();
        cost += registration.getCost();
        effort += registration.getEffort();
    }
}
