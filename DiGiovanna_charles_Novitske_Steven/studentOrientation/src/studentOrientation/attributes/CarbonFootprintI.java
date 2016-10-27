package studentOrientation.attributes;

public interface CarbonFootprintI extends AttributeI {
    public enum CarbonFootprint {
        /* CampusTour */
        busRide(0.1),
        onFoot(0),

        /* BookStore */
        mandoBooks(0.02),
        buBookStore(0.01),

        /* DormSelector */
        standOutside(0),
        gamingContest(0.01),

        /* Registration */
        registrar(0),
        computerLab(0.01);

        private final double carbonFootprint;

        public double getCarbonFootprint() { return carbonFootprint; }

        // Constructor
        CarbonFootprint(double carbonFootprintIn) {
            carbonFootprint = carbonFootprintIn;
        }
    }
}
