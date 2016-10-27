package studentOrientation.attributes;

public interface EffortI extends AttributeI {
    public enum Effort {
        /* CampusTour */
        busRide(5),
        onFoot(250),

        /* BookStore */
        mandoBooks(30),
        buBookStore(30),

        /* DormSelector */
        standOutside(75),
        gamingContest(5),

        /* Registration */
        registrar(25),
        computerLab(15);

        private final double effort;

        public double getEffort() { return effort; }

        // Constructor
        Effort(double effortIn) {
            effort = effortIn;
        }
    }
}
