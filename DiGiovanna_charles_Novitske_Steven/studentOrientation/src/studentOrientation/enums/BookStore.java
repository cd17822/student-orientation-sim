package student

public enum BookStore {
    mandoBooks (Duration.mandoBooks,
                Cost.mandoBooks,
                CarbonFootprint.mandoBooks,
                Effort.mandoBooks),

    buBookStore(Duration.buBookStore,
                Cost.buBookStore,
                CarbonFootprint.buBookStore,
                Effort.buBookStore);

    public final double duration;
    public final double cost;
    public final double carbonFootprint;
    public final double effort;

    // Constructor
    BookStore(double durationIn,
                   double costIn,
                   double carbonFootprintIn,
                   double effortIn) {
        duration = durationIn;
        cost = costIn;
        carbonFootprint = carbonFootprintIn;
        effort = effortIn;
    }
}