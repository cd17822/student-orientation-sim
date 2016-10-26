package studentOrientation.orientations;

public interface OrientationI {
    private double duration;
    private double carbonFootprint;
    private double cost;
    private double effort;

    public void tourCampus();
    public void selectDorm();
    public void buyBooks();
    public void registerClasses();
}
