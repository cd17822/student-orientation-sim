# student-orientation-sim
CS 442 - Assignment 3

##Notes:
- Builder Pattern

Activities
- Campus Tour
    - Bus ($2)
    - Foot ($.10)
- Buying Books
    - University Book Store
    - Mando Books
    - (Price diff  5%)
- Select Dorm
    - Queue
    - Gaming contest (2% surcharge)
- Register for Courses
    - Submit form to registrar office (3% cheaper)
    - EB computer lab

Each has
- duration (mins)
- cost ($)
- carbon footprint (CO2 tons)
- effort (calories)

**
Note that each activity should have an interface.
Note that time duration, carboon footprint, and cost should also have interfaces.
Use Enums, to the extent possible, to specify user choices.


Driver code:

Orientation orientation1 = new BUOrientation(MANDO_BOOKS, ON_FOOT, GAMING_CONTEST, SUBMIT_FORMS);

OrientationWorkshopInterface shop = new OrientationWorkshop();
shop.construct(orientation1);
