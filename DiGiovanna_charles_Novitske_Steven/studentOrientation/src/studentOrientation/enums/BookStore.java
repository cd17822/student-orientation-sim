public enum CourseAnalysis {
    cs240 (4, 81.5, 55),
    cs342 (4, 84.3, 35),
    cs654 (3, 79.8, 41);  // semi colon here

    private final int numCredits;
    private final double avgScore;
    private final int numStudents;
    private static final double NO_OF_EXAMS = 3;

  // Constructor
    CourseAnalysis(int numCreditsIn, double avgScoreIn, int numStudentsIn) {
    numCredits = numCreditsIn;
    avgScore = avgScoreIn;
    numStudents = numStudentsIn;
    }
