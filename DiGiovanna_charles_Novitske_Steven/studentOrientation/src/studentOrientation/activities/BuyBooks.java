package studentOrientation.activities;
import studentOrientation.util.Logger;
import studentOrientation.activities.BuyBooksI;
import studentOrientation.enums.BookStore;
import studentOrientation.attributes.DurationI;
import studentOrientation.attributes.CostI;
import studentOrientation.attributes.CarbonFootprintI;
import studentOrientation.attributes.EffortI;

public class BuyBooks implements BuyBooksI {
    BookStore bookStore;

    CostI cost;
    DurationI duration;
    CarbonFootprintI carbonFootprint;
    EffortI effort;

    public BuyBooks(BookStore bookStoreIn,
                      CostI costIn,
                      DurationI durationIn,
                      CarbonFootprintI carbonFootprintIn,
                      EffortI effortIn) {
        Logger.writeMessage("BuyBooks constructed\n", Logger.DebugLevel.CONSTRUCTOR);

        bookStore = bookStoreIn;
        cost = costIn;
        duration = durationIn;
        carbonFootprint = carbonFootprintIn;
        effort = effortIn;
    }

    public String toString() {
      String name;

      switch (bookStore) {
        case mandoBooks  : name = "Mando Books"; break;
        case buBookStore : name = "BU Book Store"; break;
        default          : name = "";
      }

      return name;
    }

    public void embark() {
      cost.addCostDollars(bookStore);
      effort.addEffortCalories(bookStore);
      carbonFootprint.addFootprintTonnes(bookStore);
      duration.addDurationMinutes(bookStore);
    }
}
