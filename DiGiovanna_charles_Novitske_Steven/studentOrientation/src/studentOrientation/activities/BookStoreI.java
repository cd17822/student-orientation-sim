package studentOrientation.activities;

import studentOrientation.enums.BookStore;

public interface BookStoreI {
    public void getCost(BookStore bookStoreIn);
    public void getEffort(BookStore bookStoreIn);
    public void getCarbonFootprint(BookStore bookStoreIn);
    public void getDuration(BookStore bookStoreIn);
}
