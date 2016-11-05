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

     Single(double studyingYears, boolean isLiveWithParents) {
        this.studyingYears = studyingYears;
        this.isLiveWithParents = isLiveWithParents;
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
}
