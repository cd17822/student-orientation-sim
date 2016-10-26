package studentOrientation.orientions

public class BUOrientation implements Orientation {
    private double duration;
    private double carbonFootprint;
    private double cost;
    private double effort;

    public void tourCampus(CampusTour c) {
        duration += c.duration;
        carbonFootprint += c.carbonFootprint;
        cost += c.cost;
        effort += c.effort;
    }

    public void selectDorm(DormSelector d) {
        duration += d.duration;
        carbonFootprint += d.carbonFootprint;
        cost += d.cost;
        effort += d.effort;
    }

    public void buyBooks(BookStore b) {
        duration += b.duration;
        carbonFootprint += b.carbonFootprint;
        cost += b.cost;
        effort += b.effort;
    }

    public void registerClasses(Registration r) {
        duration += r.duration;
        carbonFootprint += r.carbonFootprint;
        cost += r.cost;
        effort += r.effort;
    }
}
