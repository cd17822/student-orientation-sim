package studentOrientation.attributes;

public interface DurationI extends AttributeI {
    public enum Duration {
        /* CampusTour */
        busRide(45),
        onFoot(90),

        /* BookStore */
        mandoBooks(15),
        buBookStore(25),

        /* DormSelector */
        standOutside(120),
        gamingContest(45),

        /* Registration */
        registrar(15),
        computerLab(15);

        private final double duration;

        public double getDuration() { return duration; }

        // Constructor
        Duration(double durationIn) {
            duration = durationIn;
        }
    }
}
