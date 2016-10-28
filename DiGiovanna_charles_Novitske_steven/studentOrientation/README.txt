CS442 Design Patterns
Spring 2011
ASSIGNMENT 3 README FILE

Due Date: 10/28/16
Submission Date: 10/28/16
Grace Period Used This Project: 0
Grace Period Remaining: 4
Authors: Charles DiGiovanna & Steven Novitske
Emails: cdigiov1@binghamton.edu & snovits1@binghamton.edu

PURPOSE:
[
  Construct a library for students to use in the Driver code to
  customize their Orientation using the Builder Pattern.
]

FILES:
[
  activities/   --Activity classes and their interfaces
    BuyBooks.java
    BuyBooksI.java
    RegisterClasses.java
    RegisterClassesI.java
    SelectDorm.java
    SelectDormI.java
    TourCampus.java
    TourCampusI.java
  attributes/   --Attribute classes and their interfaces
    CarbonFootprint.java
    CarbonFootprintI.java
    Cost.java
    CostI.java
    Duration.java
    DurationI.java
    Effort.java
    EffortI.java
  driver/      --Driver code with main
    Driver.java
  enums/       --Library of the acceptable enums
    BookStore.java
    CampusTour.java
    DormSelector.java
    Registration.java
  orientations/ --The orientation class and interface
    BUOrientation.java
    OrientationI.java
  util/         --Just the Logger class
    Logger.java
  workshops/    --The workshops to construct the orientation
    BUOrientationWorkshop.java
    OrientationWorkshopI.java
  build.xml     --ANT file
  README.txt    --The file you are reading
]

TO COMPILE:
[
  ant -buildfile build.xml all
]

TO RUN:
[
  ant -buildfile build.xml run
]

TO CLEAN:
[
  ant -buildfile build.xml clean
]
