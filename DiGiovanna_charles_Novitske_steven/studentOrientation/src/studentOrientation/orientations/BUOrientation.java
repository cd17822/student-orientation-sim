package studentOrientation.orientations;

import studentOrientation.enums.CampusTour;
import studentOrientation.enums.DormSelector;
import studentOrientation.enums.BookStore;
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

    public void tourCampus() {
        duration += campusTour.duration;
        carbonFootprint += campusTour.carbonFootprint;
        cost += campusTour.cost;
        effort += campusTour.effort;
    }

    public void selectDorm() {
        duration += dormSelector.duration;
        carbonFootprint += dormSelector.carbonFootprint;
        cost += dormSelector.cost;
        effort += dormSelector.effort;
    }

    public void buyBooks() {
        duration += bookStore.duration;
        carbonFootprint += bookStore.carbonFootprint;
        cost += bookStore.cost;
        effort += bookStore.effort;
    }

    public void registerClasses() {
        duration += registration.duration;
        carbonFootprint += registration.carbonFootprint;
        cost += registration.cost;
        effort += registration.effort;
    }
}
