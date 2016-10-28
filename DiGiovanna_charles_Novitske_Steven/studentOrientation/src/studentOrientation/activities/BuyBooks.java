package studentOrientation.activities;

import studentOrientation.enums.BookStore;
import studentOrientation.attributes.Duration;
import studentOrientation.attributes.Cost;
import studentOrientation.attributes.CarbonFootprint;
import studentOrientation.attributes.Effort;

public class BuyBooks implements BuyBooksI {
    public void getCost(BookStore bookStoreIn) {
      return Cost.getCostDollars(bookStoreIn);
    }
    public void getEffort(BookStore bookStoreIn) {
      return Effort.getEffortCalories(bookStoreIn);
    }
    public void getCarbonFootprint(BookStore bookStoreIn) {
      return CarbonFootprint.getFootprintTonnes(bookStoreIn);
    }
    public void getDuration(BookStore bookStoreIn) {
      return Duration.getDurationMinutes(bookStoreIn);
    }
}
