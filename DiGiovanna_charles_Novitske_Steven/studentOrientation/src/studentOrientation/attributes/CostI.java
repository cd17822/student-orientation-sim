package studentOrientation.attributes;

public interface CostI extends AttributeI {
    public enum Cost {
        private final double mandoBooksCost = 200;
        private final double standOutsideCost = 200;
        private final double computerLabCost = 200;

        /* CampusTour */
        busRide(2),
        onFoot(0.10),

        /* BookStore */
        mandoBooks(mandoBooksCost),
        buBookStore(mandoBooksCost * 1.05),

        /* DormSelector */
        standOutside(10),
        gamingContest(standOutsideCost * 1.02),

        /* Registration */
        registrar(150),
        computerLab(computerLabCost * 0.97);

        private final double cost;

        public double getCost() { return cost; }

        /* Constructor */
        Cost(double costIn) {
            cost = costIn;
        }
    }
}
