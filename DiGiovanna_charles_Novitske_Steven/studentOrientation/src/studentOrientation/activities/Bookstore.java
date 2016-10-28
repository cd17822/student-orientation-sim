package studentOrientation.activities;

import studentOrientation.enums.BookStore;

public class BookStore implements BookStoreI {
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
