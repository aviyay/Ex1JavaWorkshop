 class Single extends CommunityMember{
    private double studyingYears;
    private boolean isLiveWithParents;

     Single(double studyingYears, boolean isLeaveWithParents,
                  String id, Gender gender, String name, String address, String birthday,
                  double weeklyToraStudyingHours, double weeklyWorkHours, double income,
                  Volunteering volunteering) throws Exception {
        super(id, gender, name, address, birthday, weeklyToraStudyingHours,
                weeklyWorkHours, income, volunteering);
        this.studyingYears = studyingYears;
        this.isLiveWithParents = isLeaveWithParents;
    }

     Single(double weeklyToraStudyingHours, double weeklyWorkHours) throws Exception {
         super(weeklyToraStudyingHours, weeklyWorkHours);
     }

     double getStudyingYears() {
        return studyingYears;
    }

     void setStudyingYears(double studyingYears) {
        this.studyingYears = studyingYears;
    }

     boolean isLiveWithParents() {
        return isLiveWithParents;
    }

     void setLiveWithParents(boolean liveWithParents) {
        isLiveWithParents = liveWithParents;
    }

    @Override
    public double getTax() {
        return 500;
    }

    @Override
    public double getScholarship() {
        return 0;
    }

    @Override
    public double getRecommendedVolunteeringHours() {
        return 10;
    }

     @Override
     public String toString() {
         StringBuilder result = new StringBuilder(super.toString());

         result.append("Is Live with parents: " + isLiveWithParents());
         result.append("\n");
         result.append("Number of studying years: " + getStudyingYears());
         result.append("\n");

         return result.toString();
     }
}
