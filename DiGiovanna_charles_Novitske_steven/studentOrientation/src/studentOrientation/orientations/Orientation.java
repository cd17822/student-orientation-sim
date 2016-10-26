package studentOrientation.orientions

public interface Orientation {
    private double duration;
    private double carbonFootprint;
    private double cost;
    private double effort;

    public void tourCampus(CampusTour c);
    public void selectDorm(DormSelector d);
    public void buyBooks(BookStore b);
    public void registerClasses(Registration r);
}
